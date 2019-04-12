<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript">

$(document).ready(function (){

	$("#ajax").click(function (){
		
		$.ajax({
			
			type:"get"
			, url: "/ajax/test03_ok"
			, data: { }	/* 요청데이터 {name: "abc"} */
			, dataType: "json"
			, success: function (res) {
				console.log("성공");
				console.log(res.id);
				console.log(res.pw);
				$("#resultDiv").html(" 아이디  : "+ res.id + "<br>" + "비밀번호 : " +res.pw);
			}
			, error: function ( e ){
				console.log("실패");
				console.log(e);
			}
		})
	})
});

</script>

<h1>AJAX 테스트 03</h1>
<hr>

<button id="ajax"> AJAX 요청 보내기</button>

<div id="resultDiv"></div>
