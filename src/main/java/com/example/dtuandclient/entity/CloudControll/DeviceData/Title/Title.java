package com.example.dtuandclient.entity.CloudControll.DeviceData.Title;

import com.example.dtuandclient.entity.CloudControll.CloudControll;
import lombok.Data;

@Data
public class Title implements CloudControll {
    private String title;
    private String content;
}
