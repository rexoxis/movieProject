package lsh.movie.mvc.dao;

import lsh.movie.mvc.utils.PageMaker;
import lsh.movie.mvc.vo.Movie_Info;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Movie_InfoDAO {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public List<Movie_Info> selectAllList() {
        return sqlSessionTemplate.selectList("movies.selectAllMovies");
    }

    public List<Movie_Info> selectPageList(PageMaker pageMaker) {
        return sqlSessionTemplate.selectList("movies.selectPageMovies",pageMaker);
    }

    public int countList(int opencheck) {
        return sqlSessionTemplate.selectOne("movies.countMovies", opencheck);
    }

    public Movie_Info selectOneList(int movie_no) {
        return sqlSessionTemplate.selectOne("movies.selectOneMovies", movie_no);
    }

    public int insertMovie(Movie_Info movie_info) {
        return sqlSessionTemplate.insert("movies.insertMovies", movie_info);
    }

    public int modifyMovie(Movie_Info movie_info) {
        return sqlSessionTemplate.update("movies.updateMovies", movie_info);
    }

    public int deleteMovie(int movie_no) {
        return sqlSessionTemplate.delete("movies.deleteMovies", movie_no);
    }
}
