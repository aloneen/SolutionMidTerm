package kz.seisen.SmartHomeControlSystem.AbstractFactory;

import kz.seisen.SmartHomeControlSystem.Composite.Device;
import kz.seisen.SmartHomeControlSystem.Composite.Light;

import kz.seisen.SmartHomeControlSystem.Composite.Thermostat;

public class BasicSmartHomeFactory implements AbstractSmartHomeFactory {
    public Device createLight() {
        return new Light();
    }
    public Device createThermostat() {
        return new Thermostat();
    }
}