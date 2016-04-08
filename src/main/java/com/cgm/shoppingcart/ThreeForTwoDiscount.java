package com.cgm.shoppingcart;

public class ThreeForTwoDiscount implements Discount {

    public double getDiscountAmt(Item item) {
        if(item.getQuantity() >= 3){
            int quotient = item.getQuantity() / 3;
            return item.getPricePerUnit()*quotient;
        }
        return 0;
    }
}
