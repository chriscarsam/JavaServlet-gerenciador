package org.sam.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.sam.gerenciador.modelo.DB;
import org.sam.gerenciador.modelo.Empresa;

public class ModificarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Empresa modificada");
		String nombreEmpresa = request.getParameter("nombre");
		String paramFechaAbertura = request.getParameter("fecha");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
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
		
		response.sendRedirect("listaEmpresas");
		
	}

}
