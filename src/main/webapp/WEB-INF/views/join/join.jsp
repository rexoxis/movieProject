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

        <h3>회원가입</h3>

        <form id="joinfrm">
            <div class="joinform">

                <div class="name">
                    <label for="name">이름</label>
                    <input type="text" id="name" name="name">
                </div>

                <div class="userid">
                    <label for="userid">아이디</label>
                    <input type="text" id="userid" maxlength="16" name="userid">
                    <button type="button" id="checkid">중복체크</button>
                </div>

                <div class="passwd">
                    <label for="passwd">비밀번호</label>
                    <input type="password" id="passwd" name="passwd" maxlength="16">
                </div>

                <div class="repasswd">
                    <label for="repasswd" class="">비밀번호 확인</label>
                    <input type="password" id="repasswd" name="repasswd" maxlength="16">
                </div>

                <div class="zipcode">
                    <label for="zipcode">우편번호</label>
                    <input type="text" id="zipcode" name="zipcode">
                    <button class="btn btn-dark" type="button" id="zipcodefind">
                        <i class="fa fa-question-circle">&nbsp;우편번호 찾기</i>
                    </button>
                </div>

                <div class="addr">
                    <label for="addr1" class="">주소</label>
                    <input type="text" id="addr1" name="addr1">
                    &nbsp;
                    <input type="text" id="addr2" name="addr2" placeholder="상세 주소 입력">

                </div>

                <div class="email">
                    <label class="" for="email1">
                        전자우편 주소
                    </label>
                    <input type="text" id="email1" name="email1">
                    <span style="margin-top: 6px">&nbsp;@</span>
                    <input type="text" id="email2" name="email2" readonly>&nbsp;
                    <select id="sendemail" name="sendemail">
                        <option>선택하세요</option>
                        <option value="naver.com">naver.com</option>
                        <option value="daum.net">daum.com</option>
                        <option value="gmail.com">gmail.com</option>
                        <option value="myemail">직접입력</option>
                    </select>
                </div>

                <div class="tel">
                    <label for="hp1" >개인 연락처</label>
                    <select id="hp1" name="hp1" >
                        <option>선택하세요</option>
                        <option value="011">011</option>
                        <option value="010">010</option>
                        <option value="019">019</option>
                    </select>&nbsp;
                    <label>-</label>&nbsp;
                    <input type="text" id="hp2" name="hp2" >&nbsp;
                    <label>-</label>
                    <input type="text" id="hp3" name="hp3">
                </div>

            </div>

            <div class="formbtn" >
                <button type="button" id="joinokbtn"> 입력완료</button>
                <button type="button" id="cancelbtn"> 취소하기</button>
            </div>
        </form>
    </div>

    <%@include file="../layout/footer.jsp"%>

<script src="https://code.jquery.com/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="/resources/js/joinCheck.js" type="text/javascript"></script>

</body>
</html>
