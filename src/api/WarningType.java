package api;

public enum WarningType {
    LargeVehicle("大型车辆事故"),
    BadWeather("恶劣天气"),
    Accident("交通事故");

    private final String type;

    WarningType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
