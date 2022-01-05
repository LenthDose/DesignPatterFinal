package Event.SystemEventListener;

import Event.Abstract.SystemEvent;
import Event.Abstract.SystemEventListener;
import SubSystem.DataAnalyzeSystem;
import SubSystem.EarlyWarningSystem;

/**
 * 预警系统事件监听器,显示系统结果
 */
public class EarlyWarningListener implements SystemEventListener {

    private static final DataAnalyzeSystem dataAnalyzeSystem = DataAnalyzeSystem.getInstance();
    private static final EarlyWarningSystem earlyWarningSystem = EarlyWarningSystem.getInstance();

    @Override
    public void handleEvent(SystemEvent e) {
        earlyWarningSystem.setLevel(dataAnalyzeSystem.getLevel());
        if (dataAnalyzeSystem.isTurnOnSystem()){
            if (earlyWarningSystem.isNotify()){
                earlyWarningSystem.NotifyWarning();
            }else{
                earlyWarningSystem.TakingMeasure();
            }
        }
    }
}
