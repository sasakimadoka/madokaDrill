<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import= "javax.servlet.http.HttpSession" %>
<%@ page import= "beans.Question" %>
<%@ page import= "java.util.ArrayList" %>
<%
Question question = (Question)request.getAttribute("question");
%>
<%
ArrayList list =  (ArrayList)request.getAttribute("question-list");
%>

<HTML>
<head>
<title>問題</title>
<style type ="text/css">

p{
margin-top:2em;
margin-right:5em;
margin-bottom:2em;
margin-left:5em;
}
</style>
</head>
<body bgcolor="#ccffff">

<SCRIPT language="JavaScript">
</SCRIPT>
<div align="center">
<font size="7"  >WebDrillシステム</font>
</div>
<br>
<br>
<br>
<br>
<br>

<div align="left">

<P>
<form method="post" action="./SerchAnswerServlet"><br>
<p>ID検索<br>
<input type="string" name="user_id" size="30" maxlength="8"></p>

<FORM method="POST" action = "./SerchAnswerServlet">
<input type="submit" value="送信">
<FONT><h2><a href="./teacher.jsp">戻る</a></h></FONT>
</form>

</BODY>
</HTML>