package lsh.movie.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MoveController {

    // 회원가입
    @RequestMapping("/join/joinmember")
    public String joinMember(){
        return "join/join";
    }

    // 회원가입 완료
    @RequestMapping("/join/joinok")
    public String joinOk() {
        return "join/joinok";
    }

    // 로그인
    @RequestMapping("/login/login")
    public String login() {
        return "login/login";
    }

    // 로그아웃
    @RequestMapping("/login/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "index";
    }

    // 메인화면
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    // 영화목록/상영작
    @RequestMapping("/movie/movies")
    public String movies(){
        return "movie/movies";
    }

    // 영화목록/개봉예정작
    @RequestMapping("/movie/comingsoon")
    public String comingSoon(){
        return "movie/comingsoon";
    }

    // 영화상세
    @RequestMapping("/movie/movie_detail")
    public String movie_detail(){
        return "movie/movie_detail";
    }

    // 상영정보 등록
    @RequestMapping("/movie/movie_register")
    public String movie_register(){
        return "movie/movie_register";
    }

    // 영화 예매
    @RequestMapping("/movie/reserve")
    public String reserve(){
        return "movie/reserve";
    }

    // 지점, 상영관, 좌석 등록
    @RequestMapping("/movie/theater_register")
    public String theater_register(){
        return "movie/theater_register";
    }

}
