package com.agilefrontiers;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private boolean power;
    private List<Product> products;

    public VendingMachine() {
        products = new ArrayList<>();
    }

    public void powerButton() {
        power = !power;
    }

    public boolean isOn() {
        return power;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProduct(String name) {
        Product result = null;
        for(Product product : this.products) {
            if (name.equals(product.getName())) {
                result = product;
                break;
            }
        }
        return result;
    }

    public boolean isSoldOut() {
        boolean soldOut = true;
        for(Product product : products) {
            if (product.getQuantity() != 0) {
                soldOut = false;
                break;
            }
        }
        return soldOut;
    }

    public String getDisplayLineOne() {
        return this.isOn() ? "Welcome" : "";
    }
    public String getDisplayLineTwo() {
        return this.isSoldOut() ? "Sold Out" : "";
    }
}
