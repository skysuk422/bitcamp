<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<title>게시물관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="/header.jsp/">
<h1>게시물 추가</h1>
<form action="add.jsp" method='post'>
<div class='form-group row'>
<label class='col-sm-2 col-form-label' for='title'>제목</label>
<div class='col-sm-10'>
<input class='form-control' id='title' type='text' name='title'>

</div>
</div>
<div class='form-group row'>
<label for='conts' class='col-sm-2 col-form-label'>내용</label>
<div class='col-sm-10'>
<input class='form-control' id='conts' type='text' name='conts'>

</div>
</div>
<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>추가</button>
</div>
</div>
</form>
<jsp:include page="/footer.jsp/">
</div>
<%@ include file="../jslib.txt"%>
</body>
</html>