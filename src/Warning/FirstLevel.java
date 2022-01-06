package Warning;

import java.lang.String;

/**
 * 一级预警
 */
public class FirstLevel implements WarningStrategy {


    @Override
    public void takeMeasure(String type) {
        System.out.println("出现"+type+"可能发生一级预警事件，建议立即采取一级预警紧急措施");
    }

    @Override
    public void TrafficPoliceWarning(String type) {
        System.out.println("出现"+type+"请做好应对准备");
    }

    @Override
    public void AppWarning(String type) {
        System.out.println("出现"+type+"请各司机注意前方路况");
    }

    @Override
    public void FMWarning(String type) {
        System.out.println("出现"+type+"请各司机注意前方路况");
    }

    @Override
    public void EmergencyServiceAgencyWarning(String type) {
        System.out.println("出现"+type+"请做好应对准备");
    }
}
