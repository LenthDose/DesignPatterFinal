package SubSystem;

import Entity.EnvironmentData;
import Entity.HistoryData;
import Entity.SensorData;

import java.util.ArrayList;

/**
 * 数据收集系统
 */
public class DataCollectSystem {

    private ArrayList<String> SensorData;
    private String HistoryData;
    private String EnvironmentData;

    private static DataCollectSystem instance;


    public DataCollectSystem() {
    }

    public static DataCollectSystem getInstance(){
        if (instance == null){
            instance = new DataCollectSystem();
        }
        return instance;
    }

    public void CollectData(){
        setSensorData();
        setHistoryData();
        setEnvironmentData();
    }
    public ArrayList<String> getSensorData() {
        return SensorData;
    }

    public String getHistoryData() {
        return HistoryData;
    }

    public String getEnvironmentData() {
        return EnvironmentData;
    }

    public void setEnvironmentData() {
        EnvironmentData = new EnvironmentData().getData();
    }

    public void setSensorData() {
        SensorData = new SensorData().getData();
    }

    public void setHistoryData() {
        HistoryData = new HistoryData().getData();
    }

}
