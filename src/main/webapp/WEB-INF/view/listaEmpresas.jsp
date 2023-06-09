<%@page import="java.util.List,org.sam.gerenciador.modelo.Empresa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Standard Taglib</title>
</head>
<body>

	<c:import url="logout-parcial.jsp"></c:import>
	
	Usuario logado: ${loginUsuario.login}
	
	<br>
	<br>
	<br>

	<c:if test="${not empty empresa}">
		Empresa ${ empresa } registrada! <br>
	</c:if>
	
	<label>Lista de empresas:</label>
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">		
			<li>
				${ empresa.nombre } - <fmt:formatDate value="${ empresa.fechaAbertura }" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/entrada?accion=MostrarEmpresa&id=${ empresa.id }">modificar</a>
				<a href="/gerenciador/entrada?accion=EliminarEmpresa&id=${ empresa.id }">eliminar</a>
			</li>
		</c:forEach>
	</ul>
		
</body>
</html>