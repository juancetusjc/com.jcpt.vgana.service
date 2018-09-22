package com.jcpt.vgana.service.rs;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.jcpt.vgana.service.RegistrarCedulaService;

@Path("/registrar")
public class RegistrarCedulaServiceRS {

	@EJB
	private RegistrarCedulaService regCedSvc; 
	
	@GET
	@Produces(TEXT_PLAIN)
	public String registrarCedula(@QueryParam("id") Integer id, @QueryParam("numeroMesa") Integer numeroMesa,
			@QueryParam("numeroCedula") Integer numeroCedula) {
		
		return regCedSvc.registrarCedula(id, numeroMesa, numeroCedula);
	}

}
