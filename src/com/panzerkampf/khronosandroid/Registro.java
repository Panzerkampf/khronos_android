package com.panzerkampf.khronosandroid;

import java.io.Serializable;
import java.util.Date;

public class Registro implements Serializable {

	private static final long serialVersionUID = -1328886943491165682L;

	private int id;
	private Date dataHora;
	private String tipo;

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
