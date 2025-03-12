package kz.seisen.CoffeeShopSimulator.Coffies;

public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 2.0; // Base cost of Espresso
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}