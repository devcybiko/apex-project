package com.agilefrontiers;

import com.agilefrontiers.Product;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductTest {
    @Test
    public void constructorDefaultTest() {
        Product coke = new Product();
        coke.setName("Coke");
        coke.setPrice(135);
        coke.setQuantity(2);
        assertTrue(coke.getName().equals("Coke"));
        assertTrue(coke.getPrice().equals(135));
        assertTrue(coke.getQuantity().equals(2));
    }
    @Test
    public void constructor() {
        Product coke = new Product("Coke", 135, 2);
        assertTrue(coke.getName().equals("Coke"));
        assertTrue(coke.getPrice().equals(135));
        assertTrue(coke.getQuantity().equals(2));
    }

    @Test
    public void isSoldOutTest() {
        Product test = new Product("Coke", 135, 0);
        assertTrue(test.isSoldOut());
    }

    @Test
    public void isNotSoldOutTest() {
        Product test = new Product("Coke", 135, 3);
        assertFalse(test.isSoldOut());
    }
}

