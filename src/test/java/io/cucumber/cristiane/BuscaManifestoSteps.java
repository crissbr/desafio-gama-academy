package io.cucumber.cristiane;

import static org.junit.Assert.assertEquals;

import io.cucumber.cristiane.servico.Configuracao;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Então;

public class BuscaManifestoSteps {

	
		@Dado("cliclo na opção {string}")
		public void cliclo_na_opção(String string) {
			Configuracao.cssSelector(".nav-link.nav.w-nav-link").click();
		}
	
		@Então("deve ver o item do {string}")
		public void deve_ver_o_item_do(String string) throws InterruptedException{
			Thread.sleep(2000);
			 assertEquals(string ,Configuracao.cssSelector(".manifesto h1.heading.lado").getText());
			 Configuracao.fechar();
	}
}
