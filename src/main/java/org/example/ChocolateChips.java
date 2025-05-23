package org.example;

public class ChocolateChips extends IceCreamDecorator{
    public ChocolateChips(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getType() {
        return super.getType() + " with Chocolate Chips";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }
}
