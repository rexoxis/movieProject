package lsh.movie.mvc.dao;

import lsh.movie.mvc.vo.Showing_Info;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Showing_InfoDAO {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public int insertShowing_Info(Showing_Info showing_info) {
        return sqlSessionTemplate.insert("showing_info.insertShowinginfo",showing_info);
    }

    public List<Showing_Info> selectAllList() {
        return sqlSessionTemplate.selectList("showing_info.selectAllList");
    }

    public int modifyShowing_Info(Showing_Info showing_info) {
        return sqlSessionTemplate.update("showing_info.updateShowingInfo",showing_info);
    }

    public int deleteShowing_info(int showing_info_no) {
        return sqlSessionTemplate.delete("showing_info.deleteShowingInfo",showing_info_no);
    }

}
