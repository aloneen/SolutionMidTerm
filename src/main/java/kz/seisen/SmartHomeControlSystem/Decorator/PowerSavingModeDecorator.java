package kz.seisen.SmartHomeControlSystem.Decorator;


import kz.seisen.SmartHomeControlSystem.Composite.Device;

public class PowerSavingModeDecorator extends DeviceDecorator {

    public PowerSavingModeDecorator(Device device) {
        super(device);
    }



    @Override
    public void turnOn() {
        powerSavingMode();
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }



    private void powerSavingMode() {
        System.out.println("Device is ON in power saving mode");
    }


}
