package kz.seisen.CoffeeShopSimulator.Decorator;

import kz.seisen.CoffeeShopSimulator.Coffies.Coffee;

public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0; // Adds 1.0 to the base cost
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whipped Cream";
    }
}