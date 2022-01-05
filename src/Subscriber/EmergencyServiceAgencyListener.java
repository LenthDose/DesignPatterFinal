package Subscriber;

import Warning.WarningStrategy;

/**
 * 应急服务机构--订阅者
 */
public class EmergencyServiceAgencyListener implements EventListener {

    @Override
    public void update(WarningStrategy strategy) {
        System.out.println("---------------");
        System.out.println("向应急服务机构广播预警");
        strategy.NotifyMessage();
    }

}
