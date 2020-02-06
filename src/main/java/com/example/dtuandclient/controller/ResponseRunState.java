package com.example.dtuandclient.controller;

import com.example.dtuandclient.entity.CloudControll.DeviceData.PanelMonitorDate.PanelMonitorDate;
import com.example.dtuandclient.entity.CloudControll.DeviceData.RunState.RunState;
import com.example.dtuandclient.entity.CloudControll.User.RequestData;
import com.example.dtuandclient.entity.ErrCode.ResponseMessage;
import com.example.dtuandclient.entity.ErrCode.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseRunState {
    @RequestMapping(value = "/androidmssage/dturunstate", method = {RequestMethod.POST})
    @ResponseBody()
    public Object ReponesRunState(RequestData requestData){
        RunState runState = new RunState();
        runState.setPump(runState.ReturnListRunStateAboutPumpsData());
        ResultUtil rs = new ResultUtil();
        ResponseMessage rp = rs.success(runState);
        return rp;
    }
}
