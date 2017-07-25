<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page import= "beans.Answer" %>
<%@ page import= "java.util.ArrayList" %>
<%
ArrayList list =  (ArrayList)request.getAttribute("answer-list");
%>

<HTML>
<head>
<title>　□生徒用ページ■　</title>
</head>


<body bgcolor="#ccffff">

<SCRIPT language="JavaScript">

</SCRIPT>
<font size="7"  >回答検索ページ</font>
<BR>
<font>表示されている問題：<%=list.size()%>件</font>
<br>
<br>
<br>
<br>
<FORM>　//全然わからない検索ページの作り方
<TABLE>
   <TBODY>
      <% for(int i=0;i<list.size();i++){ %>
       <%Question question = (Question)list.get(i);%>
        <TR>
         <TD><FONT><a href="./GetQuestionServlet?title=<%=question.getTitle()%>"><%=question.getTitle()%></a></FONT></TD>
        </TR>
      <% } %>
   </TBODY>
</TABLE>
</FORM>
</BODY>
</HTML>