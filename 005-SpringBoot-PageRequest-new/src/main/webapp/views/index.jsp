<%@page import="java.util.Map"%>
<%@page import="com.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Product Table</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<%
		List<Product> pList = (List<Product>) request.getAttribute("data");
	    //Long totalCount =(long) request.getAttribute("totalcount");
	    //Long searchCount =(long) request.getAttribute("searchcount");
	
	%>

	<div class="container mt-5">
		<p>1 Record Found Over 100 Records</p>
		<div class="row">
			<div class="col text-center">
			
			<form action="search-by-name">
			<input type="text" class="form-control" name="text">
			<button class="btn btn-outline-info">Search</button>
			</form>
			
				<h2>Product Table</h2>
			</div>
		</div>

		<!-- Table Section -->
		<div class="row">
			<div class="col">
			Sort: <a href='lowtohigh'>low to high</a>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th scope="col">Product ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Product Price</th>
						</tr>
					</thead>
					<tbody>
						<%
							for (Product p : pList) {
						%>
						<tr>
							<td><%=p.getPid()%></td>
							<td><%=p.getPname()%></td>
							<td><%=p.getPprice()%></td>
						</tr>
						<%
							}
						%>
						<!-- You can add more rows here -->
					</tbody>
				</table>

				<nav aria-label="Page navigation example mt-3">
					<ul class="pagination">
						<li class="page-item"><a class="page-link" href="/">Previous</a></li>
						<li class="page-item"><a class="page-link" href="first-page">1</a></li>
						<li class="page-item"><a class="page-link" href="second-page">2</a></li>
						<li class="page-item"><a class="page-link" href="#">3</a></li>
						<li class="page-item"><a class="page-link" href="#">Next</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>

</body>
</html>