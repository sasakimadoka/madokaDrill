<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page import= "beans.Answer" %>
<%@ page import= "java.util.ArrayList" %>
<%
ArrayList list =  (ArrayList)request.getAttribute("answer-list");
%>

<HTML>
<head>
<title>　□タイトル一覧■　</title>
</head>

<body bgcolor="#ccffff">

<SCRIPT language="JavaScript">

</SCRIPT>
<font size="7"> ■タイトル一覧■</font>
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
       <%Answer answer = (Answer)list.get(i);%>
        <TR>
       <TD><FONT><a href="./SelectAnswerServlet?title=<%=answer.getTitle()%>"><%=answer.getTitle()%></a></FONT></TD>
        </TR>
      <% } %>
   </TBODY>
</TABLE>
</FORM>


      <FONT><h2><a href="./serch.jsp">戻る</a></h></FONT>


</BODY>
</HTML>