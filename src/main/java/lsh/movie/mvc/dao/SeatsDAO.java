package lsh.movie.mvc.dao;

import lsh.movie.mvc.vo.Seats;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SeatsDAO {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public int countSeats(int showing_no) {
        return sqlSessionTemplate.selectOne("seats.countSeats", showing_no);
    }

    public List<Seats> selectSeats(int showing_no) {
        return sqlSessionTemplate.selectList("seats.selectSeats", showing_no);
    }
}
