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
<form method="post" action="./AnswerRegistServlet"><br></form>
<font size="+2"><%=question.getTitle()%></font><br>
<p><br>
<font size = "+2"><%=question.getTeacher_name()%></font></p>
<p>回答者指名<br>
<input type="string" name="student_name" size="30" ></p>
<p>回答者ID<br>
<input type="string" name="user_id" size="30" maxlength="8"></p>
<br>
<font size="+2"><%=question.getContent()%></font><br>
<br>
<p>回答欄<br>
<textarea name="student_answer" cols="20" rows="10"maxlength="100"></textarea ></p>
<p>感想欄<br>
<textarea name="impression" cols="20" rows="10"maxlength="200"></textarea ></p>


<FORM method="POST" action = "./AnswerRegistServlet">
<input type="submit" value="送信">
</form>

<FORM method="POST" action = "./GetQuestionServlet">
<input type="submit" value="問題選択へ戻る">
</form>

</BODY>
</HTML>