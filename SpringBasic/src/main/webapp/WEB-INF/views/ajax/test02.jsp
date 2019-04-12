<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript">

$(document).ready(function (){

	$("#ajax").click(function (){
		
		$.ajax({
			
			type:"get"
			, url: "/ajax/test02_ok"
			, data: { }	/* 요청데이터 {name: "abc"} */
			, dataType: "json"
			, success: function (res) {
				console.log("성공");
				console.log(res.data1);
				console.log(res.data2);
				$("#resultDiv").html(res.data1 + "<br>" + res.data2);
			}
			, error: function ( e ){
				console.log("실패");
				console.log(e);
			}
		})
	})
});

</script>

<h1>AJAX 테스트 02</h1>
<hr>

<button id="ajax"> AJAX 요청 보내기</button>

<div id="resultDiv"></div>
