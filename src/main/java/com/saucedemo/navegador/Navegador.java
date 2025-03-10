package com.saucedemo.navegador;

import com.saucedemo.driver.Driver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador extends Driver {
    public static void iniciarTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    public static void finalizarTest() {
        driver.quit();

    }




}
