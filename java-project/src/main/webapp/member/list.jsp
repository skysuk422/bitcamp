<%@page import="java100.app.domain.Member"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    

<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="/header.jsp/">
<h1>회원 목록</h1>
<p><a href='form.jsp' class='btn btn-outline-info'>추가</a></p>
<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>이름</th><th>이메일</th><th>등록일</th>
</tr>
</thead>
<tbody>
<%
MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(
        MemberDao.class);
%>
<%
try {

    List<Member> list = memberDao.selectList();
    
    for (Member member : list) {%>
        <tr>
        <td><%=member.getNo() %></td>
        <td><a href='view.jsp?no=%d'><%=member.getName() %></a></td>
         <td><%=member.getEmail() %></td>
         <td><%=member.getCreatedDate() %></td>
         </tr>
  <%
    }

} catch (Exception e) {
    e.printStackTrace(); // for developer %>
    <%= e.getMessage()%>
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
