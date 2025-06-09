package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.Comment;
import service.CommentService;


public class Main {

	public static void main(String[] args) {
		
		 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		 
		//Make Comment
		 Comment newComment=new Comment();

		 newComment.setAuthor("Ryan");
		 newComment.setText("Hello World!");
		 //Text to change our comment to
		 String changeText=newComment.getText().substring(0,5);
		 Comment newCommentTwo=new Comment();
		 newCommentTwo.setAuthor("Ryan");
		 newCommentTwo.setText(changeText);
		 
		 //Test Comment Service
		 CommentService commentService=context.getBean(CommentService.class);
		 commentService.publishComment(newComment);
		 commentService.editComment(newComment, changeText);
		 commentService.deleteComment(newCommentTwo);
	}

}
