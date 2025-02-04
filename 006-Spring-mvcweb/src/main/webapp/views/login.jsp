<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-5 border shadow p-3 mt-4">
				<h1 class="text-center fs-2">Login Page</h1>
				<form action="login-check" method="post">
				<input type='text' class="form-control mt-2" placeholder="Enter Username" name="username">
				<input type='password' class="form-control mt-2" placeholder="Enter Password" name="password">
				<input type='submit'  class="btn btn-dark mt-2 w-100" value="Submit">
				</form>
			</div>
		</div>
	</div>

</body>
</html>