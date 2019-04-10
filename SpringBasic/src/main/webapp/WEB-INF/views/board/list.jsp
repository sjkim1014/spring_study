<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">

td {
	text-align:center;
}


</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<h2>게시판 목록</h2>
<hr>
<body>
   <div>
      <table>
         <colgroup>
            <col width="10%">
            <col width="*">
            <col width="20%">
            <col width="20%">
            <col width="20%">         
         </colgroup>
         <thead>
            <tr>
               <th>번호</th>
               <th>제목</th>
               <th>작성자</th>
               <th>작성일</th>
               <th>조회수</th>
            </tr>
         </thead>
         <tbody>
			<tr>
				<td>1</td>
				<td>게시글 테스트</td>
				<td>김수정</td>
				<td>2019/04/10</td>
				<td>30</td>
			</tr>
			<tr>
				<td>2</td>
				<td>게시글 테스트</td>
				<td>김수정</td>
				<td>2019/04/10</td>
				<td>30</td>
			</tr> 
			<tr>
				<td>3</td>
				<td>게시글 테스트</td>
				<td>김수정</td>
				<td>2019/04/10</td>
				<td>30</td>
			</tr>          
		</tbody>
      </table>
      <br><br>
      <a href="/board/write"><button>글작성</button></a>
   </div>
</body>
</html>