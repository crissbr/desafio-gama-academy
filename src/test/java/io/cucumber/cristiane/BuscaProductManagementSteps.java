package io.cucumber.cristiane;

import io.cucumber.cristiane.servico.Configuracao;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;

public class BuscaProductManagementSteps {
	
	@Dado("que eu estou no site da gama academy Product Management")
	public void que_eu_estou_no_site_da_gama_academy_Product_Management() {
		 Configuracao.abrir("https://pages.gama.academy/curso-de-product-management/");
	}

	@Dado("clico na opcao {string}")
	public void clico_na_opcao(String string) {
	    Configuracao.id("lp-pom-button-774").click();
	}

	@Entao("devo ver o valor e o botao comprar agora")
	public void devo_ver_o_valor_e_o_botao_comprar_agora() throws InterruptedException {
	    Thread.sleep(2000);
        Configuracao.abrir("https://pay.hotmart.com/W43905507S?off=94b58527&checkoutMode=0&bid=1616725304896");
        Configuracao.cssSelectors(".product-price");
	    Configuracao.fechar();
	}

}
