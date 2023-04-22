<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkEntradaServlet}" method="post">
	 	<label for="nombre">Nombre empresa:</label>
	 	<input type="text" name="nombre" id="nombre"/>
	 	<label for="fecha">Fecha abertura:</label>
	 	<input type="text" name="fecha" id="fecha"/>
	 	<input type="hidden" name="accion" value="NuevaEmpresa" />
	 	<input type="submit" value="Enviar" />
	</form>
</body>
</html>