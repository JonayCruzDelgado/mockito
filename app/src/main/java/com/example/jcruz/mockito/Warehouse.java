package com.example.jcruz.mockito;

import java.util.HashMap;

/**
 * Created by Jcruz on 24/05/2017.
 */

public class Warehouse implements I_Warehouse {

    private HashMap products;

        public Warehouse() {
            products = new HashMap();
            products.put("Talisker", 5);
            products.put("Lagavulin", 2);
        }

        public boolean hasInventory(String product, int quantity) {
            return inStock(product) >= quantity;
        }

        public void remove(String product, int quantity) {
            products.put(product, inStock(product) - quantity);
        }

        public int inStock(String product) {
            int quantity = (int) products.get(product);

            return quantity;
        }
    }

