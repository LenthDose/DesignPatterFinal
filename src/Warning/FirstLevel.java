package Warning;

/**
 * 一级预警
 */
public class FirstLevel implements WarningStrategy {

    @Override
    public void takeMeasure() {
        System.out.println("可能发生一级预警事件，建议采取一级预警紧急措施");
    }


    @Override
    public void NotifyMessage() {
        System.out.println("此次事件为一级预警，请个单位做好应对准备");
    }
}
