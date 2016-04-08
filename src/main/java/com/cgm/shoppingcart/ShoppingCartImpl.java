package com.cgm.shoppingcart;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ShoppingCartImpl implements ShoppingCart {

    @Override
    public double checkout(List<String> scannedItems) {
        if(Objects.nonNull(scannedItems)){
            List<Item> items = ShoppingCart.getItemList(scannedItems);
            double totalAmount =
                    items.stream().mapToDouble(item -> {
                        double discountAmt = 0.0;
                        Discount discount = DiscountFactory.getDiscount(item.getItemName());
                        if(discount!=null){
                            discountAmt =discount.getDiscountAmt(item);
                        }
                        double totalAmt = (item.getQuantity() * item.getPricePerUnit());
                        return (totalAmt - discountAmt);
                    }).sum();
            return totalAmount;
        }
        return 0.0;
    }
}
