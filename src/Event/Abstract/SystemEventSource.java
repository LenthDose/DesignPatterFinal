package Event.Abstract;

import java.util.ArrayList;

/**
 * 系统事件源，注册监听器，并调用监听器方法
 */
public class SystemEventSource {

    private final SystemEventListener listeners;

    public SystemEventSource(SystemEventListener systemEventListener) {
        this.listeners = systemEventListener;
    }

    /**
     * 激活监听器方法
     */
    public void activationSystemEventListener(SystemEvent event){
        listeners.handleEvent(event);
    }

}
