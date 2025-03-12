package kz.seisen.CoffeeShopSimulator.FactoryMethod;

import kz.seisen.CoffeeShopSimulator.Coffies.Coffee;


// Abstraction of factory
public interface CoffeeFactory {
    Coffee createCoffee(String type);
}
