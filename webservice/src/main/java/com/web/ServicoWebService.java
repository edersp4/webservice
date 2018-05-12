package com.web;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService
public class ServicoWebService {

	@WebMethod
	public String obtendoServico() {
		
		return "Serviço Funcionando";
		
	}
}
