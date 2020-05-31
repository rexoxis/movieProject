package lsh.movie.mvc.restController;

import lsh.movie.mvc.service.MemberService;
import lsh.movie.mvc.vo.Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;


@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    // 회원가입
    @RequestMapping(value = "/members", method = RequestMethod.POST)
    public String insertMember(@RequestBody HashMap<String, String> joinData){
        String msg = "fail";

//        System.out.println("request params : " + joinData);
//        System.out.println("name : " + joinData.get("name"));

        Members member = new Members();

        member.setName(joinData.get("name"));
        member.setUserid(joinData.get("userid"));
        member.setPasswd(joinData.get("passwd"));
        member.setZipcode(joinData.get("zipcode"));
        member.setAddr(joinData.get("addr"));
        member.setEmail(joinData.get("email"));
        member.setPhone(joinData.get("phone"));

        int check = memberService.insertMember(member);

        if (check > 0) {
            msg = "success";
        }

        return msg;
    }

    // 로그인
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String selectLogin(@RequestBody HashMap<String, String> loginData, HttpSession session){
        String msg = "fail";

        String resultUserid = memberService.selectLogin(loginData);

//        System.out.println("resultUserid : " + resultUserid);

        if (resultUserid != null) {
            session.setAttribute("userid", resultUserid);
            msg = "success";
        }

        return msg;
    }

}
