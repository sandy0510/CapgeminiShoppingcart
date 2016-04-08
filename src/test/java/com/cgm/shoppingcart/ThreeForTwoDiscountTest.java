package com.cgm.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ThreeForTwoDiscountTest {

    Discount threeForTwoDiscount;

    @Before
    public void setUp(){
        threeForTwoDiscount = new ThreeForTwoDiscount();
    }

    @Test
    public void testApplyDiscountMultiplesOfThreeSuccess(){
        Item item1 = new Item(ItemEnum.APPLE,3,10);
        double discount = threeForTwoDiscount.getDiscountAmt(item1);
        assertEquals(discount,10.0);

        Item item2 = new Item(ItemEnum.APPLE,6,10);
        double discount1 = threeForTwoDiscount.getDiscountAmt(item2);
        assertEquals(discount1,20.0);

        Item item3 = new Item(ItemEnum.APPLE,9,10);
        double discount2 = threeForTwoDiscount.getDiscountAmt(item3);
        assertEquals(discount2,30.0);
    }

    @Test
    public void testApplyDiscountNonMultiplesOfThreeSuccess(){
        Item item1 = new Item(ItemEnum.APPLE,5,10);
        double discount = threeForTwoDiscount.getDiscountAmt(item1);
        assertEquals(discount,10.0);

        Item item2 = new Item(ItemEnum.APPLE,7,10);
        double discount1 = threeForTwoDiscount.getDiscountAmt(item2);
        assertEquals(discount1,20.0);

        Item item3 = new Item(ItemEnum.APPLE,10,10);
        double discount2 = threeForTwoDiscount.getDiscountAmt(item3);
        assertEquals(discount2,30.0);
    }

    @Test
    public void testApplyDiscountOneLessThanThreeSuccess(){

        Item item1 = new Item(ItemEnum.APPLE,1,10);
        double discount = threeForTwoDiscount.getDiscountAmt(item1);
        assertEquals(discount,0.0);

        Item item2 = new Item(ItemEnum.APPLE,2,10);
        double discount1 = threeForTwoDiscount.getDiscountAmt(item2);
        assertEquals(discount1,0.0);

        Item item3 = new Item(ItemEnum.APPLE,0,10);
        double discount2 = threeForTwoDiscount.getDiscountAmt(item3);
        assertEquals(discount2,0.0);
    }
}
