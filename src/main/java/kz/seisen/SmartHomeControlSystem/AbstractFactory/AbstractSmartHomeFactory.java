package kz.seisen.SmartHomeControlSystem.AbstractFactory;


import kz.seisen.SmartHomeControlSystem.Composite.Device;
import kz.seisen.SmartHomeControlSystem.Composite.TemperatureDevice;

public interface AbstractSmartHomeFactory {
    Device createLight();
    TemperatureDevice createThermostat();
    Device createDoorLock();
}