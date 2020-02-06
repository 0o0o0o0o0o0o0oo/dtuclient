package com.example.dtuandclient.entity.CloudControll.DeviceData.PanelMonitorDate;

import com.example.dtuandclient.entity.CloudControll.CloudControll;
import lombok.Data;

import java.util.ArrayList;
//用于项目的实时数据监控，显示到仪表盘上
@Data
public class PanelMonitorDate implements CloudControll {
    public ArrayList<PumpsData> ReturnNewPumpsData(){
        ArrayList<PumpsData> pumpsData = new ArrayList<PumpsData>();
        pumpsData.add(new PumpsData());
        return pumpsData;
    }
    private String warningStatue;
    private String warningText;
    private String targerPressure;
    private String projectStatue;
    private String inPressure;
    private String outPressure;
    private String flow;
    private ArrayList<PumpsData> pumps;
}
@Data
class PumpsData{
    private String pumpName;
    private String value;
    private String statue;
}
