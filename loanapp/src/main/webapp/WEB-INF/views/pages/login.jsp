<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<jsp:include page="../templates/head.jsp"></jsp:include>
<link href="css/login.css" rel="stylesheet">
</head>

<body class="text-center">
	<form class="form-signin"
		action="${pageContext.request.contextPath}/login"
		modelAttribute="loginFormData" method="post">

		<img class="mb-4"
			src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg"
			alt="" width="72" height="72">

		<h1 class="h3 mb-3 font-weight-normal">Bem vindo Cliente/Coletor</h1>

		<label for="inputEmail" class="sr-only">Código do cliente</label> <input
			type="number" id="inputEmail" class="form-control"
			placeholder="Código do Cliente" name="customerCode" required
			autofocus> <label for="inputPassword" class="sr-only">Password</label>

		<input type="password" id="inputPassword" class="form-control"
			placeholder="Password" name="password" required>

		<div class="form-check form-check-inline mt-2 mb-2">
			<input class="form-check-input" type="radio" name="clientType"
				id="inlineRadio1" value="1"> <label class="form-check-label"
				for="inlineRadio1">Cliente</label>
		</div>
		<div class="form-check form-check-inline mt-2 mb-2">
			<input class="form-check-input" type="radio" name="clientType"
				id="inlineRadio2" value="2"> <label class="form-check-label"
				for="inlineRadio2">Coletor</label>
		</div>

		<button class="btn btn-lg btn-primary btn-block mt-3" type="submit">Logar</button>
		<p class="mt-5 mb-3 text-muted">&copy; 2020</p>

		<label id="alertMessage" class="sr-only">${message}</label>

	</form>


	<script src="component/alert/alert.component.js"></script>
	<script src="js/login.js"></script>
</body>

</html>