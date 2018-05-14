package com.webservice.servico;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import com.webservice.data.Data;

@Stateless
@WebService
public class ServicoWebService {

	@WebMethod(operationName="obterServico")
	@WebResult(name="numero")
	public String obtendoServico(@WebParam Data data) {
		
		return data.getToken() + " numero do token " + data.getDataAtualizacao();
		
	}
}
