package kz.seisen.SmartHomeControlSystem.Composite;


// Another Light device but way more advanced
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
        System.out.println("SmartLight is ON");
        statisticsOfTurnOn++;
    }

    @Override
    public void turnOff() {
        System.out.println("SmartLight is OFF");
        statisticsOfTurnOff++;
    }

    @Override
    public void getInfo() {
        System.out.println( "SmartLight with power " + power  + "v " );
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
