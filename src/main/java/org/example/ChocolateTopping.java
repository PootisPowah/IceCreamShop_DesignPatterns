package org.example;

public class ChocolateTopping extends IceCreamDecorator{
    public ChocolateTopping(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getType() {
        return super.getType() + " with ChocolateTopping";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
