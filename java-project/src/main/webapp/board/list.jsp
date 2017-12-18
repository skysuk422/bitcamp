<%@page import="java100.app.domain.Board"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.BoardDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>


<!DOCTYPE html>
<html>
<head>
<title>게시판관리</title>
<link rel='stylesheet'
	href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
	<div class='container'>
	<jsp:include page="/header.jsp/">
		<h1>게시판 목록</h1>
		<p>
			<a href='form.jsp' class='btn btn-outline-info'>추가</a>
		</p>
		<table class='table table-hover'>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>등록일</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<%
				    BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
%>
<%
				    try {

				        List<Board> list = boardDao.selectList();

				        for (Board board : list) {
				        %>
				                    <tr>
				                    <td><%=board.getNo() %></td>
				                    <td><a href='view.jsp?no=%d'><%=board.getTitle() %></a>"
				                    <td><%=board.getRegDate() %></td>
				                    <td><%=board.getViewCount() %></td>
				                    </tr>
				                    <% 
				        }

				    } catch (Exception e) {
				        e.printStackTrace(); // for developer %>
				        <%=e.getMessage()%>
				        <% 
				    }
				%>

			</tbody>
		</table>
		<jsp:include page="/footer.jsp/">
	</div>
	<%@ include file="../jslib.txt"%>
</body>
</html>

