package com.webservice.servico;

import javax.xml.ws.Endpoint;

public class Servidor {
	public static void main(String[] args) {
		ServicoWebService servicoWebService = new ServicoWebService();
		
		String url = "http://localhost:8080/servicoWebService";
		
		Endpoint.publish(url, servicoWebService);
		
		
	}
}
