package com.example.dtuandclient.serverlistener;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class serverlisten {
    public void DtuServerListen() {
        System.out.println("[+] Server Listen is running!");
        //为了简单起见，所有的异常信息都往外抛
        int port = 50000;
        //定义一个ServerSocket监听在端口8899上
        try {
            ServerSocket server = new ServerSocket(port);
            while (true) {
                //server尝试接收其他Socket的连接请求，server的accept方法是阻塞式的
                Socket socket = server.accept();
                System.out.println("[+] Ready Get Client Msg Now!!");
                //每接收到一个Socket就建立一个新的线程来处理它
                new Thread(new Task(socket)).start();
            }
        } catch (IOException e) {
        }
    }


    static class Task implements Runnable {

        private Socket socket;


        public Task(Socket socket) {
            this.socket = socket;

        }


        public void run() {
            try {
                handleSocket();
            } catch (Exception e) {
                e.printStackTrace();

            }

        }


        /**
         * 36        * 跟客户端Socket进行通信
         * 37       * @throws Exception
         * 38
         */
        private void handleSocket() {
            try {
                InputStream is = socket.getInputStream();
                byte[] bytes = new byte[1]; // 一次读取2048个byte
                String ret = "";
                while (is.read(bytes) != -1) {
                    ret += bytesToHexString(bytes) + " ";
                    if (ret.length() > 5) {
                        if (ret.substring(0, 5).indexOf("ff ff") != -1) {
                            if (ret.substring(5, ret.length()).indexOf("ff ff") != -1) {
                                System.out.println("[+] Client Msg:" + ret);
                                break;
                            }
                        }
                    }
                }
                ret = "";
            } catch (IOException e) {

            }
        }

        public static String bytesToHexString(byte[] bytes) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                String hex = Integer.toHexString(0xFF & bytes[i]);
                if (hex.length() == 1) {
                    sb.append('0');
                }
                sb.append(hex);
            }
            return sb.toString();
        }
    }
}
