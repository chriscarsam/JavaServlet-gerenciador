package org.sam.gerenciador.servlet;

import java.io.IOException;

import org.sam.gerenciador.accion.ListaEmpresas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAccion = request.getParameter("accion");
		
		if(paramAccion.equals("ListaEmpresas")) {
			
			ListaEmpresas accion = new ListaEmpresas();
			accion.ejecutar(request, response);
			
		}else if(paramAccion.equals("MostrarEmpresa")) {
			System.out.println("Mostrar una empresa");
		}else if(paramAccion.equals("ElimnarEmpresa")) {
			System.out.println("Elimnar una empresa");
		}
		
	}

}
