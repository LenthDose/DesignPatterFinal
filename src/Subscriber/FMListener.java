package Subscriber;

import Warning.WarningStrategy;

public class FMListener implements EventListener{

    @Override
    public void warning(WarningStrategy strategy,String type) {
        System.out.println("-----------------");
        System.out.println("向汽车广播频道发出预警");
        strategy.FMWarning(type);
    }
}
