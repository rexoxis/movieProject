<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" href="/resources/css/join.css">
    <!-- 파비콘 설정 -->
    <link rel="shortcut icon" href="#">
    <title>Join</title>
</head>

<body>
    <%@include file="../layout/header.jsp"%>

    <div class="main">

        <h2>회원가입 완료</h2>

        <h3>회원가입을 축하드립니다! 즐거운 시간되세요~</h3>

        <div>
            <button type="button" id="mainbtn">메인으로</button>
            <button type="button" id="loginbtn">로그인하기</button>
        </div>
    </div>

    <%@include file="../layout/footer.jsp"%>

<script src="https://code.jquery.com/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="/resources/js/joinok.js" type="text/javascript"></script>

</body>
</html>
