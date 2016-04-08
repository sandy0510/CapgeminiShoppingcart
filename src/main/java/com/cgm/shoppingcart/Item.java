package com.cgm.shoppingcart;

public class Item {
    ItemEnum itemName;
    int quantity;
    double pricePerUnit;

    public Item(ItemEnum itemName, int quantity, double pricePerUnit) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public ItemEnum getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName=" + itemName.name() +
                ", quantity=" + quantity +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        if (Double.compare(item.getPricePerUnit(), this.pricePerUnit) != 0) return false;
        return this.itemName.equals(item.getItemName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getItemName().hashCode();
        result = (int) (31 * result + quantity);
        temp = Double.doubleToLongBits(pricePerUnit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
