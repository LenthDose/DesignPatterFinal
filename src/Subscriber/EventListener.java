package Subscriber;

import Warning.WarningStrategy;

/**
 * 观察者模式自定义监听器
 */
public interface EventListener {
    void update(WarningStrategy strategy);
}
