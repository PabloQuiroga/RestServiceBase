package com.siar.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.siar.ws.rest.vo.VOUsuario;

@Path("/Siar")
public class ServiceLogin {
	
	/*
	 * La URL para apuntar es
	 * http://localhost:8080/RestJR/services/Siar/testService
	 */
	@GET
	@Path("/testService")
	public String testService() {
		return "Servicio activo";
	}
	
	/*
	 * Enviar JSON con el formato tal que...
	 * {
	 * 		"usuario":"pablo",
	 * 		"password":"1234"
	 * }
	 */
	@POST
	@Path("/validaUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario validaUsuario(VOUsuario vo) {
		vo.setValido(false);
		if(vo.getUsuario().equals("pablo") && vo.getPassword().equals("1234")) {
			vo.setValido(true);
		}
		vo.setPassword("#################");
		return vo;
	}

}
