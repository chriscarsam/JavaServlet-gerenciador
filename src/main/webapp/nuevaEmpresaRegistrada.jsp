<%
	String empresa = (String)request.getAttribute("empresa");
	System.out.println(empresa);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Empresa <%=empresa%> registrada!
</body>
</html>