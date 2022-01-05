package Subscriber;

import Warning.WarningStrategy;

/**
 * 应急服务机构监听器
 */
public class EmergencyServiceAgencyListener implements EventListener {

    @Override
    public void update(WarningStrategy strategy) {
        System.out.println("---------------");
        System.out.println("向应急服务机构广播预警");
        strategy.NotifyMessage();
    }

}
