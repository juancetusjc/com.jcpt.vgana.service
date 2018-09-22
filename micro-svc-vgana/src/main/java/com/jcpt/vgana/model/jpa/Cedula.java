package com.jcpt.vgana.model.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CEDULA")
public class Cedula implements Serializable {
	private static final long serialVersionUID = -1;
	
	@Id
	@Column(name="ID_CEDULA")
	private Integer idCedula;
		
	@Column(name="NUMERO_MESA")
	private Integer numeroMesa;
	
	@Column(name="NUMERO_CEDULA")
	private Integer numeroCedula;

	public Integer getIdCedula() {
		return idCedula;
	}

	public void setIdCedula(Integer idCedula) {
		this.idCedula = idCedula;
	}

	public Integer getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public Integer getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(Integer numeroCedula) {
		this.numeroCedula = numeroCedula;
	}
	
		
	
	
}
