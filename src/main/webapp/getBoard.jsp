<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "com.spring.board.BoardDTO" %>

<%
	//session애 저장된 값을 가지고 온다.
	BoardDTO board = (BoardDTO) session.getAttribute("board");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 글 상세 페이지 </title>
</head>
<body>
<%-- 
<%= board.getSeq() %><br>
<%= board.getTitle() %><br>
<%= board.getWriter() %><br>
<%= board.getContent() %><br>
<%= board.getRegDate() %><br>
<%= board.getCnt() %><br>
 --%>
<center>
	<h1> 글 상세 페이지 </h1>
	<a href = "logout.do">Log-Out</a>
	<hr>
	<!-- 폼의 value에 출력 -->
	
	<form action = "updateBoard.do" method = "post">
	<!--  updateBoard.do 페이지로 넘길 떄 seq -->
	<!--  출력구문에는 나타나지 않고 변수값 넘길 떄 사용 -->
	<input type = "hidden" name ="seq" value="<%= board.getSeq() %>">
	
		<table border="1" cellspacing ="0" cellpadding="0">
			<tr>
				<td bgcolor="orange" width="70">제목</td>
				<td><input type="text" name = "title" value ="<%= board.getTitle() %>"></td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">작성자</td>
				<td><%= board.getWriter() %></td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">내용</td>
				<td><textarea name = "content" cols="40" rows="10"><%= board.getContent() %>
				</textarea></td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">등록일</td>
				<td> <%= board.getRegDate() %> </td>
			</tr>
			<tr>
				<td bgcolor="orange" width="70">조회수</td>
				<td><%= board.getCnt() %></td>
			</tr>
			<tr>
				<td colspan ="2" align = "right"><input type="submit" value="글 수정"></td>
			</tr>
		</table>
	</form>
	<p/>
	<a href = "insertBoard.jsp"> 글 등록</a> &nbsp;&nbsp;&nbsp;
	<a href = "deleteBoard.do?seq=<%= board.getSeq() %>"> 글 삭제 </a>&nbsp;&nbsp;&nbsp;
	<a href = "getBoardList.do">글 목록</a>

</center>
</body>
</html>