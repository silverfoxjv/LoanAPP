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
					action="${pageContext.request.contextPath}/contract"
					modelAttribute="contractForm" method="post">

					<div class="card shadow" style="width: 18rem;">
						<div class="card-body">
							<span class="fa-stack fa-2x"> <i
								class="fas fa-circle fa-stack-2x"></i> <i
								class="fas fa-hand-holding-usd fa-stack-1x fa-inverse"></i>
							</span>

							<div class="h3 mb-4 font-weight-normal">Contrato</div>

							<div class="text-left h6 mb-3 font-weight-normal">Código do Cliente</div>
							<label for="inputCustomerId" class="sr-only">Código do
								Cliente</label> <input type="number" id="inputCustomerId"
								class="mb-3 form-control" placeholder="0" required
								autofocus> 
								
								<div class="text-left h6 mb-3 font-weight-normal">Taxa de Juros</div>
							<label for="inputInterest" class="sr-only">Valor
								de Capital</label> <input type="number" id="inputInterest" min="0" value="0" step="any"
								class="mb-3 form-control" placeholder="00.00" required>

							<div class="text-left h6 mb-3 font-weight-normal">Valor do Empréstimo</div>
							<label for="inputLoan" class="sr-only">Valor do
								Empréstimo</label> <input type="number" id="inputLoan" min="0" value="0" step="any"
								class="mb-3 form-control" placeholder="00.00" required>
								
							<div class="text-left h6 mb-3 font-weight-normal">Quantidade de Parcelas</div>
							<label for="inputQttInstallments" class="sr-only">Quantidade de Parcelas
							</label> <input type="number" id="inputQttInstallments" min="0" value="0"
								class="mb-3 form-control" placeholder="0" required>
								
							<button class="btn btn-sm btn-outline-dark btn-block mt-3"
								type="submit">Simular</button>


							<button class="btn btn-sm btn-outline-dark btn-block mt-3"
								type="submit">Submeter</button>

							<label id="alertMessage" class="sr-only">${message}</label>

						</div>
					</div>
				</form>
			</div>
		</div>
		<nav class="navbar fixed-bottom navbar-light bg-light">
			<div class="row">
				<div class="col-md">
					<small class="mt-5 mb-3 text-muted">&copy; LoanAPP 2020</small>
				</div>
			</div>
		</nav>
	</div>
</body>

</html>