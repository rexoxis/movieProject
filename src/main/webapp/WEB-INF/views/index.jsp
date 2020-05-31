<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/resources/css/index.css">
    <!-- 파비콘 설정 -->
    <link rel="shortcut icon" href="#">
<%--    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@600&display=swap" rel="stylesheet">--%>
<%--    <script src="/resources/js/main.js" defer></script>--%>
    <title>Movie main</title>
</head>
<body>
    <%@include file="layout/header.jsp"%>

    <div class="main">
        <div class="banner"><img src="/resources/img/main_slider01.jpg" alt="Banner"></div>
        <div class="showing_movie">현재상영작</div>
        <ul class="middle">
            <li class="image1"><img src="/resources/img/poster04.jpg" alt="Poster"></li>
            <li class="image2"><img src="/resources/img/movie_poster1.jpg" alt=""></li>
            <li class="image3"><img src="/resources/img/poster01.jpg" alt=""></li>
            <li class="image4"><img src="/resources/img/poster01.jpg" alt=""></li>
            <li class="image5"><img src="/resources/img/poster01.jpg" alt=""></li>
            <li class="image6"><img src="/resources/img/poster01.jpg" alt=""></li>
        </ul>
    </div>
    <%@include file="layout/footer.jsp"%>

</body>
</html>
