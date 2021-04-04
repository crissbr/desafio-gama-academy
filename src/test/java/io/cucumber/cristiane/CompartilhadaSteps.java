package io.cucumber.cristiane;

import io.cucumber.cristiane.servico.Configuracao;
import io.cucumber.java.es.Dado;

public class CompartilhadaSteps {
	
	 @Dado("que eu estou no site da gama academy")
	    public void que_eu_estou_no_site_da_gama_academy() {
	    Configuracao.abrir("https://www.gama.academy/");
	        
	    }
}
