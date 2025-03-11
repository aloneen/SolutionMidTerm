package kz.seisen.SmartHomeControlSystem.Composite;

public class YandexThermostat implements TemperatureDevice{
    private String version;
    private String name;
    private double temperature;

    public YandexThermostat(String version, double temperature) {
        this.version = version;
        this.name = "Alice";
        this.temperature = temperature;
    }
    public YandexThermostat() {
        this.version = "1.0";
        this.name = "Alice";
        this.temperature = 0.0;
    }

    @Override
    public void turnOn() {
        System.out.println("Yandex " + this.name + " is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Yandex " + this.name + " is off");
    }

    @Override
    public void getInfo() {
        System.out.println("Yandex " + this.name + "version: " + this.version + " temperature: " + this.temperature);
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
