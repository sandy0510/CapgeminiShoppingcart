package com.cgm.shoppingcart;

import java.util.Arrays;
import java.util.List;

public interface ShoppingCart {

    static List<Item> getItemList(List<String> items){
        int noOfApples = (int) items.stream().filter(str -> str.equalsIgnoreCase(ItemEnum.APPLE.name())).count();
        Item apples = new Item(ItemEnum.APPLE,noOfApples,ItemEnum.APPLE.getPrice());

        int noOfOranges = (int) items.stream().filter(str -> str.equalsIgnoreCase(ItemEnum.ORANGE.name())).count();
        Item oranges = new Item(ItemEnum.ORANGE,noOfOranges,ItemEnum.ORANGE.getPrice());

        return Arrays.asList(new Item[]{apples, oranges});
    }

    double checkout(List<String> items);
}
