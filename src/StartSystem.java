import Event.Abstract.SystemEventSource;
import Event.SystemEvent.DataCollectEvent;
import Event.SystemEventListener.DataCollectListener;

import SubSystem.DataCollectSystem;

/**
 * 系统启动入口
 */
public class StartSystem {

    private static final DataCollectSystem dataCollectSystem = DataCollectSystem.getInstance();
    private static final DataCollectListener dataCollectListener = new DataCollectListener();

    public StartSystem() {
        SystemEventSource source = new SystemEventSource(dataCollectListener);
        source.activationSystemEventListener(new DataCollectEvent(dataCollectSystem));
    }

}
