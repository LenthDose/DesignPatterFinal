package Event.SystemEventListener;

import Event.Abstract.SystemEvent;
import Event.Abstract.SystemEventListener;
import Event.Abstract.SystemEventSource;
import Event.SystemEvent.EarlyWarningEvent;
import SubSystem.DataAnalyzeSystem;
import SubSystem.EarlyWarningSystem;

/**
 * 数据分析事件监听器，发送请求调用预警系统
 */
public class DataAnalyzeListener implements SystemEventListener {

    private static final DataAnalyzeSystem dataAnalyzeSystem = DataAnalyzeSystem.getInstance();
    private static final EarlyWarningSystem earlyWarningSystem = EarlyWarningSystem.getInstance();
    private static final EarlyWarningListener earlyWarningListener = new EarlyWarningListener();

    @Override
    public void handleEvent(SystemEvent e) {
        System.out.println("进行数据分析中....");
        System.out.println("数据分析完成");
        System.out.println("-----------------");
        boolean isTurnOn = dataAnalyzeSystem.Notify();
        if (isTurnOn){
            SystemEventSource source = new SystemEventSource(earlyWarningListener);
            source.activationSystemEventListener(new EarlyWarningEvent(earlyWarningSystem));
        }
    }
}
