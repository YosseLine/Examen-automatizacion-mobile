package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"App logo and name\"]")
    private WebElement txtTituloInicio;

    @AndroidFindBy(accessibility = "Displays all products of catalog")
    private WebElement catalog;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup")
    private List<WebElement> products;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]")
    private WebElement listaProductos;

    @AndroidFindBy(accessibility = "Sauce Labs Backpack")
    private WebElement productoBackpack;



    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement tituloApp;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Item\"]")
    private List<WebElement> lista2;

    public void waitForHome() {
        waitFor(txtTituloInicio);
    }

    public void waitForCatalog() {
        waitFor(catalog);
    }

    public int getProductCount() {
        return products.size();
    }

    public void addProductToCart(String productName, int units) {
        waitForCatalog();

        WebElement titleProduct = getDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().description(\"" + productName + "\"))"
        ));

        titleProduct.click();

        if (units > 1) {
            WebElement plus = getDriver().findElement(MobileBy.AccessibilityId("Increase item quantity"));
            for (int i = 1; i < units; i++) {
                plus.click();
            }
        }

        WebElement addBtn = getDriver().findElement(MobileBy.AccessibilityId("Tap to add product to cart"));
        addBtn.click();
    }


    public void esperarElemento(WebElement elemento){
        waitFor(ExpectedConditions.elementToBeClickable(elemento));
    }



    public void ingresar() {
        btnLogin.click();
    }
    public int getCountElements(){
        //List<WebElement> lista = getDriver().findElements(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Item\"]"));
        return lista2.size();
    }

    //
    public String getTitulo() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")));

        //WebElement titulo2 = getDriver().findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"));

        //return titulo2.getText();
        return tituloApp.getText();


    }
}
