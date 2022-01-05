package SubSystem;

import Iterator.DataIterator;
import Iterator.SensorCollection;

/**
 * 数据分析系统
 */
public class DataAnalyzeSystem {

    private static DataAnalyzeSystem instance;
    private static int level;
    private boolean isTurnOnSystem = false;
    private final DataCollectSystem dataCollectSystem = DataCollectSystem.getInstance();

    public DataAnalyzeSystem() {
        Analyze();
    }

    public void Analyze(){
        DataIterator iterator = new SensorCollection(dataCollectSystem.getSensorData()).createIterator();
//        while (iterator.isLast()){
//            String result = iterator.getNext()+dataCollectSystem.getEnvironmentData()
//                    +dataCollectSystem.getHistoryData();
//        }
        level = 1;
    }

    public boolean Notify(){
        if (level > 0.8){
            System.out.println("发现潜在问题,超过一级阈值");
            isTurnOnSystem = true;
        }else if (level > 0.6 && level < 0.8){
            System.out.println("发现潜在问题,超过二级阈值");
            isTurnOnSystem = true;
        }else {
            System.out.println("未发现潜在问题");
        }
        return isTurnOnSystem;
    }

    /**
     * 单例模式
     */
    public static DataAnalyzeSystem getInstance(){
        if (instance == null){
            instance = new DataAnalyzeSystem();
        }
        return instance;
    }

    public int getLevel() {
        return level;
    }
}
