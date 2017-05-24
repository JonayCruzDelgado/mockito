package com.example.jcruz.mockito;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

public class MockitoTest {
@Test
    public void testInStock() {
        Warehouse mockWarehouse = mock(Warehouse.class);

        when(mockWarehouse.hasInventory("Talisker", 50)).thenReturn(true);

        Presenter order = new Presenter("Talisker", 50);
        order.fill(mockWarehouse);

        assertEquals(order.isFilled(),"Success");
        verify(mockWarehouse).remove("Talisker", 50);
    }
 @Test
    public void testOutOfStock() {
        Warehouse mockWarehouse = mock(Warehouse.class);

        when(mockWarehouse.hasInventory("Talisker", 50)).thenReturn(false);

        Presenter order = new Presenter("Talisker", 50);
        order.fill(mockWarehouse);

        assertEquals(order.isFilled(),"failure");
    }
}

