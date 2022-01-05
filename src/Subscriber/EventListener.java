package Subscriber;

import Warning.WarningStrategy;

/**
 * 订阅者接口
 * 声明了通知接口
 */
public interface EventListener {
    void update(WarningStrategy strategy);
}
