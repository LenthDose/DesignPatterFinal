package Event.SystemEventListener;

import Event.Abstract.SystemEvent;
import Event.Abstract.SystemEventListener;
import Event.Abstract.SystemEventSource;
import Event.SystemEvent.DataAnalyzeEvent;
import SubSystem.DataAnalyzeSystem;

/**
 * 数据收集系统事件监听器，发送请求调用数据分析系统
 */
public class DataCollectListener implements SystemEventListener {

    private static final DataAnalyzeSystem dataAnalyzeSystem = DataAnalyzeSystem.getInstance();
    private static final DataAnalyzeListener dataAnalyzeListener = new DataAnalyzeListener();

    @Override
    public void handleEvent(SystemEvent e) {
        System.out.println("进行数据收集中....");
        System.out.println("数据收集完成");
        System.out.println("-----------------");
        SystemEventSource source = new SystemEventSource(dataAnalyzeListener);
        source.activationSystemEventListener(new DataAnalyzeEvent(dataAnalyzeSystem));
    }

}
