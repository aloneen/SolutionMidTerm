package kz.seisen.SmartHomeControlSystem.Adapter;


import kz.seisen.SmartHomeControlSystem.Composite.Device;

// Adapter itself.
public class LegacyDoorLockAdapter implements Device {
    private LegacyDoorLock lock;


    public LegacyDoorLockAdapter(LegacyDoorLock lock) {
        this.lock = lock;
    }



    @Override
    public void turnOn() { // We cover the main logic into our new system logic
        lock.unlock();
    }
    @Override
    public void turnOff() {
        lock.lock();
    }
    @Override
    public void getInfo() {
        System.out.println( "Legacy door lock info");
    }
}