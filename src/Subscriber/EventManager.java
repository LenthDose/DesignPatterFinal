package Subscriber;

import Warning.WarningStrategy;

import java.util.ArrayList;

/**
 * 发布者管理订阅管理代码和通知方法
 */
public class EventManager {

    ArrayList<EventListener> listeners = new ArrayList<>();

    public void subscribe(EventListener listener){
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener){
        listeners.remove(listener);
    }

    public void notifyWarning(WarningStrategy strategy){
        for (EventListener listener :
                listeners) {
            listener.update(strategy);
        }
    }
}
