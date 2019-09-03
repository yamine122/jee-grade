<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적관리프로그램</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h1>정보를 입력해주세요</h1>
<form id="grade" action="<%= request.getContextPath()%>/student.do">
	이름 :<input type="text" name="name" /><br />
	주민번호 : <input type="text" name="ssn"/><br />
	국어 : <input type="text" name="kor"/><br />
	영어 : <input type="text" name="eng"/><br />
	수학 : <input type="text" name="math"/><br />
	사회 : <input type="text" name="soc"/><br />
		<input type="submit" value="전송" /><br />
</form>
<script>
$('#grade').submit(function(){
	alert('연결확인');		
});
</script>
</body>
</html>