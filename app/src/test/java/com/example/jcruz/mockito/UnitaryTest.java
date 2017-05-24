package com.example.jcruz.mockito;

/**
 * Created by Jcruz on 24/05/2017.
 */
import static org.junit.Assert.*;
public class UnitaryTest {
    private Warehouse warehouse;

    @org.junit.Before
    public void setUp() throws Exception {
        warehouse = new Warehouse();
    }

    @org.junit.Test
    public void hasInventaryEquals() throws Exception {
       assertTrue(warehouse.hasInventory("Talisker",5));

    }
    @org.junit.Test
    public void hasInventaryLees() throws Exception {
        assertTrue(warehouse.hasInventory("Talisker",3));
    }
    @org.junit.Test
    public void hasInventaryMore() throws Exception {
        assertFalse(warehouse.hasInventory("Talisker",9));

    }
    @org.junit.Test
    public void remove() throws Exception {
        warehouse.remove("Talisker", 5);
        assertEquals(0,warehouse.inStock("Talisker"));

    }
    @org.junit.Test
    public void removeMore() throws Exception {
        warehouse.remove("Talisker", 10);
        assertEquals(-5,warehouse.inStock("Talisker"));

    }
    @org.junit.Test
    public void Add() throws Exception {
        warehouse.add("Talisker", 10);
        assertEquals(15,warehouse.inStock("Talisker"));
    }
    @org.junit.Test
    public void AddNegative() throws Exception {
        warehouse.add("Talisker", -2);
        assertEquals(3,warehouse.inStock("Talisker"));
    }
}
