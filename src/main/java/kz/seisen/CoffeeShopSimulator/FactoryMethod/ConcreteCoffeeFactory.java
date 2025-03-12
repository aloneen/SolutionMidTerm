package kz.seisen.CoffeeShopSimulator.FactoryMethod;

import kz.seisen.CoffeeShopSimulator.Coffies.*;


//Concrete implementation of our factory method
public class ConcreteCoffeeFactory implements CoffeeFactory {


    @Override
    public Coffee createCoffee(String coffeeType) {
        switch (coffeeType.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            case "americano":
                return new Americano();
            default:
                throw new IllegalArgumentException("Unknown coffee type: " + coffeeType);
        }

    }
}
