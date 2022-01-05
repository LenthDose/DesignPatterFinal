package Event.Abstract;

import java.util.EventObject;

/**
 * 自定义系统事件
 */
public class SystemEvent extends EventObject {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public SystemEvent(Object source) {
        super(source);
    }

}
