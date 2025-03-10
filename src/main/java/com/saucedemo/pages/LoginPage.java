package com.saucedemo.pages;

import com.saucedemo.elementos.Elementos;
import com.saucedemo.metodos.Metodos;

public class LoginPage {

        Elementos el = new Elementos();
        Metodos metodos = new Metodos();


        public void acessarSite(String url) {
            metodos.validarUrl(url);
        }

        public void preencherDados(String username, String password) {
            metodos.preencher(el.username, username);
            metodos.preencher(el.password, password);
        }

        public void clicarBotao() {
            metodos.clicar(el.btnLogin);
        }

        public void validarUrl(String urlEsperada) {
            metodos.validarUrl(urlEsperada);
        }

        public void msgDeErro(String textoEsperado) {

            switch (textoEsperado){
                case "Epic sadface: Sorry, this user has been locked out.":
                    metodos.msgDeErro(el.loginBloqueado, textoEsperado);
                    break;

                case "Epic sadface: Username is required":
                    metodos.msgDeErro(el.loginEmBranco, textoEsperado);
                    break;

                default:
                    throw new IllegalArgumentException("mensagem não encontrada:" +textoEsperado);
            }
        }
}
