package kz.seisen.SmartHomeControlSystem.AbstractFactory;

import kz.seisen.SmartHomeControlSystem.Adapter.LegacyDoorLock;
import kz.seisen.SmartHomeControlSystem.Adapter.LegacyDoorLockAdapter;
import kz.seisen.SmartHomeControlSystem.Composite.Device;
import kz.seisen.SmartHomeControlSystem.Composite.SmartLight;
import kz.seisen.SmartHomeControlSystem.Composite.TemperatureDevice;
import kz.seisen.SmartHomeControlSystem.Composite.YandexThermostat;

public class AdvancedSmartHomeFactory implements AbstractSmartHomeFactory {
    @Override
    public TemperatureDevice createThermostat() {
        return new YandexThermostat();
    }

    @Override
    public Device createLight() {
        return new SmartLight();
    }

    @Override
    public Device createDoorLock() {
        return new LegacyDoorLockAdapter(new LegacyDoorLock());
    }
}
