package Subscriber;

import Warning.WarningStrategy;

import java.util.ArrayList;

/**
 * 发布者管理订阅管理代码和通知方法
 */
public class EventManager {

    private final ArrayList<EventListener> listeners = new ArrayList<>();

    /**
     * 添加订阅者
     */
    public void subscribe(EventListener listener){
        listeners.add(listener);
    }

    /**
     * 取消订阅者
     */
    public void unsubscribe(EventListener listener){
        listeners.remove(listener);
    }

    /**
     * 当新事件发生，遍历订阅列表并调用每个订阅者对象的通知方法
     */
    public void notifyWarning(WarningStrategy strategy){
        for (EventListener listener :
                listeners) {
            listener.update(strategy);
        }
    }
}
