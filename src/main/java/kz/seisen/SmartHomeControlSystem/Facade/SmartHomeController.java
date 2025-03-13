package kz.seisen.SmartHomeControlSystem.Facade;

import kz.seisen.SmartHomeControlSystem.AbstractFactory.AbstractSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.Composite.*;
import kz.seisen.SmartHomeControlSystem.Decorator.DeviceDecorator;
import kz.seisen.SmartHomeControlSystem.Decorator.PowerSavingModeDecorator;

import java.util.List;

public class SmartHomeController {

    // Subsystems (devices, composites, etc.)
    private Room livingRoom;

    // Constructor: Initialize the system using the factory
    public SmartHomeController(AbstractSmartHomeFactory factory) {
        // Create devices using the factory
        Device livingRoomLight = factory.createLight();
        TemperatureDevice livingRoomThermostat = factory.createThermostat();
        Device frontDoorLock = factory.createDoorLock();

        // Decorate devices (e.g., add power-saving mode to the light)
        //livingRoomLight = new PowerSavingModeDecorator(livingRoomLight);

        // Organize devices into a composite structure (room)
        this.livingRoom = new Room();
        livingRoom.addDevice(livingRoomLight);
        livingRoom.addDevice(livingRoomThermostat);
        livingRoom.addDevice(frontDoorLock);
    }

    // Add a device to the room dynamically
    public void addDeviceToRoom(Device device) {
        livingRoom.addDevice(device);
        System.out.println("Device added to the room.");
    }

    // Decorate a device dynamically
    public void decorateDevice(Device device, DeviceDecorator decorator) {
        livingRoom.replaceDevice(device, decorator);
        System.out.println("Device decorated with " + decorator.getClass().getSimpleName());
    }

    // Retrieve a device by name (e.g., "Light", "Thermostat")
    public Device getDeviceByName(String name) {
        for (Device device : livingRoom.getDevices()) {
            if (device.getClass().getSimpleName().equalsIgnoreCase(name)) {
                return device;
            }
        }
        return null;
    }

    // High-level method: Start evening routine
    public void startEveningRoutine() {
        System.out.println("Starting evening routine...");
        for (Device device : livingRoom.getDevices()) {
            device.turnOn();
        }
        System.out.println("Evening routine started!");
    }

    // High-level method: Start night routine
    public void startNightRoutine() {
        System.out.println("Starting night routine...");
        for (Device device : livingRoom.getDevices()) {
            device.turnOff();
        }
        System.out.println("Night routine started!");
    }

    // High-level method: Get home status
    public void getHomeStatus() {
        System.out.println("Get home status");
        livingRoom.getInfo();
    }
}