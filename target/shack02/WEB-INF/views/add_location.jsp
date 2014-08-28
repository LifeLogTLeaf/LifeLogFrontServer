<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html>
<head>
<body>
<form action="./add_result.do" method="post">
	latitude<input type="text" name="latitude" value="">
	longitude<input type="text" name="longitude" value="">
	<input type="submit" value="좌표 전송"/>
</form>
</body>

</head>
</html>