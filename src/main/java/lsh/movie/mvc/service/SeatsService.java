package lsh.movie.mvc.service;

import lsh.movie.mvc.dao.SeatsDAO;
import lsh.movie.mvc.vo.Seats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatsService {

    @Autowired
    SeatsDAO seatsDAO;

    public int countSeats(int showing_no) {
        return seatsDAO.countSeats(showing_no);
    }

    public List<Seats> selectSeats(int showing_no) {
        return seatsDAO.selectSeats(showing_no);
    }


}
