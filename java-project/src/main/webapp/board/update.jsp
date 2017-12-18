<%@page import="java100.app.domain.Board"%>
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
<h1>게시물 변경</h1>
<%
BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(
        BoardDao.class);
%>
<%
try {
    Board board = new Board();
    board.setNo(Integer.parseInt(request.getParameter("no")));
    board.setTitle(request.getParameter("title"));
    board.setContent(request.getParameter("content"));

    if (boardDao.update(board) > 0) { %>
        <p>변경하였습니다.</p>
        <%
    } else {%>
        <p>'%s'의 성적 정보가 없습니다.</p>
        <%
    }

} catch (Exception e) {
    e.printStackTrace(); // for developer%>
    <%=e.getMessage()%>
    <%
}
%>
<p><a href='list.jsp' class='btn-outline-info btn-sm'>목록</a></p>
<jsp:include page="/footer.jsp/">
</div>
<%@ include file="../jslib.txt"%>
</html>
