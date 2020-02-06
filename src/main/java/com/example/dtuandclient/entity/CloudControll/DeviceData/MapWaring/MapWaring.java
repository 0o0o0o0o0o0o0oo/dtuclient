package com.example.dtuandclient.entity.CloudControll.DeviceData.MapWaring;

import com.example.dtuandclient.entity.CloudControll.CloudControll;

import lombok.Data;

@Data
public class MapWaring implements CloudControll {

    private String projectId;//设备Id

    private String projectName;//设备Id

    private String address;


    private String device;

    private String runningMode;

    private String runningStatue;

    private String la;  //纬度

    private String lt; //经度

}