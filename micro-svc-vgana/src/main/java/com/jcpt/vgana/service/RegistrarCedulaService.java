package com.jcpt.vgana.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.jcpt.vgana.model.jpa.Cedula;

@Stateless
public class RegistrarCedulaService {
	private static final String RESULTADO_TYPE_OK = "OK";
	private static final String RESULTADO_TYPE_ERROR = "ERROR";

	@PersistenceContext(unitName = "derbyVganaPU")
	private EntityManager em;

	public String registrarCedula(Integer id, Integer numeroMesa, Integer numeroCedula) {
		boolean resultadoInd = false;
		Cedula cedula = new Cedula();
		String resultado = RESULTADO_TYPE_ERROR;
		try {
			cedula.setIdCedula(id);
			cedula.setNumeroMesa(numeroMesa);
			cedula.setNumeroCedula(numeroCedula);
			em.persist(cedula);
			resultadoInd = true;
		} catch (Exception e) {

			resultadoInd = false;
		} finally {
			if (resultadoInd) {
				resultado = RESULTADO_TYPE_OK;
			}
		}

		return resultado;
	}
}
