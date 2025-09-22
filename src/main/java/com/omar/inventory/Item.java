package com.omar.inventory;

import java.util.Objects;

public final class Item {
    private final String sku;
    private final String name;
    private int quantity;

    public Item(String sku, String name, int quantity) {
        if (sku == null || sku.isBlank()) 
            throw new IllegalArgumentException("Sku must not be blank");
        if (name == null || name.isBlank()) 
            throw new IllegalArgumentException("Name must not be blank");
        if (quantity < 0) 
            throw new IllegalArgumentException("Quantity must be >= 0");
        this.sku = sku;
        this.name = name;
        this.quantity = quantity;
    }

    public String getSku() { 
        return sku; 
    }
    public String getName() { 
        return name; 
    }
    public int getQuantity() { 
        return quantity; 
    }
    public void setQuantity(int quantity) {
        if (quantity < 0) 
            throw new IllegalArgumentException("quantity must be >= 0");
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return sku.equals(item.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }

    @Override
    public String toString() {
        return "Item{" +
                "sku='" + sku + ''' +
                ", name='" + name + ''' +
                ", quantity=" + quantity +
                '}';
    }
}
