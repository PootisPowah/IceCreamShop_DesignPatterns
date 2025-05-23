package org.example;

public class IceCreamDecorator implements IceCream{
    protected IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.decoratedIceCream = iceCream;
    }

    @Override
    public String getType() {
        return decoratedIceCream.getType();
    }

    @Override
    public double getCost() {
        return decoratedIceCream.getCost();
    }
}
