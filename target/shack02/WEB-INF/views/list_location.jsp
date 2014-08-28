<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <%--use redirect--%>
    <meta http-equiv=”refresh” content=”0; url=http://localhost:8080/location/list_location.do”>

    <%--include css--%>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/bootstrap-theme.css" rel="stylesheet">
    <link href="/css/bootstrap.css.map" rel="stylesheet">
    <link href="/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="/css/bootstrap-theme.css.map" rel="stylesheet">


<title>Insert title here</title>
</head>
<body>
<p>총 데이터 갯수 : ${listSize}</p>
<a href="../index.do">go home</a></br>
<c:forEach var="location" begin="0" end="5" items="${listLocation}" >
    <form action="./update.do" method="post">
    위도 : ${location.latitude}, 경도 : ${location.longitude}, 시간 : ${location.time}
        <input type="hidden" value="${location.id}" name="id"/>
        <input type="submit" value="수정"/>
        <a href="./del_location.do?id=${location.id}">삭제</a>
    </form>
</c:forEach>


</body>
</html>