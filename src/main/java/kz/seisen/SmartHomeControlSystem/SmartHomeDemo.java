package kz.seisen.SmartHomeControlSystem;

import kz.seisen.SmartHomeControlSystem.AbstractFactory.AbstractSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.AbstractFactory.AdvancedSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.AbstractFactory.BasicSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.Facade.SmartHomeController;

// Demo class
public class SmartHomeDemo {
    public static void main(String[] args) {
        // Choose a factory (basic or advanced)
        AbstractSmartHomeFactory basicFactory = new BasicSmartHomeFactory();
        AbstractSmartHomeFactory advancedFactory = new AdvancedSmartHomeFactory();



        // Create a smart home with basic devices
        SmartHomeController basicSmartHome = new SmartHomeController(basicFactory);
        System.out.println("Basic Smart Home:");
        basicSmartHome.startEveningRoutine();

        System.out.println();
        System.out.println();

        basicSmartHome.startNightRoutine();
        basicSmartHome.getHomeStatus();


        System.out.println();
        System.out.println();
        System.out.println("Advanced Smart Home:");
        System.out.println();
        System.out.println();




        // Create a smart home with advanced devices
        SmartHomeController advancedSmartHome = new SmartHomeController(advancedFactory);
        advancedSmartHome.startEveningRoutine();

        System.out.println();
        System.out.println();

        advancedSmartHome.startNightRoutine();
        advancedSmartHome.getHomeStatus();





        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();





    }
}