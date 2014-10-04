<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accueil</title>
</head>
<body>
	<p>${viewModel.nom}</p>
	<p>${viewModel.prenom}</p>

	<c:forEach var="viewModel2" items="${viewModel.list}">
		<p>${viewModel2.nom}</p>
		<p>${viewModel2.prenom}</p>
	</c:forEach>
</body>
</html>