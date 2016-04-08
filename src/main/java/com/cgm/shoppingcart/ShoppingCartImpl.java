package com.cgm.shoppingcart;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ShoppingCartImpl implements ShoppingCart {

    @Override
    public double checkout(List<String> scannedItems) {
        if(Objects.nonNull(scannedItems)){
            List<Item> items = ShoppingCart.getItemList(scannedItems);
            return items
                    .stream()
                    .mapToDouble(item -> (item.getQuantity() * item.getPricePerUnit()))
                    .sum();
        }
        return 0.0;
    }

}
