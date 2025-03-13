package kz.seisen.SmartHomeControlSystem.Composite;

import kz.seisen.SmartHomeControlSystem.Decorator.DeviceDecorator;

import java.util.ArrayList;
import java.util.List;


// Composite - (Container) itself.
public class Room implements Device{

    private List<Device> devices = new ArrayList<>();


    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void turnOn() {
        for (Device device : devices) device.turnOn();
    }
    @Override
    public void turnOff() {
        for (Device device : devices) device.turnOff();
    }
    @Override
    public void getInfo() {
        System.out.println( "Room: " + devices.size() + " devices" );
        for (Device device : devices) device.getInfo();
    }

    public List<Device> getDevices() {
        return devices;
    }

    // Replace a device with its decorated version
    public void replaceDevice(Device device, DeviceDecorator decorator) {
        int index = devices.indexOf(device);
        if (index != -1) {
            devices.set(index, decorator);
            System.out.println("Device replaced with decorator: " + decorator.getClass().getSimpleName());
        } else {
            System.out.println("Device not found in the room.");
        }
    }
}
