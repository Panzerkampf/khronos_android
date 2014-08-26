package com.panzerkampf.khronosandroid;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 5756978206574312835L;
	private String email;
	private String senha;
	private String nomeEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

}
