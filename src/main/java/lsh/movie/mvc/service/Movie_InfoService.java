package lsh.movie.mvc.service;

import lsh.movie.mvc.dao.Movie_InfoDAO;
import lsh.movie.mvc.utils.PageMaker;
import lsh.movie.mvc.vo.Movie_Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Movie_InfoService {

    @Autowired
    private Movie_InfoDAO movie_infoDAO;

    public List<Movie_Info> selectAllList() {
        return movie_infoDAO.selectAllList();
    }
    public List<Movie_Info> selectPageList(PageMaker pageMaker) {
        return movie_infoDAO.selectPageList(pageMaker);
    }

    public int countList(int opencheck) {
        return movie_infoDAO.countList(opencheck);
    }

    public Movie_Info selectOneList(int movie_no) {
        return movie_infoDAO.selectOneList(movie_no);
    }

    public int insertMovie(Movie_Info movie_info) {
        return movie_infoDAO.insertMovie(movie_info);
    }

    public int modifyMovie(Movie_Info movie_info) {
        return movie_infoDAO.modifyMovie(movie_info);
    }

    public int deleteMovie(int movie_no) {
        return movie_infoDAO.deleteMovie(movie_no);
    }
}
