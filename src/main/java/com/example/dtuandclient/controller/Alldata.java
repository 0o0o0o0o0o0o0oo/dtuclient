package com.example.dtuandclient.controller;

import com.example.dtuandclient.entity.CloudControll.DeviceData.AllData.AllData;
import com.example.dtuandclient.entity.CloudControll.User.RequestData;
import com.example.dtuandclient.entity.ErrCode.ResponseMessage;
import com.example.dtuandclient.entity.ErrCode.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Alldata {
    @RequestMapping(value = "/androidmssage/dtualldata", method = {RequestMethod.POST})
    @ResponseBody()
    public Object ReturnAllData(RequestData requestData){
        System.out.println("ddddddddddd="+requestData);
//        if (requestData.getRequestTo() == null){
//            return null;
//        }
        AllData allData=new AllData();
        ResultUtil rs = new ResultUtil();
        ResponseMessage rp = rs.success(allData);
        return rp;
    }
}
