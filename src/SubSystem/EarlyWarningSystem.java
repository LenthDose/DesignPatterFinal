package SubSystem;

import Subscriber.EmergencyServiceAgencyListener;
import Subscriber.EventManager;
import Subscriber.EveryoneListener;
import Warning.FirstLevel;
import Warning.SecondLevel;
import Warning.WarningStrategy;

/**
 * 预警系统
 */
public class EarlyWarningSystem {

    private static EarlyWarningSystem instance;
    private WarningStrategy strategy;
    private final EventManager eventManager = new EventManager();

    public EarlyWarningSystem() {
        eventManager.subscribe(new EveryoneListener());
        eventManager.subscribe(new EmergencyServiceAgencyListener());
    }

    public static EarlyWarningSystem getInstance(){
        if (instance == null){
            instance = new EarlyWarningSystem();
        }
        return instance;
    }

    public void setLevel(int level){
        if (level == 1){
            setStrategy(new FirstLevel());
        }else{
            setStrategy(new SecondLevel());
        }
    }

    public void TakingMeasure(){
        strategy.takeMeasure();
    }

    public void Change(){
        System.out.println("无法采取建议措施");
        eventManager.notifyWarning(strategy);
    }
    public void setStrategy(WarningStrategy strategy) {
        this.strategy = strategy;
    }


}
