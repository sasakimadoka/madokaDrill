<html >
<head>

<title>　■問題回答ページ■</title>

</head>
<body>

<form method="post" action="./AnswerRegistServlet">
<p>回答者指名<br>
<input type="int" name="text1" size="30" maxlength="10"></p>
<p>回答者ID<br>
<input type="varchar" name="text2" sizr="30" maxlength="8">

<p>問題内容<br>
//ここに問題内容を印字したい
<p>回答欄<br>
<textarea name="text4" cols="20" rows="10"　maxlength='100'></textarea></p>

<p>
<input type="submit" value="確定する">
<a href="./student.jsp">戻る</a><br>
</p>

</body>
</html>