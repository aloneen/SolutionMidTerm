package kz.seisen.SmartHomeControlSystem.Decorator;


import kz.seisen.SmartHomeControlSystem.Composite.Device;

abstract class DeviceDecorator implements Device {

    protected Device device;

    public DeviceDecorator(Device device) {
        this.device = device;
    }



    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void getInfo() {
        device.getInfo();
    }
}