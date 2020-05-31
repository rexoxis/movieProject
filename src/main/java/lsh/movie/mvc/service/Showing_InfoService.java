package lsh.movie.mvc.service;

import lsh.movie.mvc.dao.Showing_InfoDAO;
import lsh.movie.mvc.vo.Showing_Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Showing_InfoService {
    @Autowired
    Showing_InfoDAO showing_infoDAO;

    public int insertShowing_Info(Showing_Info showing_info) {
        return showing_infoDAO.insertShowing_Info(showing_info);
    }

    public List<Showing_Info> selectAllList() {
        return showing_infoDAO.selectAllList();
    }

    public int modifyShowing_Info(Showing_Info showing_info) {
        return showing_infoDAO.modifyShowing_Info(showing_info);
    }

    public int deleteShowing_info(int showing_info_no) {
        return showing_infoDAO.deleteShowing_info(showing_info_no);
    }

}
