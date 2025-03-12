package kz.seisen.CoffeeShopSimulator.FactoryMethod;

import kz.seisen.CoffeeShopSimulator.Coffies.Coffee;

public interface CoffeeFactory {
    Coffee createCoffee(String type);
}
