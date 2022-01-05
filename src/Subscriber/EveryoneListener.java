package Subscriber;


import Warning.WarningStrategy;

/**
 * 全体监听器
 */
public class EveryoneListener implements EventListener{

    @Override
    public void update(WarningStrategy strategy) {
        System.out.println("---------------");
        System.out.println("向全体广播预警");
        strategy.NotifyMessage();
    }
}
