package com.cgm.shoppingcart;

import java.util.Objects;

public interface DiscountFactory {

    static Discount getDiscount(ItemEnum item) {
        Discount discount = null;
        if (Objects.nonNull(item))
            switch (item) {
                case APPLE:
                    discount = new BuyOneGetOneFreeDiscount();
                    break;
                case ORANGE:
                    discount = new ThreeForTwoDiscount();
                    break;
            }
        return discount;
    }
}
