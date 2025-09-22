package com.omar.inventory;

import java.util.Collection;
import java.util.Optional;

public interface InventoryRepository {
    Optional<Item> findBySku(String sku);
    void save(Item item);
    void deleteBySku(String sku);
    Collection<Item> findAll();
}
