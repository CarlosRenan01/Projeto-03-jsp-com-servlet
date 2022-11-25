<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Cadastro de Pessoas</title>
</head>
<body>
	<%
	String nome = request.getParameter("nome");
	int idade = Integer.parseInt(request.getParameter("idade"));
	float peso = Float.parseFloat(request.getParameter("peso"));
	String genero = request.getParameter("genero");
	%>
	
	<h1>Cadastro de Pessoas</h1>
	
	<p>A seguinte pessoa foi cadastrada com sucesso:</p>
	
	<p>
	Nome:<%=nome %><br>
	Idade:<%=idade %><br>
	Peso:<%=peso %><br>
	Genêro:<%=genero %>
	</p>
</body>
</html>