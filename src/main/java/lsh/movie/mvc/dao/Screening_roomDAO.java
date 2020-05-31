package lsh.movie.mvc.dao;

import lsh.movie.mvc.vo.Screening_room;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Screening_roomDAO {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public List<Screening_room> selectRoom(int theater_no) {
        return sqlSessionTemplate.selectList("screening_room.selectRoom", theater_no);
    }
}
