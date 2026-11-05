package com.nttdata.steps;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import com.nttdata.screens.*;

public class HomeSteps {
    HomeScreen homeScreen;

    public void buscarTituloInicio() {
        homeScreen.waitForHome();
    }

    public void validarProductosCargados() {
        homeScreen.waitForCatalog();
        Assert.assertTrue("No hay productos visibles", homeScreen.getProductCount() > 0);
    }

    public void agregarProducto(String producto, int unidades) {
        homeScreen.addProductToCart(producto, unidades);
    }

}
