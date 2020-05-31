package lsh.movie.mvc.service;

import lsh.movie.mvc.dao.MemberDAO;
import lsh.movie.mvc.vo.Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MemberService {

    @Autowired
    private MemberDAO memberDAO;

    public int insertMember(Members member) {
        return memberDAO.insertMember(member);
    }

    public String selectLogin(HashMap<String, String> loginData) {
        return memberDAO.selectLogin(loginData);
    }
}
