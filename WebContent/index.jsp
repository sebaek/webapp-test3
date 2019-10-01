<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>다음</h1>

	<%--

	<%
		User user = (User) request.getAttribute("user");
		if (user == null) {
	%>
	<a href="/webapptutorial3/login">login</a>
	<%
		} else {
			out.print(user.getNickName());
			out.print("님 반갑습니다.");
		}
	%>
 --%>

	<c:if test="${empty user }">
		<a href="/webapptutorial3/login">login</a>
	</c:if>
	<c:if test="${not empty user }">
		<p>${user.nickName }님 반갑습니다.</p>
		<a href="/webapptutorial3/logout">logout</a>
	</c:if>





</body>
</html>