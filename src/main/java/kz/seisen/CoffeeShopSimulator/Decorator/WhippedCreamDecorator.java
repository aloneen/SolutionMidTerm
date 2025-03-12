package kz.seisen.CoffeeShopSimulator.Decorator;

import kz.seisen.CoffeeShopSimulator.Coffies.Coffee;

public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whipped Cream";
    }
}