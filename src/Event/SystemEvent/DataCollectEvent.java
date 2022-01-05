package Event.SystemEvent;

import Event.Abstract.SystemEvent;

/**
 * 数据收集事件
 */
public class DataCollectEvent extends SystemEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public DataCollectEvent(Object source) {
        super(source);
        SystemStart();
    }

    public void SystemStart(){
        System.out.println("数据收集系统启动");
    }

}
