<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/webapptutorial3/login" method="post">
<label for="id">아이디 : </label><input type="text" name="id" id="id"><br>
<label for="password">패스워드 : </label><input type="password" name="password" id="password"><br>
<input type="submit" />

</form>
<%-- <%
String error = (String) request.getAttribute("error");
if (error != null) {
	out.print(error);
}

%> --%>
${error } 


</body>
</html>