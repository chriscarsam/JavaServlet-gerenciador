package org.sam.gerenciador.accion;

import java.io.IOException;

import org.sam.gerenciador.modelo.DB;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EliminarEmpresa {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("mostrar una empresa " + id);		
				
		DB db = new DB();
		db.eliminarEmpresa(id);
		
		return "redirect:entrada?accion=ListaEmpresas";
		
	}
}
