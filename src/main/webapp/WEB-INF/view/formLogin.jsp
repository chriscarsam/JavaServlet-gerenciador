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
	 	<label for="login">Login:</label>
	 	<input type="text" name="login" id="login"/>
	 	<label for="contrasenia">Contrase�a:</label>
	 	<input type="password" name="contrasenia" id="contrasenia"/>
	 	<input type="hidden" name="accion" value="Login" />
	 	<input type="submit" value="Enviar" />
	</form>
</body>
</html>