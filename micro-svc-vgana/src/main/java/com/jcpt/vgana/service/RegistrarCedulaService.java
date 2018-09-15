package com.jcpt.vgana.service;


import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
@Path("/registrar")
public class RegistrarCedulaService {

	@GET
	@Produces(TEXT_PLAIN)
	public String registrarCedula(@QueryParam("nombre") String nombre) {
		return "Hola " + nombre;
	}

 	
}
