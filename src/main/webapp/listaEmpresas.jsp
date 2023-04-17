<%@page import="java.util.List, org.sam.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<label>Lista de empresas:</label>
<ul>
	<%
		List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");
		for(Empresa empresa : lista){
	%> 
	<li> <%= empresa.getNombre() %> </li>
	<%
	} 
	%>
</ul>
	
		
</body>
</html>