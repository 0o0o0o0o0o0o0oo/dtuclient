package com.example.dtuandclient.entity.CloudControll.DeviceData.PanelMonitorDate.PanelMonitorKindOfDate;

import com.example.dtuandclient.entity.CloudControll.CloudControll;
import lombok.Data;

@Data
public class SetCloudControllPanelMonitorDate implements CloudControll {
    private String pumpName;
    private String runTime;
}
