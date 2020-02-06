package com.example.dtuandclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;
import com.example.dtuandclient.serverlistener.serverlisten;

import java.util.Set;


//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
@MapperScan("com.example.dtuandclient.mapper")
public class DtuandclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DtuandclientApplication.class, args);
        new serverlisten().DtuServerListen();
    }
}
