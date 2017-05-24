package com.example.jcruz.mockito;

/**
 * Created by Jcruz on 24/05/2017.
 */

public interface I_Warehouse {


        boolean hasInventory(String product, int quantity);
        void remove(String product, int quantity);

}
