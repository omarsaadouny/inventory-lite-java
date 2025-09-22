package com.omar.inventory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class InventoryServiceTest {

    @Test
    void add_and_find_item() {
        InventoryService svc = new InventoryService(new InMemoryInventoryRepository());
        svc.addItem("SKU-1", "Coffee Beans", 5);
        assertTrue(svc.findBySku("SKU-1").isPresent());
        assertEquals("Coffee Beans", svc.findBySku("SKU-1").get().getName());
    }

    @Test
    void prevent_duplicate_sku() {
        InventoryService svc = new InventoryService(new InMemoryInventoryRepository());
        svc.addItem("SKU-2", "Filter", 3);
        assertThrows(IllegalArgumentException.class, () -> svc.addItem("SKU-2", "Filter-2", 1));
    }

    @Test
    void set_quantity_and_list_all() {
        InventoryService svc = new InventoryService(new InMemoryInventoryRepository());
        svc.addItem("SKU-3", "Mug", 1);
        svc.setQuantity("SKU-3", 7);
        assertEquals(7, svc.findBySku("SKU-3").get().getQuantity());
        assertEquals(1, svc.listAll().size());
    }

    @Test
    void remove_item() {
        InventoryService svc = new InventoryService(new InMemoryInventoryRepository());
        svc.addItem("SKU-4", "Cup", 2);
        svc.removeItem("SKU-4");
        assertTrue(svc.findBySku("SKU-4").isEmpty());
    }

    @Test
    void invalid_inputs_are_rejected() {
        InventoryService svc = new InventoryService(new InMemoryInventoryRepository());
        assertThrows(IllegalArgumentException.class, () -> svc.addItem("", "x", 1));
        assertThrows(IllegalArgumentException.class, () -> svc.addItem("A", "", 1));
        assertThrows(IllegalArgumentException.class, () -> svc.addItem("A", "B", -1));
    }

    @Test
    void delete_nonexistent_item_throws() {
    InventoryService svc = new InventoryService(new InMemoryInventoryRepository());
    assertThrows(IllegalArgumentException.class, () -> svc.removeItem("NOPE"));
    }

}
