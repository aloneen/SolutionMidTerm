package kz.seisen.CoffeeShopSimulator.Decorator;

import kz.seisen.CoffeeShopSimulator.Coffies.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5; // Adds 0.5 to the base cost
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}