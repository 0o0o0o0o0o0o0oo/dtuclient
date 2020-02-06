package com.example.dtuandclient.controller;

import com.example.dtuandclient.entity.CloudControll.DeviceData.DataPanel.DataPanel;
import com.example.dtuandclient.entity.CloudControll.DeviceData.MapWaring.MapWaring;
import com.example.dtuandclient.entity.CloudControll.User.RequestData;
import com.example.dtuandclient.entity.ErrCode.ResponseMessage;
import com.example.dtuandclient.entity.ErrCode.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReponseMapWaring {
    @RequestMapping(value = "/androidmssage/dtumapwaring", method = {RequestMethod.POST})
    @ResponseBody()
    public Object ResponesMapWaring(RequestData requestData){
        MapWaring mapWaring = new MapWaring();
        ResultUtil rs = new ResultUtil();
        ResponseMessage rp = rs.success(mapWaring);
        return rp;
    }

}
