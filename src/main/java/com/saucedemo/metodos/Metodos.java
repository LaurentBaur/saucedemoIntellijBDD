package com.saucedemo.metodos;

import com.saucedemo.driver.Driver;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;

public class Metodos extends Driver {

    public void preencher(By elemento, String texto) {
        driver.findElement(elemento).sendKeys(texto);
    }

    public void clicar(By elemento) {
        driver.findElement(elemento).click();

    }

    public static void validarUrl(String urlEsperada) {
        String urlCapturada = driver.getCurrentUrl();
        assertEquals(urlCapturada, urlEsperada);
    }

    public static void msgDeErro(By elemento, String textoEsperado) {
        String textoCapturado = driver.findElement(elemento).getText();
        assertEquals(textoCapturado, textoEsperado);

    }
}
