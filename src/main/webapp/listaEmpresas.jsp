<%@page import="java.util.List, org.sam.gerenciador.servlet.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Standard Taglib</title>
</head>
<body>
	<label>Lista de empresas:</label>
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${ empresa.nombre }</li>
		</c:forEach>
	</ul>
		
</body>
</html>