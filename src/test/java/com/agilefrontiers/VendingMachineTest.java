package com.agilefrontiers;

import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    VendingMachine vm;
    VendingMachine emptyVM;

    @Before
    public void setUp() {

        emptyVM = new VendingMachine();

        vm = new VendingMachine();
        vm.addProduct(new Product("Coke", 135, 2));
        vm.addProduct(new Product("Gum", 235, 0));
    }

    @Test
    public void vmShouldTurnOnOffWhenSwitchedOnOff() {
        assertFalse(vm.isOn());

        vm.powerButton();

        assertTrue(vm.isOn());

        vm.powerButton();

        assertFalse(vm.isOn());
    }

    @Test
    public void vmShouldHaveProducts() {
        Product product = vm.getProduct("Coke");
        assertTrue(product.getQuantity() == 2);
    }
    @Test
    public void vmShouldHandleIsSoldOut() {
        assertTrue(emptyVM.isSoldOut());
    }
    @Test
    public void vmShouldHandleIsNotSoldOut() {
        assertFalse(vm.isSoldOut());
    }
    @Test
    public void vmShouldShowDisplaySoldOut() {
        emptyVM.powerButton();
        assertSame("displayLineOne should say Welcome", "Welcome", emptyVM.getDisplayLineOne());
        assertSame("displayLineTwo is not Sold Out", "Sold Out", emptyVM.getDisplayLineTwo());
    }

}