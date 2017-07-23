<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page import= "beans.Question" %>
<%@ page import= "java.util.ArrayList" %>
<%
ArrayList list =  (ArrayList)request.getAttribute("question-list");
%>

<HTML>
<head>
<title>　□生徒用ページ■　</title>
</head>


<body bgcolor="#ccffff">

<SCRIPT language="JavaScript">

</SCRIPT>
<div align="center">
<font size="7"  >生徒用ページ■問題一覧■</font>
<BR>
<font>表示されている問題：<%=list.size()%>件</font>
<div/>
<br>
<br>
<br>
<br>
<div align="center">
<FORM>
<CENTER>
<TABLE border="0" cellpadding="0">
   <TBODY>
      <% for(int i=0;i<list.size();i++){ %>
       <%Question question = (Question)list.get(i);%>
        <TR>
         <TD><FONT><a href="./GetQuestionServlet?title=<%=question.getTitle()%>"><%=question.getTitle()%></a></FONT></TD>
        </TR>
      <% } %>
   </TBODY>
</TABLE>
</CENTER>
</FORM>
</BODY>
</HTML>