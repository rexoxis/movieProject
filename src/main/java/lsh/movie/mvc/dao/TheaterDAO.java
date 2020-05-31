package lsh.movie.mvc.dao;

import lsh.movie.mvc.vo.Theater;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TheaterDAO {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public List<Theater> selectAllList() {
        return sqlSessionTemplate.selectList("theater.selectAllList");
    }
}
