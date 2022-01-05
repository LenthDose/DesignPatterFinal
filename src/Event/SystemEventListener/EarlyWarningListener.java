package Event.SystemEventListener;

import Event.Abstract.SystemEvent;
import Event.Abstract.SystemEventListener;
import SubSystem.DataAnalyzeSystem;
import SubSystem.EarlyWarningSystem;

/**
 * 预警系统,调用显示结果
 */
public class EarlyWarningListener implements SystemEventListener {

    private static final DataAnalyzeSystem dataAnalyzeSystem = DataAnalyzeSystem.getInstance();
    private static final EarlyWarningSystem earlyWarningSystem = EarlyWarningSystem.getInstance();
    @Override
    public void handleEvent(SystemEvent e) {
        int level = dataAnalyzeSystem.getLevel();
        earlyWarningSystem.setLevel(level);
        boolean isNotify = true;
        if (!isNotify){
            earlyWarningSystem.TakingMeasure();
        }else{
            earlyWarningSystem.Change();
        }

    }
}
