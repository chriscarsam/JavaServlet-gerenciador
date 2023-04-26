package org.sam.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.sam.gerenciador.modelo.DB;
import org.sam.gerenciador.modelo.Empresa;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

@WebServlet("/empresas")
public class EmpresasSevice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> empresas = new DB().getEmpresas();
		
		XStream xStream = new XStream();
		xStream.alias("empresa", Empresa.class);
		String xml = xStream.toXML(empresas);
		
		response.setContentType("Application/xml");
		response.getWriter().print(xml);
		
//		Gson gson = new Gson();
//		String json = gson.toJson(empresas);
//		
//		response.setContentType("Application/json");
//		response.getWriter().print(json);
	}

}
