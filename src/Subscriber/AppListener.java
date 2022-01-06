package Subscriber;

import Warning.WarningStrategy;

public class AppListener implements EventListener{


    @Override
    public void warning(WarningStrategy strategy,String type) {
        System.out.println("-----------------");
        System.out.println("向App平台发出预警");
        strategy.AppWarning(type);
    }
}
