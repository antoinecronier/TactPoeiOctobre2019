<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="com.tactfactory.tactpoeioctobre2019.entites.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%! private List<User> users = new ArrayList<User>();%>
<%
  try {
    users = (List<User>) request.getAttribute("users");
  } catch (Exception e) {
    out.append(e.getMessage());
  }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
	<table class="table">
		<tr>
			<th scope="col">Id</th>
			<th scope="col">Firstname</th>
			<th scope="col">Lastname</th>
			<th scope="col">Validation</th>
			<th scope="col">Money</th>
			<th scope="col">Date Of Birth</th>
		</tr>
		<%
		  for (User user : users) {
		%>
		<tr>
			<td><%= user.getId() %></td>
			<td><%= user.getFirstname() %></td>
			<td><%= user.getLastname() %></td>
			<td><%= user.getIsValidate() %></td>
			<td><%= user.getMoney() %></td>
			<td><%= user.getdOb() %></td>
		</tr>
		<%
		  }
		%>
	</table>
</body>
</html>