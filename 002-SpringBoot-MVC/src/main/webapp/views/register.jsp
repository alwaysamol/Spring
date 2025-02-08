<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
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
				<h1 class="text-center fs-2">Register Page</h1>
				<form action="save-student" method="post">
				<input type='text' class="form-control mt-2" placeholder="Enter Name" name="name">
				<input type='text' class="form-control mt-2" placeholder="Enter Email Id" name="email">
					<input type='text' class="form-control mt-2" placeholder="Enter Mobile Number" name="mono">
						<input type='text' class="form-control mt-2" placeholder="Enter Qualification" name="qualification">
							<input type='text' class="form-control mt-2" placeholder="Enter city" name="city">
				<input type='submit'  class="btn btn-dark mt-2 w-100" value="Submit">
				</form>
			</div>
		</div>
	</div>
</body>
</html>