package kz.seisen.SmartHomeControlSystem.AbstractFactory;

import kz.seisen.SmartHomeControlSystem.Adapter.LegacyDoorLock;
import kz.seisen.SmartHomeControlSystem.Adapter.LegacyDoorLockAdapter;
import kz.seisen.SmartHomeControlSystem.Composite.Device;
import kz.seisen.SmartHomeControlSystem.Composite.Light;

import kz.seisen.SmartHomeControlSystem.Composite.TemperatureDevice;
import kz.seisen.SmartHomeControlSystem.Composite.Thermostat;

public class BasicSmartHomeFactory implements AbstractSmartHomeFactory {
    @Override
    public Device createLight() {
        return new Light();
    }
    @Override
    public TemperatureDevice createThermostat() {
        return new Thermostat();
    }
    @Override
    public Device createDoorLock() {
        return new LegacyDoorLockAdapter(new LegacyDoorLock());
    }
}