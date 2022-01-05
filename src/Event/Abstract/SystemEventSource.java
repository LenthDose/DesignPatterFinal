package Event.Abstract;

import java.util.ArrayList;

/**
 * 系统事件源,管理全局的事件,当事件发生,需要注册事件监听器,以执行事件发生后的操作
 */
public class SystemEventSource {

    private final SystemEventListener listeners;

    /**
     * 将发生事件的监听器注册
     */
    public SystemEventSource(SystemEventListener systemEventListener) {
        this.listeners = systemEventListener;
    }

    /**
     * 激活监听器的执行方法
     */
    public void activationSystemEventListener(SystemEvent event){
        listeners.handleEvent(event);
    }

}
