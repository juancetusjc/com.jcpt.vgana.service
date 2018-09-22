package com.jcpt.vgana.service.rs;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/saludar")
public class SaludarServiceRS {

	@GET
	@Produces(TEXT_PLAIN)
	public String saludar(@QueryParam("nombre")String nombre) {
		
		
		return "Hola " + nombre;
	}
}
