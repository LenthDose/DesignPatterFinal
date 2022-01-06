package Subscriber;

import Warning.WarningStrategy;

public class TrafficPoliceListener implements EventListener{

    @Override
    public void warning(WarningStrategy strategy,String type) {
        System.out.println("-----------------");
        System.out.println("向各交警发出预警");
        strategy.TrafficPoliceWarning(type);
    }
}
