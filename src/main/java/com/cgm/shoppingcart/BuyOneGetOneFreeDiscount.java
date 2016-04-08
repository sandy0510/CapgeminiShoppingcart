package com.cgm.shoppingcart;

public class BuyOneGetOneFreeDiscount implements Discount {

    public double getDiscountAmt(Item item) {
        if (item.getQuantity() >= 2) {
            int quotient = item.getQuantity() / 2;
            return item.getPricePerUnit() * quotient;
        }
        return 0;
    }
}
