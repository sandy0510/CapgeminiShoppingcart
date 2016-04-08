package com.cgm.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ShoppingCartTest {
    ShoppingCart shoppingCart;
    DecimalFormat decimalFormat = new DecimalFormat("###.##");

    @Before
    public void setUp(){
        shoppingCart = new ShoppingCartImpl();
    }

    @Test
    public void testCheckOutRandomValuesSuccess(){
        String[] item = {"Apple","Apple","Orange", "Apple"};
        double totalPrice = shoppingCart.checkout(Arrays.asList(item));
        assertEquals(1.45,Double.valueOf(decimalFormat.format(totalPrice)));
    }

    @Test
    public void testCheckOutProperDiscountMultiplesSuccess(){
        String[] item = {"Apple","Apple","Orange", "Apple","Orange","Orange", "Apple"};
        double totalPrice = shoppingCart.checkout(Arrays.asList(item));
        assertEquals(1.7,Double.valueOf(decimalFormat.format(totalPrice)));
    }

    @Test
    public void testCheckOutNullSuccess(){
        double totalPrice = shoppingCart.checkout(null);
        assertEquals(0.0,totalPrice);
    }
    @Test
    public void testGetItemListSuccess(){
        String[] item = {"Apple","Apple","Orange", "Apple"};
        List<Item> items = ShoppingCart.getItemList(Arrays.asList(item));
        assertEquals(2,items.size());
    }

    @Test
    public void testGetItemListWithOtherStringSuccess(){
        String[] item = {"Apple","Apple","Orange", "Apple","test1","test2"};
        List<Item> items = ShoppingCart.getItemList(Arrays.asList(item));
        assertEquals(2,items.size());
    }
}
