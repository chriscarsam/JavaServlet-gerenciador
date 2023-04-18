<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/nuevaEmpresa" var="linkServletNUevaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkServletNUevaEmpresa}" method="post">
	 	<label for="nombre">Nombre empresa:</label>
	 	<input type="text" name="nombre" id="nombre"/>
	 	<input type="submit" value="Enviar" />
	</form>
</body>
</html>