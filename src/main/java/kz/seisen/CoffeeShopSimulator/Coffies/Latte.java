package kz.seisen.CoffeeShopSimulator.Coffies;

public class Latte implements Coffee {
    @Override
    public double getCost() {
        return 3.5; // Base cost of Latte
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}