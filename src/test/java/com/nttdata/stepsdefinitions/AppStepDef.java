package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CartSteps;
import com.nttdata.steps.HomeSteps;

import net.thucydides.core.annotations.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppStepDef {
    @Steps
    HomeSteps inHome;
    @Steps
    CartSteps cartSteps;

    private String lastProduct;
    private int lastUnits;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        inHome.buscarTituloInicio();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        inHome.validarProductosCargados();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int unidades, String producto) {
        lastUnits = unidades;
        lastProduct = producto;
        inHome.agregarProducto(producto, unidades);

    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        cartSteps.validarCarrito(lastProduct, lastUnits);
    }

}
