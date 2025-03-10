package com.saucedemo.elementos;

import org.openqa.selenium.By;

public class Elementos {

    public By username = By.xpath("//input[@id='user-name']");
    public By password = By.xpath("//input[@id='password']");
    public By btnLogin = By.xpath("//input[@id='login-button']");
    public By loginBloqueado = By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out.')]");
    public By loginEmBranco = By.xpath("//h3[normalize-space()='Epic sadface: Username is required']");
    public By products = By.xpath("//span[@class='title']");
    public By backpack = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
    public By addToCart = By.xpath("//button[@id='add-to-cart']");
    public By carrinho = By.xpath("//div[@id='shopping_cart_container']");
    public By yourCart = By.xpath("//span[@class='title']");
    public By checkout = By.id("checkout");
    public By yourInformation = By.xpath("//span[@class='title']");
    public By firstName = By.id("first-name");
    public By lasttName = By.id("last-name");
    public By zip = By.id("postal-code");
    public By btnContinue = By.id("continue");
    public By titleCheckoutOverview = By.xpath("//span[@class='title']");
    public By btnFinish = By.id("finish");
    public By msgSucessoCompra = By.xpath("//h2[@data-test='complete-header']");
    public By btnBackHome = By.xpath("//button[@id='back-to-products']");
}
