package Warning;


/**
 * 所有策略的通用接口
 */
public interface WarningStrategy {

    void takeMeasure(String type);
    void TrafficPoliceWarning(String type);
    void AppWarning(String type);
    void FMWarning(String type);
    void EmergencyServiceAgencyWarning(String type);
}
