package kz.seisen.SmartHomeControlSystem.Adapter;

import kz.seisen.SmartHomeControlSystem.Composite.Device;


// Legacy door lock which do not fit to our new system of turning on/off.
public class LegacyDoorLock {

    public void lock() { System.out.println("Legacy door locked"); }
    public void unlock() { System.out.println("Legacy door unlocked"); }

}
