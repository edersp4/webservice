package com.webservice.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Data {
	@XmlElement(required=true)
	private String token;
	
	@XmlElement(required=true)
	private Date dataAtualizacao;
	
	
	public Data() {
	}
	
	public Data(String token, Date dataAtualizacao) {
		super();
		this.token = token;
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
