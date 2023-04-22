package org.sam.gerenciador.accion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.sam.gerenciador.modelo.DB;
import org.sam.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ModificarEmpresa implements Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		String nombreEmpresa = request.getParameter("nombre");
		String paramFechaAbertura = request.getParameter("fecha");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Empresa modificada " + id);
				
		SimpleDateFormat sdf;
		Date fechaAbertura;
		try {
			sdf = new SimpleDateFormat("dd/MM/yyyy");
			fechaAbertura = sdf.parse(paramFechaAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		DB db = new DB();
		Empresa empresa = db.buscarEmpresaPorId(id);
		empresa.setNombre(nombreEmpresa);
		empresa.setFechaAbertura(fechaAbertura);
		
		return "redirect:entrada?accion=ListaEmpresas";
		
	}
	
}
