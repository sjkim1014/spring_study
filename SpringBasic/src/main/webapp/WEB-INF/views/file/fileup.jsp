<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<h1>파일업로드 폼</h1>
<hr>

<form action="/file/fileup" method="post" enctype="multipart/form-data">
	<label for="title">제목</label>
	<input type="text" name="title" id="title" /> <br>
	
	<label for="file">첨부파일</label>
	<input type="file" name="file" id="file" /> <br><br>
	
	<button>전송</button>
	
</form>
