package Event.Abstract;

import java.util.EventListener;

/**
 * 自定义事件监听器
 */
public interface SystemEventListener extends EventListener {

    void handleEvent(SystemEvent e);
}
