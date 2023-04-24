package org.sam.gerenciador.accion;

import java.io.IOException;

import org.sam.gerenciador.modelo.DB;
import org.sam.gerenciador.modelo.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String paramLogin = request.getParameter("login");
		String paramContrasenia = request.getParameter("contrasenia");
		
		System.out.println("Usuario: " + paramLogin);
		
		DB db = new DB();
		Usuario usuario = db.existeUsuario(paramLogin, paramContrasenia);
		
		if(usuario != null) {
			System.out.println("Usuario existe");
			HttpSession session = request.getSession();
			session.setAttribute("loginUsuario", usuario);
			return "redirect:entrada?accion=ListaEmpresas";
		} else {
			return "redirect:entrada?accion=LoginForm";
		}	
	}

}
