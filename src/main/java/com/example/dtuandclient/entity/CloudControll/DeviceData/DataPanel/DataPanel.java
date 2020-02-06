package com.example.dtuandclient.entity.CloudControll.DeviceData.DataPanel;

import com.example.dtuandclient.entity.CloudControll.CloudControll;
import lombok.Data;

import java.util.ArrayList;

@Data
public class DataPanel implements CloudControll {
    public DataPanelConfig NewDataPanelConfig(){
        return new DataPanelConfig();
    }
    public ArrayList<DataPanelConfig> ListForDataPanelConfig(){
        ArrayList<DataPanelConfig> dataPanelConfigs = new ArrayList<>();
        dataPanelConfigs.add(new DataPanelConfig());
        return dataPanelConfigs;
    }
    private DataPanelConfig inPressure;
    private DataPanelConfig outPressure;
    private DataPanelConfig flow;
    private ArrayList<DataPanelConfig> pumps;
}
@Data
class DataPanelConfig{
    private String maxValue;
    private String displayUnit;
    private String dispalyText;
    private String lowerLoadMaxValue;
    private String perfectLoadMaxValuel;
}