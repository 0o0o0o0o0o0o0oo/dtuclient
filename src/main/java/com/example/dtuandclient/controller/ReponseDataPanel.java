package com.example.dtuandclient.controller;

import com.example.dtuandclient.entity.CloudControll.DeviceData.AllWaring.AllWaring;
import com.example.dtuandclient.entity.CloudControll.DeviceData.DataPanel.DataPanel;
import com.example.dtuandclient.entity.CloudControll.User.RequestData;
import com.example.dtuandclient.entity.ErrCode.ResponseMessage;
import com.example.dtuandclient.entity.ErrCode.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReponseDataPanel {
    @RequestMapping(value = "/androidmssage/dtudatapanel", method = {RequestMethod.POST})
    @ResponseBody()
    public Object ResponesDataPanel(RequestData requestData){
//        if (requestData.getRequestTo()==null){
//            return null;
//        }
        DataPanel dataPanel = new DataPanel();
        dataPanel.setInPressure(dataPanel.NewDataPanelConfig());
        dataPanel.setFlow(dataPanel.NewDataPanelConfig());
        dataPanel.setOutPressure(dataPanel.NewDataPanelConfig());
        dataPanel.setPumps(dataPanel.ListForDataPanelConfig());
        ResultUtil rs = new ResultUtil();
        ResponseMessage rp = rs.success(dataPanel);
        return rp;
    }
}
