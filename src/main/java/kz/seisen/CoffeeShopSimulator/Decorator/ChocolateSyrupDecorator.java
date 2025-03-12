package kz.seisen.CoffeeShopSimulator.Decorator;

import kz.seisen.CoffeeShopSimulator.Coffies.Coffee;

public class ChocolateSyrupDecorator extends CoffeeDecorator {
    public ChocolateSyrupDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.8;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate Syrup";
    }
}