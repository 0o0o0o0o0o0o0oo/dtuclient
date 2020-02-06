package com.example.dtuandclient.entity.CloudControll.DeviceData.AllWaring;

import com.example.dtuandclient.entity.CloudControll.CloudControll;
import lombok.Data;

@Data
public class AllWaring implements CloudControll {
    private String projectName;
    private String deviceName;
    private String warningName;
    private String warningHandle;
}