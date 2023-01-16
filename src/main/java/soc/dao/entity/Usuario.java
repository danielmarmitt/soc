package soc.dao.entity;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nmLogin;
	private String dsSenha;
	private Integer qtTempoInatividade;
	
	
	public Usuario() {
		super();
	}


	public String getNmLogin() {
		return nmLogin;
	}


	public void setNmLogin(String nmLogin) {
		this.nmLogin = nmLogin;
	}


	public String getDsSenha() {
		return dsSenha;
	}


	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}


	public Integer getQtTempoInatividade() {
		return qtTempoInatividade;
	}


	public void setQtTempoInatividade(Integer qtTempoInatividade) {
		this.qtTempoInatividade = qtTempoInatividade;
	}
	
	
}
