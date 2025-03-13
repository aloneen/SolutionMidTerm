package kz.seisen.SmartHomeControlSystem;
import kz.seisen.SmartHomeControlSystem.AbstractFactory.AbstractSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.AbstractFactory.AdvancedSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.AbstractFactory.BasicSmartHomeFactory;
import kz.seisen.SmartHomeControlSystem.Adapter.LegacyDoorLock;
import kz.seisen.SmartHomeControlSystem.Adapter.LegacyDoorLockAdapter;
import kz.seisen.SmartHomeControlSystem.Composite.Device;
import kz.seisen.SmartHomeControlSystem.Composite.Light;
import kz.seisen.SmartHomeControlSystem.Composite.Thermostat;
import kz.seisen.SmartHomeControlSystem.Decorator.DeviceLoggerDecorator;
import kz.seisen.SmartHomeControlSystem.Decorator.PowerSavingModeDecorator;
import kz.seisen.SmartHomeControlSystem.Facade.SmartHomeController;


import java.util.Scanner;

public class SmartHomeCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Choose home type (Basic or Advanced)
        System.out.println("=== Welcome to the Smart Home Control System ===");
        System.out.println("Choose your home type:");
        System.out.println("1. Basic Home");
        System.out.println("2. Advanced Home");
        System.out.print("Enter your choice: ");
        int homeTypeChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        AbstractSmartHomeFactory factory;
        switch (homeTypeChoice) {
            case 1:
                factory = new BasicSmartHomeFactory();
                System.out.println("Basic Home selected.");
                break;
            case 2:
                factory = new AdvancedSmartHomeFactory();
                System.out.println("Advanced Home selected.");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Basic Home.");
                factory = new BasicSmartHomeFactory();
                break;
        }

        // Step 2: Initialize the SmartHomeController with the chosen factory
        SmartHomeController smartHome = new SmartHomeController(factory);

        // Step 3: Provide options for managing the smart home
        while (true) {
            System.out.println("\n=== Smart Home Control System ===");
            System.out.println("1. Decorate a device");
            System.out.println("2. Start evening routine");
            System.out.println("3. Start night routine");
            System.out.println("4. Get home status");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    decorateDevice(scanner, smartHome);
                    break;
                case 2:
                    smartHome.startEveningRoutine();
                    break;
                case 3:
                    smartHome.startNightRoutine();
                    break;
                case 4:
                    smartHome.getHomeStatus();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void decorateDevice(Scanner scanner, SmartHomeController smartHome) {
        System.out.println("\n=== Decorate a Device ===");
        System.out.println("1. Add logging to a device");
        System.out.println("2. Add power-saving mode to a device");
        System.out.print("Choose a decorator: ");
        int decoratorChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the device name (e.g., Light, Thermostat): ");
        String deviceName = scanner.nextLine();

        Device device = smartHome.getDeviceByName(deviceName);
        if (device == null) {
            System.out.println("Device not found.");
            return;
        }

        switch (decoratorChoice) {
            case 1:
                smartHome.decorateDevice(device, new DeviceLoggerDecorator(device));
                System.out.println("Logging added to the device.");
                break;
            case 2:
                smartHome.decorateDevice(device, new PowerSavingModeDecorator(device));
                System.out.println("Power-saving mode added to the device.");
                break;
            default:
                System.out.println("Invalid decorator choice.");
        }
    }
}