package Warning;

/**
 * 二级预警
 */
public class SecondLevel implements WarningStrategy {
    @Override
    public void takeMeasure() {
        System.out.println("可能发生二级预警事件，建议采取二级预警紧急措施");
    }

    @Override
    public void NotifyMessage() {
        System.out.println("此次事件为一级预警，请个单位做好应对准备");
    }
}
