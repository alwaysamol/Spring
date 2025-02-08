<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<%
String user =(String) session.getAttribute("username");
%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Teknowell Edutech</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="refresh-page">Home</a>
        </li>
      
      </ul>
      <p class="lead mr-4 text-center">Welcome..<%=user %></p>
      <i class="fa-solid fa-user"></i>
      <form class="d-flex" action="search-record">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="record">
        <button class="btn btn-outline-dark" type="submit">Search</button>
      </form>
      <a href="logout" class="btn btn-outline-danger">Logout</a>
      
    </div>
  </div>
</nav>
</body>
</html>