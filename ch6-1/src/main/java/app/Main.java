package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.Comment;
import services.CommentService;


public class Main {

	public static void main(String[] args) {
		
		 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		 
		//Make Comment
		 Comment newComment=new Comment();
		 newComment.setAuthor("Ryan");
		 newComment.setText("Hello World!");
		 
		 
		 //Test Comment Service
		 CommentService commentService=context.getBean(CommentService.class);
		 commentService.publishComment(newComment);

	}

}
