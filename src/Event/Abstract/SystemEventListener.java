package Event.Abstract;

import java.util.EventListener;

/**
 * 自定义事件监听器,监听到事件发生做出执行操作
 */
public interface SystemEventListener extends EventListener {

    void handleEvent(SystemEvent e);
}
