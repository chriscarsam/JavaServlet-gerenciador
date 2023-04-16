package org.sam.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DB baseDeDatos = new DB();
		List<Empresa> listaEmpresas = baseDeDatos.getEmpresas();
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("<ul>");
		listaEmpresas.forEach(empresa -> out.println("<li>" + empresa.getNombre() + "</li>"));
		out.println("</ul>");
		out.print("</body></html>");
	}

}
