package org.sam.gerenciador.servlet;

import java.io.IOException;

import org.sam.gerenciador.accion.Accion;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAccion = request.getParameter("accion");		
	/*	HttpSession session = request.getSession();
		
		Boolean esUnUsuarioNoLogado = (session.getAttribute("loginUsuario") == null);
		Boolean esUnaAccionProtegida = !(paramAccion.equals("Login") || paramAccion.equals("LoginForm"));
		
		if (esUnUsuarioNoLogado && esUnaAccionProtegida) {
			response.sendRedirect("entrada?accion=LoginForm");
			return;
		}		*/
		
		String nombreDeClase = "org.sam.gerenciador.accion." + paramAccion;
		String nombre;
		try {
			Class clase = Class.forName(nombreDeClase);
			Accion accion = (Accion) clase.newInstance();
			nombre = accion.ejecutar(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}
		
		
		String[] tipoYDireccion = nombre.split(":");
		
		if(tipoYDireccion[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoYDireccion[1]);
			rd.forward(request, response);			
		} else {
			response.sendRedirect(tipoYDireccion[1]);
		}	

		
	}

}
