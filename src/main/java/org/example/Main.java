package org.example;

public class Main {
    public static void main(String[] args) {
        IceCreamShop shop = IceCreamShop.getInstance();

        IceCream order1 = shop.orderIceCream("Chocolate", true, true);
        System.out.println(shop.printOrder(order1));

        IceCream order2 = shop.orderIceCream("Vanilla", true, false);
        System.out.println(shop.printOrder(order2));

        IceCream order3 = shop.orderIceCream("Strawberry", false, false);
        System.out.println(shop.printOrder(order3));

        IceCream order4 = shop.orderIceCream("Blueberry", false, true);
        System.out.println(shop.printOrder(order4));
    }
}