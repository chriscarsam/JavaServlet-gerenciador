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
	 	<label for="usuario">Usuario:</label>
	 	<input type="text" name="usuario" id="usuario"/>
	 	<label for="contrasenia">Contraseña:</label>
	 	<input type="password" name="contrasenia" id="contrasenia"/>
	 	<input type="hidden" name="accion" value="Login" />
	 	<input type="submit" value="Enviar" />
	</form>
</body>
</html>