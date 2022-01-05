package Event.SystemEvent;

import Event.Abstract.SystemEvent;

/**
 * 预警事件
 */
public class EarlyWarningEvent extends SystemEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public EarlyWarningEvent(Object source) {
        super(source);
        SystemStart();
    }

    public void SystemStart(){
        System.out.println("预警系统启动");
    }
}
