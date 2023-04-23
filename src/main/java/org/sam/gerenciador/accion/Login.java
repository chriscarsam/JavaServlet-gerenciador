package org.sam.gerenciador.accion;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String paramUsuario = request.getParameter("usuario");
		String paramContrasenia = request.getParameter("contrasenia");
		
		System.out.println("Usuario: " + paramUsuario);		
		
		return "redirect:entrada?accion=ListaEmpresas";
	}

}
