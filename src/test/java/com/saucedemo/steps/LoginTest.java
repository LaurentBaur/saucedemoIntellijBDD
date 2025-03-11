package com.saucedemo.steps;

import com.saucedemo.navegador.Navegador;
import com.saucedemo.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

    LoginPage lop = new LoginPage();

    @After
    public void finalizarTest() {
      Navegador.finalizarTest();
    }

    @Given("acesse o site do sauce demo")
    public void acesseOSiteDoSauceDemo() {
        Navegador.iniciarTest();

    }
    @When("preencher dados válidos")
    public void preencherDadosVálidos() {
        lop.preencherDados("standard_user", "secret_sauce");
    }

    @When("clicar no botão login")
    public void clicarNoBotãoLogin() {
        lop.clicarBotao();
    }

    @Then("logado com sucesso")
    public void logadoComSucesso() {
        lop.validarUrl("https://www.saucedemo.com/inventory.html");
    }

    @When("preencher dados com usuário bloqueado")
    public void preencherDadosComUsuárioBloqueado() {
        lop.preencherDados("locked_out_user", "secret_sauce");
    }
    @Then("recebo mensagem de erro")
    public void receboMensagemDeErro() {
        lop.msgDeErro("Epic sadface: Sorry, this user has been locked out.");
    }
    @When("não preencher os dados de usuário")
    public void nãoPreencherOsDadosDeUsuário() {
        lop.preencherDados("", "");
    }

    @Then("recebo mensagem de dados em branco")
    public void receboMensagemDeDadosEmBranco() {
        lop.msgDeErro("Epic sadface: Username is required");
    }


}

