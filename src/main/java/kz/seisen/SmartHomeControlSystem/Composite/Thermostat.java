package kz.seisen.SmartHomeControlSystem.Composite;

public class Thermostat implements TemperatureDevice{

    private double temperature;

    public Thermostat(double temperature) {
        this.temperature = temperature;
    }
    public Thermostat() {}


    @Override
    public void turnOn() {
        System.out.println("Termostat ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Termostat OFF");
    }

    @Override
    public void getInfo() {
        System.out.println("Temperature: " + temperature);
    }


    public double getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
