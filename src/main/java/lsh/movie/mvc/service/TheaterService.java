package lsh.movie.mvc.service;

import lsh.movie.mvc.dao.TheaterDAO;
import lsh.movie.mvc.vo.Theater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterService {
    @Autowired
    TheaterDAO theaterDAO;

    public List<Theater> selectAllList() {
        return theaterDAO.selectAllList();
    }
}


