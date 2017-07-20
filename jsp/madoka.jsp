<html >
<head>

<title>　■問題出題ページ■</title>

</head>
<body>

<form method="post" action="./QuestionRegistServlet">
<p>出題者指名<br>
<input type="text" name="text1" size="30" maxlength="10"></p>
<p>種別ラジヲボタン<br>
<input type="radio" name="q1" value="国語"> 国語
<input type="radio" name="q1" value="数学"> 数学
<input type="radio" name="q1" value="理科"> 理科
<input type="radio" name="q1" value="社会"> 社会
<input type="radio" name="q1" value="英語"> 英語
<input type="radio" name="q1" value="情報"> 情報
<input type="radio" name="q1" value="その他"> その他
</p>
<p>問題内容<br>
<textarea name="text2" cols="40" rows="10"　maxlength='200'></textarea></p>
<p>答え<br>
<textarea name="text3" cols="20" rows="10"　maxlength='100'></textarea></p>
<input type="submit" value="確定する">
<a href="./teacher.jsp">戻る</a><br>
</p>

</body>
</html>