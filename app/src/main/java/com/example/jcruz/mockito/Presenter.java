package com.example.jcruz.mockito;

/**
 * Created by Jcruz on 24/05/2017.
 */

public class Presenter {

    private boolean filled = false;
    private String product;
    private int quantity;

        public Presenter(String product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public void fill(Warehouse warehouse) {
            if (warehouse.hasInventory(product, quantity)) {
                warehouse.remove(product, quantity);
                filled = true;
            }
        }

        public String isFilled() {
            if (filled){
                return "Success";
            }else{
                return "failure";
            }
        }


    }

