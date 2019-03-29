package br.com.testBackJava;

import java.util.Date;

public class GastosService {

	private String descricao;
	private Double valor;
	private Long codigousuario;
	private Date data;
	
	public GastosService() {
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Long getCodigousuario() {
		return codigousuario;
	}

	public void setCodigousuario(Long codigousuario) {
		this.codigousuario = codigousuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
