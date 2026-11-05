package com.nttdata.steps;

import com.nttdata.screens.CartScreen;
import org.junit.Assert;

public class CartSteps {
    CartScreen cartScreen;

    public void validarCarrito(String expectedProduct, int expectedUnits) {
        cartScreen.openCart();
        Assert.assertEquals(expectedProduct, cartScreen.getProductTitle());
        Assert.assertEquals(expectedUnits, cartScreen.getItemsCount());
    }
}