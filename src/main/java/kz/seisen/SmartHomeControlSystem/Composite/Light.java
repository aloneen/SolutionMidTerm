package kz.seisen.SmartHomeControlSystem.Composite;



public class Light implements Device{
    private double power;

    public Light() {
        this.power = 5;
    }


    public Light(double power) {
        this.power = power;
    }


    @Override
    public void turnOn() {
        System.out.println("Light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is OFF");
    }

    @Override
    public void getInfo() {
        System.out.println( "Light with power " + power  + "v " );
    }


    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
