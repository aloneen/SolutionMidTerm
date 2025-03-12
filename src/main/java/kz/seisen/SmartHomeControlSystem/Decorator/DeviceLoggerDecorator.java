package kz.seisen.SmartHomeControlSystem.Decorator;


import kz.seisen.SmartHomeControlSystem.Composite.Device;


// Logger decorator
public class DeviceLoggerDecorator extends DeviceDecorator {

    public DeviceLoggerDecorator(Device device) {
        super(device);
    }



    @Override
    public void turnOn() {
        logFormat();
        super.turnOn();
    }

    @Override
    public void turnOff() {
        logFormat();
        super.turnOff();
    }

    @Override
    public void getInfo() {
        logFormat();
        super.getInfo();

    }



    private void logFormat() {
        System.out.println("-------------- Logger ----------------");
    }


}
