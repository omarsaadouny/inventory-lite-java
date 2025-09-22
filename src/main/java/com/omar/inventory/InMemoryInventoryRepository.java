package com.omar.inventory;

import java.util.*;

public class InMemoryInventoryRepository implements InventoryRepository {
    private final Map<String, Item> store = new HashMap<>();

    @Override
    public Optional<Item> findBySku(String sku) {
        return Optional.ofNullable(store.get(sku));
    }

    @Override
    public void save(Item item) {
        store.put(item.getSku(), item);
    }

    @Override
    public void deleteBySku(String sku) {
        store.remove(sku);
    }

    @Override
    public Collection<Item> findAll() {
        return Collections.unmodifiableCollection(store.values());
    }
}
