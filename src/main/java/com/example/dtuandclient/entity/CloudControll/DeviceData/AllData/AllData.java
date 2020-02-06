package com.example.dtuandclient.entity.CloudControll.DeviceData.AllData;

import com.example.dtuandclient.entity.CloudControll.CloudControll;
import lombok.Data;

@Data
public class AllData implements CloudControll {
    private String projectNo; //项目编号
    private String projectName;//项目名称
    private String deviceNo;//设备编号
    private String deviceName; //设备名称
    private String installPosition;//安装位置
    private String controlCode;  //控制编码
    private String installDate; //安装时间
    private String warningType; //预警类型
}