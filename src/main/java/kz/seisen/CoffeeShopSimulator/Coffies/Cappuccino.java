package kz.seisen.CoffeeShopSimulator.Coffies;

public class Cappuccino implements Coffee {
    @Override
    public double getCost() {
        return 3.0; // Base cost of Cappuccino
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }
}