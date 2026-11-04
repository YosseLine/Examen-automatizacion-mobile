package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchScreen extends PageObject {

    @AndroidFindBy(id = "2131432049")
    private WebElement searchInput;

    @AndroidFindBy(id = "2131431007")
    private WebElement resultText;

    public void clickSearchInput(){
        searchInput.click();
    }

    public String getResultText(){
        return resultText.getText();
    }
}
