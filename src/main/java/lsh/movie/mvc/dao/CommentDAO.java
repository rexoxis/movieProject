package lsh.movie.mvc.dao;

import lsh.movie.mvc.utils.PageMaker;
import lsh.movie.mvc.vo.Comment;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<Comment> selectComment(PageMaker pageMaker) {
        return sqlSessionTemplate.selectList("comment.selectComment", pageMaker);
    }

    public int countComment(int movie_no) {
        return sqlSessionTemplate.selectOne("comment.countComment", movie_no);
    }

    public int insertComment(Comment comment) {
        return sqlSessionTemplate.insert("comment.insertComment",comment);
    }
}
