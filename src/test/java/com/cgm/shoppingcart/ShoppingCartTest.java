package com.cgm.shoppingcart;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ShoppingCartTest {
    ShoppingCart shoppingCart;

    @Before
    public void setUp(){
        shoppingCart = new ShoppingCartImpl();
    }

    @Test
    public void testCheckOutSuccess(){
        String[] item = {"Apple","Apple","Orange", "Apple"};
        double totalPrice = shoppingCart.checkout(Arrays.asList(item));
        assertEquals(2.05,totalPrice);
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
