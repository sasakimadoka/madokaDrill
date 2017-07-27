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
<font size="7"  >生徒用ページ■問題一覧■</font>
<BR>
<font>表示されている問題：<%=list.size()%>件</font>
<br>
<br>
<br>
<br>
<FORM>
<TABLE>
   <TBODY>
      <% for(int i=0;i<list.size();i++){ %>
       <%Question question = (Question)list.get(i);%>
        <TR>
       <TD><FONT><a href="./QuestionReadServlet?title=<%=question.getTitle()%>"><%=question.getTitle()%></a></FONT></TD>
        </TR>
      <% } %>
   </TBODY>
</TABLE>
</FORM>
<FONT><h2><a href="./top.jsp">戻る</a></h></FONT>
</BODY>
</HTML>