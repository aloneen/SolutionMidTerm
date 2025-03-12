package kz.seisen.CoffeeShopSimulator.Coffies;

public class Americano implements Coffee {
    @Override
    public double getCost() {
        return 2.5; // Base cost of Americano
    }

    @Override
    public String getDescription() {
        return "Americano";
    }
}