<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.Date"
    pageEncoding="UTF-8"%>
<%-- webapp/c231010/jstl-test/fmt-test/index.jsp --%>
<%-- fmt : format, 언어 형식 --%>
<%-- JSTL => c, fmt, sql, x(XML), fn(function) --%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>원하는 언어로 즉각적인 적용</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
	<fmt:setLocale value="en_US" />
	<%--
	<fmt:setLocale value="ko_KR" />
	<fmt:setLocale value="en_US" />
	<fmt:setLocale value="ja_JP" />
	<fmt:setLocale value="zh_CN" />
	--%>
	<div id="locale" data-locale="ko_KR">
		<div id="name" data-name="test_ko.name"></div>
	</div>
	<%-- 파일의 위치는 WEB-INF/classes/student.properties --%>
	<%-- 파일의 위치는 WEB-INF/classes/student_ko.properties --%>
	<%-- 파일의 위치는 WEB-INF/classes/student_en.properties --%>
	<fmt:bundle basename="student" >
		<fmt:message key="student.name" /><br />
		<fmt:message key="student.className" /><br />
	</fmt:bundle>
	<fmt:setLocale value="ko_KR" />
	<fmt:setBundle basename="student" />
	<fmt:message key="student.name" /><br />
	<fmt:message key="student.className" /><br />
	<%-- l18n --%>
	<fmt:formatNumber value="1000" type="number" var="won" />
	${won }
	<fmt:formatNumber value="1000" type="currency" currencySymbol="\\" groupingUsed="true" />
	
	<c:set var="now" value="<%=new Date() %>" />
	<%-- java.util.Date --%>
	${now }
	<fmt:formatDate 
		value="${now }"
		pattern="YYYY / MM / dd - hh : mm : ss"
	/>
	<fmt:timeZone value="America/New York" >
		<fmt:formatDate 
			value="${now }" 
			type="time"
			dateStyle="full" 
			timeStyle="short"
		/><br />
	</fmt:timeZone>
	
	<button class="btn btn-danger btn-sm" disabled>부트스트랩 테스트</button>
	
	 <div id="carouselExampleCaptions" class="carousel slide">
      <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
      </div>
      <div class="carousel-inner">
        <div class="carousel-item active">
		  <svg class="bd-placeholder-img bd-placeholder-img-lg d-block w-100" width="800" height="400" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: First slide" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#777"></rect><text x="50%" y="50%" fill="#555" dy=".3em">First slide</text></svg>
          <div class="carousel-caption d-md-block">
            <h5>첫번째 내용입니다.</h5>
            <p>Some representative placeholder content for the first slide.</p>
          </div>
        </div>
        <div class="carousel-item">
          <svg class="bd-placeholder-img bd-placeholder-img-lg d-block w-100" width="800" height="400" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Second slide" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#666"></rect><text x="50%" y="50%" fill="#444" dy=".3em">Second slide</text></svg>
          <div class="carousel-caption d-none d-md-block">
            <h5>Second slide label</h5>
            <p>Some representative placeholder content for the second slide.</p>
          </div>
        </div>
        <div class="carousel-item">
          <svg class="bd-placeholder-img bd-placeholder-img-lg d-block w-100" width="800" height="400" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Third slide" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#555"></rect><text x="50%" y="50%" fill="#333" dy=".3em">Third slide</text></svg>
          <div class="carousel-caption d-none d-md-block">
            <h5>Third slide label</h5>
            <p>Some representative placeholder content for the third slide.</p>
          </div>
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>
	
	
	
</body>
</html>




