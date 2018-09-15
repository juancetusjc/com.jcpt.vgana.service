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
	@Column(name="ID_CELALA")
	private Integer idCedula;
	
	
	@Column(name="NUMERO_MEZA")
	private Integer numeroMeza;
	
	
	
	
}
