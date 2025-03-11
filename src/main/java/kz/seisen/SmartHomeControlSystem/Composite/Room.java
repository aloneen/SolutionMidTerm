package kz.seisen.SmartHomeControlSystem.Composite;

import java.util.ArrayList;
import java.util.List;

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
}
