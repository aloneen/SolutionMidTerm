package kz.seisen.SmartHomeControlSystem.Facade;

import kz.seisen.SmartHomeControlSystem.AbstractFactory.AbstractSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.AbstractFactory.AdvancedSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.AbstractFactory.BasicSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.Composite.*;
import kz.seisen.SmartHomeControlSystem.Adapter.*;
import kz.seisen.SmartHomeControlSystem.Decorator.PowerSavingModeDecorator;

import java.util.List;


public class SmartHomeController {

    // Integrates everything
    private Device livingRoomLight;
    private TemperatureDevice livingRoomThermostat;
    private Device frontDoorLock;
    private Room livingRoom;


    // in the constructor we identify which type of factory we have to use
    public SmartHomeController(AbstractSmartHomeFactory factory) {

        this.livingRoomLight = factory.createLight();
        this.livingRoomThermostat = factory.createThermostat();
        this.frontDoorLock = factory.createDoorLock();


        //Power-saving mode. Example of Decorator
        livingRoomLight = new PowerSavingModeDecorator(livingRoomLight);

        // Storaging every device in so-called container which is our Composite example.
        this.livingRoom = new Room();
        livingRoom.addDevice(livingRoomLight);
        livingRoom.addDevice(livingRoomThermostat);
        livingRoom.addDevice(frontDoorLock);
    }




    // Basically there is only three method For starting evening, night routines.
    // Also for getting every piece of info through getHomeStatus.
    public void startEveningRoutine() {
        System.out.println("Starting evening routine...");
        livingRoomLight.turnOn();
        livingRoomThermostat.setTemperature(22.0);
        livingRoomThermostat.getInfo();
        frontDoorLock.turnOn();
        System.out.println("Evening routine started!");
    }

    public void startNightRoutine() {
        System.out.println("Starting night routine...");
        livingRoomLight.turnOff();
        livingRoomThermostat.setTemperature(18.0);
        livingRoomThermostat.getInfo();
        frontDoorLock.turnOff(); // Lock the door
        System.out.println("Night routine started!");
    }

    public void getHomeStatus() {
        System.out.println("Get home status");
        livingRoom.getInfo();
    }
}