package com.cgm.shoppingcart;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class DiscountFactoryTest {

    @Test
    public void getDiscountAppleSuccessTest() {
        Discount discount = DiscountFactory.getDiscount(ItemEnum.APPLE);
        assertTrue(discount instanceof BuyOneGetOneFreeDiscount);
    }

    @Test
    public void getDiscountOrangeSuccessTest() {
        Discount discount = DiscountFactory.getDiscount(ItemEnum.ORANGE);
        assertTrue(discount instanceof ThreeForTwoDiscount);
    }

    @Test
    public void getDiscountNullTest() {
        Discount discount = DiscountFactory.getDiscount(null);
        assertNull(discount);
    }
}
