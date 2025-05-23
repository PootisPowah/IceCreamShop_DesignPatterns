package org.example;

public class IceCreamFactory {

    public static IceCream createIceCream(String type){
        return switch(type.toLowerCase()){
            case "vanilla" -> new VanillaIceCream();
            case "chocolate" -> new ChocolateIceCream();
            case "strawberry" -> new StrawberryIceCream();
            default -> throw new IllegalStateException("Invalid Ice Cream Type: " + type);
        };
    }
}
