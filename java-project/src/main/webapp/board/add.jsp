<%@page import="java100.app.domain.Board"%>
<%@page import="java100.app.domain.Score"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.BoardDao"%>
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
<%

BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(
        BoardDao.class);
%>
<% 
try {
    Board board = new Board();
    board.setTitle(request.getParameter("title"));
    board.setContent(request.getParameter("content"));

    boardDao.insert(board);%>
    <p>저장하였습니다.</p>
    <%

} catch (Exception e) {
    e.printStackTrace(); %>
    <%=e.getMessage()%>
    <%
}

%>

<p><a href='list.jsp' class='btn btn-info btn-sm'>목록</a></p>
<jsp:include page="/header.jsp/">
</div>
<%@ include file="../jslib.txt"%>
</body>
</html>