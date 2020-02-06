package com.example.dtuandclient.controller;

import com.example.dtuandclient.entity.CloudControll.CloudControll;
import com.example.dtuandclient.entity.CloudControll.User.CloudControllUser;
import com.example.dtuandclient.entity.ErrCode.ResponseMessage;
import com.example.dtuandclient.entity.ErrCode.ResultUtil;
import com.example.dtuandclient.service.Commonservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.UUID;

@Controller
public class UserLogin {
    @Autowired
    public Commonservice commonservice;

    //登录验证并返回了token
    @RequestMapping(value = "/androidmssage/validateuser", method = {RequestMethod.POST})
    @ResponseBody()
    public Object UserPasswordAndAccount(CloudControllUser clientdata) {
        String account = clientdata.getAccount();
        String password = clientdata.getPassword();
        ResultUtil rs = new ResultUtil();
        if (account == null) {
            ResponseMessage rp = rs.UserNotExist();
            return rp;
        }
        if (password == null) {
            ResponseMessage rp = rs.PasswordError();
            return rp;
        }
        ArrayList<CloudControllUser> retclientmsg = commonservice.FindAllDataFromUser();
        for (CloudControllUser userlist : retclientmsg) {
            if (account != null && password != null) {
                if (userlist.getPassword().equals(password) && userlist.getAccount().equals(account)) {
                    String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                    try {
                        MessageDigest md5 = MessageDigest.getInstance("MD5");
                        BASE64Encoder base64en = new BASE64Encoder();
                        //加密后的字符串
                        String newstr = base64en.encode(md5.digest(uuid.getBytes("utf-8")));
                        ResponseMessage rp = rs.success(newstr);
                        return rp;
                    } catch (NoSuchAlgorithmException e) {

                    } catch (UnsupportedEncodingException e) {

                    }
                }
            }
        }
        return null;
    }

}
