package Subscriber;

import Warning.WarningStrategy;

/**
 * 应急服务机构--订阅者
 */
public class EmergencyServiceAgencyListener implements EventListener {


    @Override
    public void warning(WarningStrategy strategy,String type) {
        System.out.println("-----------------");
        System.out.println("通知应急服务机构");
        strategy.EmergencyServiceAgencyWarning(type);
    }
}
