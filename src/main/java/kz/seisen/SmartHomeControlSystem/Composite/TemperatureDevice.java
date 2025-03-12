package kz.seisen.SmartHomeControlSystem.Composite;


// This interface for devices with temperature stuff. Like thermostat and YandexThermostat
public interface TemperatureDevice extends Device{
    void setTemperature(double temperature);
}
