package kz.seisen.SmartHomeControlSystem.AbstractFactory;


import kz.seisen.SmartHomeControlSystem.Composite.Device;
import kz.seisen.SmartHomeControlSystem.Composite.TemperatureDevice;


//Abstract Factory Method
public interface AbstractSmartHomeFactory {
    Device createLight();
    TemperatureDevice createThermostat();
    Device createDoorLock();
}