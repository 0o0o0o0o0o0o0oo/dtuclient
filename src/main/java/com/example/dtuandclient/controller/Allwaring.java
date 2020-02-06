package com.example.dtuandclient.controller;

import com.example.dtuandclient.entity.CloudControll.DeviceData.AllWaring.AllWaring;
import com.example.dtuandclient.entity.CloudControll.User.RequestData;
import com.example.dtuandclient.entity.ErrCode.ResponseMessage;
import com.example.dtuandclient.entity.ErrCode.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Allwaring {
    @RequestMapping(value = "/androidmssage/dtuallwaring", method = {RequestMethod.POST})
    @ResponseBody()
    public Object ResponesAllwaring(RequestData requestData){
//        if (requestData.getRequestTo() == null){
//            return null;
//        }
        AllWaring allWaring = new AllWaring();
        ResultUtil rs = new ResultUtil();
        ResponseMessage rp = rs.success(allWaring);
        return rp;
    }
}