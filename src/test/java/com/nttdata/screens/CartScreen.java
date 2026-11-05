package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CartScreen extends PageObject {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private WebElement cartIcon;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private WebElement productTitle;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/itemsTV")
    private WebElement itemsLabel;

    public void openCart() {
        cartIcon.click();
    }

    public String getProductTitle() {
        waitFor(productTitle);
        return productTitle.getText();
    }

    public int getItemsCount() {
        waitFor(itemsLabel);
        String text = itemsLabel.getText(); // ejemplo: "1 Items"
        return Integer.parseInt(text.split(" ")[0]);
    }
}