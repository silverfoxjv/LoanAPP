<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <jsp:include page="../../templates/head.jsp"></jsp:include>
    <link href="css/login.css" rel="stylesheet">
</head>

<body class="text-center">
    <form class="form-signin">
        <img class="mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg" alt="" width="72"
            height="72">

        <h1 class="h3 mb-3 font-weight-normal">Bem vindo Cliente/Coletor</h1>

        <label for="inputEmail" class="sr-only">Código do cliente</label>
        <input type="number" 
			id="inputEmail" 
			class="form-control" 
			placeholder="Código do Cliente" 
			required autofocus> 
		<label for="inputPassword" class="sr-only">Password</label>

        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>

		<div class="form-check form-check-inline mt-2 mb-2">
			<input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
			<label class="form-check-label" for="inlineRadio1">Cliente</label>
		</div>
		<div class="form-check form-check-inline mt-2 mb-2">
			<input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
			<label class="form-check-label" for="inlineRadio2">Coletor</label>
		</div>

        <button class="btn btn-lg btn-primary btn-block mt-3" type="submit">Logar</button>
        <p class="mt-5 mb-3 text-muted">&copy; 2020</p>

    </form>
</body>

</html>