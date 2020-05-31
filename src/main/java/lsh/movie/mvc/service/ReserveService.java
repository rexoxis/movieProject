package lsh.movie.mvc.service;

import lsh.movie.mvc.dao.ReserveDAO;
import lsh.movie.mvc.vo.Showing_Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReserveService {
    @Autowired
    private ReserveDAO reserveDAO;

    public List<Showing_Info> countAllGroupByName() {
        return reserveDAO.countAllGroupByName();
    }

    public List<Showing_Info> countGroupByName(int movie_no) {
        return reserveDAO.countGroupByName(movie_no);
    }

    public List<Showing_Info> selectShowingMovies(Showing_Info showing_info) {
        return reserveDAO.selectShowingMovies(showing_info);
    }
}
