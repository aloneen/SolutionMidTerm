package kz.seisen.SmartHomeControlSystem.AbstractFactory;

import kz.seisen.SmartHomeControlSystem.Composite.Device;
import kz.seisen.SmartHomeControlSystem.Composite.SmartLight;
import kz.seisen.SmartHomeControlSystem.Composite.YandexThermostat;

public class AdvancedSmartHomeFactory implements AbstractSmartHomeFactory {
    @Override
    public Device createThermostat() {
        return new YandexThermostat();
    }

    @Override
    public Device createLight() {
        return new SmartLight();
    }
}
