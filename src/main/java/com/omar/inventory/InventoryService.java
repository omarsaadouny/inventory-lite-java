package com.omar.inventory;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public class InventoryService {
    private final InventoryRepository repo;

    public InventoryService(InventoryRepository repo) {
        this.repo = Objects.requireNonNull(repo);
    }

    public void addItem(String sku, String name, int quantity) {
        validateSku(sku);
        validateName(name);
        validateQuantity(quantity);
        if (repo.findBySku(sku).isPresent()) {
            throw new 
                IllegalArgumentException("Item with sku already exists: " + sku);
        }
        repo.save(new Item(sku, name, quantity));
    }

    public void removeItem(String sku) {
        validateSku(sku);
        if (repo.findBySku(sku).isEmpty()) {
            throw new IllegalArgumentException("No item with sku: " + sku);
        }
        repo.deleteBySku(sku);
    }

    public Optional<Item> findBySku(String sku) {
        validateSku(sku);
        return repo.findBySku(sku);
    }

    public Collection<Item> listAll() {
        return repo.findAll();
    }

    public void setQuantity(String sku, int quantity) {
        validateSku(sku);
        validateQuantity(quantity);
        Item item = repo.findBySku(sku).orElseThrow(() -> new IllegalArgumentException("No item with sku: " + sku));
        item.setQuantity(quantity);
        repo.save(item);
    }

    private static void validateSku(String sku) {
        if (sku == null || sku.isBlank())
            throw new IllegalArgumentException("sku must not be blank");
    }

    private static void validateName(String name) {
        if (name == null || name.isBlank()) 
            throw new IllegalArgumentException("name must not be blank");
    }

    private static void validateQuantity(int qty) {
        if (qty < 0) 
            throw new IllegalArgumentException("quantity must be >= 0");
    }
}
