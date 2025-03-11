package kz.seisen.SmartHomeControlSystem.Facade;

import kz.seisen.SmartHomeControlSystem.AbstractFactory.AbstractSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.AbstractFactory.AdvancedSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.AbstractFactory.BasicSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.Composite.*;
import kz.seisen.SmartHomeControlSystem.Adapter.*;
import kz.seisen.SmartHomeControlSystem.Decorator.PowerSavingModeDecorator;

import java.util.List;


public class SmartHomeController {
    private Device livingRoomLight;
    private TemperatureDevice livingRoomThermostat;
    private Device frontDoorLock;
    private Room livingRoom;

    public SmartHomeController(AbstractSmartHomeFactory factory) {

        this.livingRoomLight = factory.createLight();
        this.livingRoomThermostat = factory.createThermostat();
        this.frontDoorLock = factory.createDoorLock();


        //Power-saving mode
        livingRoomLight = new PowerSavingModeDecorator(livingRoomLight);


        this.livingRoom = new Room();
        livingRoom.addDevice(livingRoomLight);
        livingRoom.addDevice(livingRoomThermostat);
        livingRoom.addDevice(frontDoorLock);
    }


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