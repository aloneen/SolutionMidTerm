package kz.seisen.SmartHomeControlSystem.Composite;

public class SmartLight implements Device{
    private double power;
    private static int statisticsOfTurnOn;
    private static int statisticsOfTurnOff;

    public SmartLight() {
        this.power = 5;
        statisticsOfTurnOn = 0;
        statisticsOfTurnOff = 0;
    }


    public SmartLight(double power) {
        this.power = power;
        statisticsOfTurnOn = 0;
        statisticsOfTurnOff = 0;
    }


    @Override
    public void turnOn() {
        System.out.println("Light is ON");
        statisticsOfTurnOn++;
    }

    @Override
    public void turnOff() {
        System.out.println("Light is OFF");
        statisticsOfTurnOff++;
    }

    @Override
    public void getInfo() {
        System.out.println( "Light with power " + power  + "v " );
        System.out.println( "Statistics of turning on " + statisticsOfTurnOn );
        System.out.println( "Statistics of turning off " + statisticsOfTurnOff );
    }


    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
