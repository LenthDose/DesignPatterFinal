package SubSystem;

import Subscriber.*;
import Warning.FirstLevel;
import Warning.SecondLevel;
import Warning.WarningStrategy;

/**
 * 预警系统
 */
public class EarlyWarningSystem {

    private static EarlyWarningSystem instance;
    private WarningStrategy strategy;
    private String type;

    private final EventManager eventManager = new EventManager();
    private boolean Notify = false;

    public EarlyWarningSystem() {
        subscribe();
        setNotify(true);
    }

    public void subscribe(){
        eventManager.subscribe(new AppListener());
        eventManager.subscribe(new FMListener());
        eventManager.subscribe(new TrafficPoliceListener());
        eventManager.subscribe(new EmergencyServiceAgencyListener());
    }

    public static EarlyWarningSystem getInstance(){
        if (instance == null){
            instance = new EarlyWarningSystem();
        }
        return instance;
    }

    /**
     * 根据数据分析系统的结果设置预警等级
     */
    public void setLevel(int level){
        if (level == 1){
            setStrategy(new FirstLevel());
        }else{
            setStrategy(new SecondLevel());
        }
    }

    /**
     * 采取措施
     */
    public void TakingMeasure(){
        strategy.takeMeasure(type);
    }

    /**
     * 广播预警
     */
    public void NotifyWarning(){
        System.out.println("无法采取建议措施");
        eventManager.notifyWarning(strategy,type);
    }

    /**
     * 设置预警等级
     */
    public void setStrategy(WarningStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 是否广播预警
     */
    public boolean isNotify() {
        return Notify;
    }

    public void setNotify(boolean notify) {
        Notify = notify;
    }

    public void setType(String type) {
        this.type = type;
    }
}
