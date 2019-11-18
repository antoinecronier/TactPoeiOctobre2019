<%@ page import="com.tactfactory.tactpoeioctobre2019.entites.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
User user = (User) request.getAttribute("THE_USER");
String validatePhrase = "";
if(user.getIsValidate()){
  validatePhrase = "il est validé";
}else{
  validatePhrase = "il est invalide";
}

%>
<div>
	<%= user.getFirstname() %>
</div>
<div>
	<%= user.getLastname() %>
</div>
<div>
	<%= validatePhrase %>
</div>
<%-- <%= user.getIsValidate() ? "il est validé" : "il est invalide" %> --%>
</body>
</html>