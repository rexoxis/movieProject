package lsh.movie.mvc.restController;

import lsh.movie.mvc.service.CommentService;
import lsh.movie.mvc.utils.PageMaker;
import lsh.movie.mvc.vo.Comment;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    // 영화후기 댓글 조회
    @RequestMapping(value = "/comments/{movie_no}/{pageNum}", method = RequestMethod.GET)
    public JSONObject commentList(@PathVariable("movie_no") int movie_no, @PathVariable("pageNum") int currentPage) {
        int totalContents = commentService.countComment(movie_no);

        PageMaker pageMaker = new PageMaker(15, currentPage, totalContents, 0);
        pageMaker.setMovie_no(movie_no);
        List<Comment> commentList = commentService.selectComment(pageMaker);

        HashMap<String, Object> hashMap = new HashMap<>();

        hashMap.put("commentList", commentList);
        hashMap.put("pageMaker", pageMaker);

//        System.out.println(commentList.get(1).getMovie_title());
        return new JSONObject(hashMap);
    }

    // 영화후기 등록
    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public String commentWrite(@RequestBody HashMap<String, Object> commentParam){
        String msg = "fail";

//        System.out.println("score : " + commentParam.get("score"));
//        System.out.println("score type: " + commentParam.get("score").getClass());

        Comment comment =  new Comment();
        comment.setUserid((String)commentParam.get("userid"));
        comment.setContent((String)commentParam.get("content"));
        comment.setScore(Integer.parseInt((String)commentParam.get("score")));
        comment.setMovie_no(Integer.parseInt((String)commentParam.get("movie_no")));

        int check = commentService.insertComment(comment);

        if (check>=1) msg="success";

        return msg;
    }

}
