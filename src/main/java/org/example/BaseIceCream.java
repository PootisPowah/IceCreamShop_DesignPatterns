package org.example;

public class BaseIceCream implements IceCream{

    private String type;
    private double cost;

    public BaseIceCream(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
