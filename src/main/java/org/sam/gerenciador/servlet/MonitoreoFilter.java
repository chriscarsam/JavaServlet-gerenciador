package org.sam.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

//@WebFilter(urlPatterns = "/entrada") // Si ya no quiero utilizar el filtro comento esta línea.
public class MonitoreoFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("MonitoreoFilter");
		
		long antes = System.currentTimeMillis();
		
		String accion = request.getParameter("accion");
		
		//ejecución del controlador
		chain.doFilter(request, response);
		
		long despues = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion de la acción: " + accion + " -> " + (despues - antes));
	}

}
