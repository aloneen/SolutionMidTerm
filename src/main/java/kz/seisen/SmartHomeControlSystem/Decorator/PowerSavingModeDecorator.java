package kz.seisen.SmartHomeControlSystem.Decorator;


import kz.seisen.SmartHomeControlSystem.Composite.Device;


// Power Saving mode.
public class PowerSavingModeDecorator extends DeviceDecorator {

    public PowerSavingModeDecorator(Device device) {
        super(device);
    }



    // We monitor the moment of device turning on because that's only moment we can activate power saving mode.
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
