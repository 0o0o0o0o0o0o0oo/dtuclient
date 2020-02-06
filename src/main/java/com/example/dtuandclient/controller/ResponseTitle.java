package com.example.dtuandclient.controller;

import com.example.dtuandclient.entity.CloudControll.DeviceData.Title.Title;
import com.example.dtuandclient.entity.CloudControll.User.RequestData;
import com.example.dtuandclient.entity.ErrCode.ResponseMessage;
import com.example.dtuandclient.entity.ErrCode.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseTitle {
    @RequestMapping(value = "/androidmssage/dtutitle", method = {RequestMethod.POST})
    @ResponseBody()
    public Object ResponesTitle(RequestData requestData){
        Title title =new Title();
        ResultUtil rs = new ResultUtil();
        ResponseMessage rp = rs.success(title);
        return rp;
    }
}
