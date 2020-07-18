<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<jsp:include page="../templates/head.jsp"></jsp:include>
<link href="css/login.css" rel="stylesheet">
</head>

<body class="text-center bg-dark">
	<div class="container">
		<div class="row">
			<div class="col-md">
				<form class="form-signin"
					action="${pageContext.request.contextPath}/login"
					modelAttribute="loginFormData" method="post">

					<div class="card shadow" style="width: 18rem;">
						<div class="card-body">
							<span class="fa-stack fa-2x"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fas fa-hand-holding-usd fa-stack-1x fa-inverse"></i>
							</span>

							<div class="h3 mb-3 font-weight-normal">Bem vindo
								Cliente/Coletor</div>

							<label for="inputEmail" class="sr-only">Código do cliente</label>
							<input type="number" id="inputEmail" class="form-control" placeholder="Código do Cliente" required autofocus>
							 
							<label for="inputPassword" class="sr-only">Password</label> 
							<input type="password" id="inputPassword" class="form-control" placeholder="Password" required>

							<div class="form-check form-check-inline mt-2 mb-2">
								<input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" checked> 
								<label class="form-check-label" for="inlineRadio1">Cliente</label>
							</div>
							
							<div class="form-check form-check-inline mt-2 mb-2">
								<input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
								<label class="form-check-label" for="inlineRadio2">Coletor</label>
							</div>

							<button class="btn btn-sm btn-outline-dark btn-block mt-3" type="submit">Logar</button>
							
							<label id="alertMessage" class="sr-only">sadasdasd</label>
							
						</div>
					</div>
				</form>
			</div>
			<nav class="navbar fixed-bottom navbar-light bg-light">
				<div class="row">
					<div class="col-md">
						<small class="mt-5 mb-3 text-muted">&copy; LoanAPP 2020</small>
					</div>
				</div>
			</nav>
		</div>

	</form>


	<script src="component/alert/alert.component.js"></script>
	<script src="js/login.js"></script>
</body>

</html>