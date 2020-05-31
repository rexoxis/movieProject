<%--
  Created by IntelliJ IDEA.
  User: leeseunghoon
  Date: 2020-04-23
  Time: 오전 1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>fileTest</title>
</head>
<body>
<div>
    <div>
        <button id="test">테스트</button>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" type="text/javascript"></script>
<script>
    $("#test").click(function () {
        $.ajax({
            url: "/tests/test/",
            type: "POST",
            data: {room_no:1}
        }).done(function (data) {
            console.log(data);
        }).fail(function (xhr) {
            console.log(xhr.staus);
            console.log(xhr.responseText);
        });

    })
    // let test = '라라랜드';
    // let test2 = '강남';
    // let test3 = '22';
    // let test4 = '2020-03-31';
    // $('document').ready(function () {
    //     loadData(test4);
    // });
    //
    // // 영화 상세정보 조회
    // function loadData(test4) {
    //     $.ajax({
    //         url: "/theaters/movie/"+test4,
    //         type: "GET",
    //         dataType: "json"
    //     }).done(function (data) {
    //         console.log(data);
    //     }).fail(function (xhr) {
    //         console.log(xhr.staus);
    //         console.log(xhr.responseText);
    //     });
    // }
</script>

</body>
</html>
