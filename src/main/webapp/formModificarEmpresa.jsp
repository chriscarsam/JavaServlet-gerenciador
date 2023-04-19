<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/modificarEmpresa" var="linkServletNUevaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkServletNUevaEmpresa}" method="post">
	
	 	<label for="nombre">Nombre empresa:</label>
	 	<input type="text" name="nombre" id="nombre" value="${ empresa.nombre }"/>
	 	<label for="fecha">Fecha abertura:</label>
	 	<input type="text" name="fecha" id="fecha" value="<fmt:formatDate value="${ empresa.fechaAbertura }" pattern="dd/MM/yyyy"/>"/>
	 	<input type="submit" value="Enviar" />
	 	
	</form>
</body>
</html>