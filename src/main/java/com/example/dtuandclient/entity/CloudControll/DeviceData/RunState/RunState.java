package com.example.dtuandclient.entity.CloudControll.DeviceData.RunState;

import com.example.dtuandclient.entity.CloudControll.CloudControll;
import lombok.Data;

import java.util.ArrayList;
@Data
public class RunState implements CloudControll {
    public ArrayList<PumpsData> ReturnListRunStateAboutPumpsData(){
        ArrayList<PumpsData> pumpsData = new ArrayList<>();
        pumpsData.add(new PumpsData());
        return pumpsData;
    }
    private String systemStatue;
    private String runningStatue;
    private String mainPump;
    private String frequency;
    private String outFlow;
    private String targetPressure;
    private ArrayList<PumpsData> pump;
}
@Data
class PumpsData{
    private String pumpName;
    private String runningTime;

}
