package org.sam.gerenciador.accion;

import java.io.IOException;
import java.util.List;

import org.sam.gerenciador.modelo.DB;
import org.sam.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListaEmpresas implements Accion{

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DB baseDeDatos = new DB();
		List<Empresa> listaEmpresas = baseDeDatos.getEmpresas();
	
		request.setAttribute("empresas", listaEmpresas);
		
		return "forward:listaEmpresas.jsp";
	}
}
