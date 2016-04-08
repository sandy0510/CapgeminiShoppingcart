package com.cgm.shoppingcart;

public enum ItemEnum {
    APPLE("Apple",0.6),ORANGE("Orange",0.25);

    private final String itemName;
    private final double price;

    ItemEnum(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
