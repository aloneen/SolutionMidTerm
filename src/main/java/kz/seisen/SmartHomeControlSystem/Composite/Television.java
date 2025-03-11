package kz.seisen.SmartHomeControlSystem.Composite;

public class Television implements Device{

    private String model;
    private String screenType;

    public Television(String model, String screenType) {
        this.model = model;
        this.screenType = screenType;
    }

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }

    @Override
    public void getInfo() {
        System.out.println( "TV: " + model + " Screen: " + screenType );
    }
}
