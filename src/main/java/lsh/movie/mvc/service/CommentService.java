package lsh.movie.mvc.service;

import lsh.movie.mvc.dao.CommentDAO;
import lsh.movie.mvc.utils.PageMaker;
import lsh.movie.mvc.vo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentDAO commentDAO;

    public List<Comment> selectComment(PageMaker pageMaker) {
        return commentDAO.selectComment(pageMaker);
    }

    public int countComment(int movie_no) {
        return commentDAO.countComment(movie_no);
    }

    public int insertComment(Comment comment) {
        return commentDAO.insertComment(comment);
    }
}
