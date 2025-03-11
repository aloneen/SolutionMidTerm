package kz.seisen.SmartHomeControlSystem.Decorator;

import kz.seisen.SmartHomeControlSystem.Composite.Device;

public class ScheduledOperationDecorator extends DeviceDecorator {
    private String schedule;

    public ScheduledOperationDecorator(Device device, String schedule) {
        super(device);
        this.schedule = schedule;
    }
    public void turnOn() {
        System.out.println("Scheduled ON at " + schedule);
        device.turnOn();
    }
}