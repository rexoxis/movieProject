package lsh.movie.mvc.service;

import lsh.movie.mvc.dao.Screening_roomDAO;
import lsh.movie.mvc.vo.Screening_room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Screening_roomService {
    @Autowired
    Screening_roomDAO screening_roomDAO;

    public List<Screening_room> selectRoom(int theater_no) {
        return screening_roomDAO.selectRoom(theater_no);
    }
}
