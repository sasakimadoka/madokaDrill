<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import= "javax.servlet.http.HttpSession" %>
<%@ page import= "beans.Answer" %>
<%@ page import= "java.util.ArrayList" %>
<%
Answer answer = (Answer)request.getAttribute("answer");
%>
<%
ArrayList list =  (ArrayList)request.getAttribute("answer-list");
%>

<HTML>
<head>
<title>回答</title>
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
<font size="4"  >回答閲覧</font>
</div>
<br>
<br>
<br>
<br>
<br>

<div align="left">

<P>
<form method="post" action="./AnswerRegistServlet"><br>
　■問題タイトル<br>
<font size="+2"><%=answer.getTitle()%></font><br>
<br>
　■回答者氏名<br>
<font size="+2"><%=answer.getStudent_name()%></font><br>
<br>
　■回答<br>
<font size="+2"><%=answer.getStudent_answer()%></font><br>
<br>
　■感想<br>
<font size="+2"><%=answer.getImpression()%></font><br>
<br>

<FORM method="POST" action = "./SerchAnswerServlet">
<input type="hidden" value="<%=answer.getUser_id()%>"></p>
<input type="submit" value="戻る">


</form>

</BODY>
</HTML>