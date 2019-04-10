<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">


<title>Insert title here</title>
</head>
<body>

<h1>LOGIN</h1>
<hr>

<form action="/interceptor/login" method="post">

아이디 : <input type="text" name="id" > <br>
패스워드 : <input type="password" name="pw" ><br>
<button type="submit">로그인하기</button>

</form>

</body>
</html>