package org.example;

public class IceCreamShop {

    private static IceCreamShop shopInstance = new IceCreamShop();
    private static int orderCount = 0;

    private IceCreamShop(){
        System.out.println("Ice Cream Shop has opened!");
    }

    public static IceCreamShop getInstance(){
        return shopInstance;
    }

    public IceCream orderIceCream(String type, boolean withTopping, boolean withChips){
        IceCream iceCream = IceCreamFactory.createIceCream(type);
        if(withTopping){
            iceCream = new ChocolateTopping(iceCream);
        }
        if(withChips){
            iceCream = new ChocolateChips(iceCream);
        }
        orderCount++;
        return iceCream;
    }

    public String printOrder(IceCream iceCream){
        return "Order: " + orderCount + " | " + iceCream.getType() + " | Price: " + iceCream.getCost() + "$";
    }
}
