package kz.seisen.SmartHomeControlSystem.AbstractFactory;


import kz.seisen.SmartHomeControlSystem.Composite.Device;

interface AbstractSmartHomeFactory {
    Device createLight();
    Device createThermostat();
}