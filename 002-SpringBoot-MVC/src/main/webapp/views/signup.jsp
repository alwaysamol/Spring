<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5 border p-3 shadow">
		<h2 class="text-center mb-4">User Registration Form</h2>
		<form action="register-user" method="post">
			<div class="row mb-3">
				<div class="col-md-6">
					<label for="username" class="form-label">Username</label> <input
						type="text" class="form-control" id="username" name="username"
						placeholder="Enter Username" required>
				</div>
			</div>

			<div class="row mb-3">
				<div class="col-md-6">
					<label for="password" class="form-label">Password</label> <input
						type="password" class="form-control" id="password" name="password"
						placeholder="Enter Password" required>
				</div>
				<div class="col-md-6">
					<label for="mono" class="form-label">Mobile Number</label> <input
						type="tel" class="form-control" id="mono" name="mono"
						placeholder="Enter Mobile Number" required>
				</div>
			</div>

			<div class="mb-3">
				<label for="email" class="form-label">Email</label> <input
					type="email" class="form-control" id="email" name="email"
					placeholder="Enter Email" required>
			</div>

			<div class="text-center">
				<button type="submit" class="btn btn-primary">Submit</button>
				<button type="reset" class="btn btn-secondary">Reset</button>
			</div>
		</form>
	</div>
</body>
</html>