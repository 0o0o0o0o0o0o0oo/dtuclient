package com.example.dtuandclient.controller;

import com.example.dtuandclient.entity.CloudControll.DeviceData.PanelMonitorDate.PanelMonitorDate;
import com.example.dtuandclient.entity.CloudControll.User.RequestData;
import com.example.dtuandclient.entity.ErrCode.ResponseMessage;
import com.example.dtuandclient.entity.ErrCode.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResonsePanelMonitorDate {
    @RequestMapping(value = "/androidmssage/dtupanelmonitordate", method = {RequestMethod.POST})
    @ResponseBody()
    public Object ResonesPanelMonitorDate(RequestData requestData){
        PanelMonitorDate panelMonitorDate = new PanelMonitorDate();
        panelMonitorDate.setPumps(panelMonitorDate.ReturnNewPumpsData());
        ResultUtil rs = new ResultUtil();
        ResponseMessage rp = rs.success(panelMonitorDate);
        return rp;
    }
}
