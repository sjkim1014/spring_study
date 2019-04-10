<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<meta charset="UTF-8">

<script src="https://code.jquery.com/jquery-2.2.4.min.js"> </script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#logout").click(function () {
			location.href = "/interceptor/logout";
		});
		$("#login").click(function () {
			location.href = "/interceptor/login";
		});
		$("#admin").click(function () {
			location.href = "/interceptor/admin/main";
		});
	});
</script>

<title>Insert title here</title>
</head>
<body>

login : ${login }
nick : ${nick }

<h1>main</h1>
<hr>
<c:if test="${empty login }">
<button id="login">로그인하기</button>
</c:if>

<c:if test="${login }">
${nick } 님 환영합니다! <br><br>
<button id="logout">로그아웃하기</button>
<hr>
<button id="admin">관리자페이지</button>
</c:if>

<a href="/board/list"><button> 게시판 목록 </button></a>

</body>
</html>