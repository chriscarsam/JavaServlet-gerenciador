package org.sam.gerenciador.servlet;

import java.io.IOException;

import org.sam.gerenciador.accion.EliminarEmpresa;
import org.sam.gerenciador.accion.ListaEmpresas;
import org.sam.gerenciador.accion.ModificarEmpresa;
import org.sam.gerenciador.accion.MostrarEmpresa;
import org.sam.gerenciador.accion.NuevaEmpresa;
import org.sam.gerenciador.accion.NuevaEmpresaForm;

import jakarta.servlet.RequestDispatcher;
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
		String nombre = null;
		
		if(paramAccion.equals("ListaEmpresas")) {
			
			ListaEmpresas accion = new ListaEmpresas();
			nombre = accion.ejecutar(request, response);
			
			System.out.println("Listar empresas");
			
		}else if(paramAccion.equals("MostrarEmpresa")) {
			
			MostrarEmpresa accion = new MostrarEmpresa();
			nombre = accion.ejecutar(request, response);
			
		}else if(paramAccion.equals("EliminarEmpresa")) {
			
			EliminarEmpresa accion = new EliminarEmpresa();
			nombre = accion.ejecutar(request, response);
			
		}else if(paramAccion.equals("ModificarEmpresa")) {
			
			ModificarEmpresa accion = new ModificarEmpresa();
			nombre = accion.ejecutar(request, response);
			
		}else if(paramAccion.equals("NuevaEmpresa")) {
			
			NuevaEmpresa accion = new NuevaEmpresa();
			nombre = accion.ejecutar(request, response);
			
		}else if(paramAccion.equals("NuevaEmpresaForm")) {
			
			NuevaEmpresaForm accion = new NuevaEmpresaForm();
			nombre = accion.ejecutar(request, response);
			
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
