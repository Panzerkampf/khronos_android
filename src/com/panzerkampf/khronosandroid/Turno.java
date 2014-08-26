package com.panzerkampf.khronosandroid;

import java.io.Serializable;
import java.util.Date;

public class Turno implements Serializable {

	private static final long serialVersionUID = 5742642955858326315L;
	private int id;
	private Date horarioEntrada;
	private Date horarioSaida;
	private String periodo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(Date horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public Date getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(Date horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

}
