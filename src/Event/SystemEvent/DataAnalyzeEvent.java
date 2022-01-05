package Event.SystemEvent;

import Event.Abstract.SystemEvent;

/**
 * 数据分析系统事件
 */
public class DataAnalyzeEvent extends SystemEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public DataAnalyzeEvent(Object source) {
        super(source);
        SystemStart();
    }

    public void SystemStart(){
        System.out.println("数据分析系统启动");
    }

}
