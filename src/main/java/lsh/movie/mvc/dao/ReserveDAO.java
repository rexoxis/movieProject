package lsh.movie.mvc.dao;

import lsh.movie.mvc.vo.Showing_Info;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReserveDAO {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<Showing_Info> countAllGroupByName() {
        return sqlSessionTemplate.selectList("reserve.groupByName");
    }

    public List<Showing_Info> countGroupByName(int movie_no) {
        return sqlSessionTemplate.selectList("reserve.groupByName",movie_no);
    }

    public List<Showing_Info> selectShowingMovies(Showing_Info showing_info) {
        return sqlSessionTemplate.selectList("reserve.selectShowMovies",showing_info);
    }
}
