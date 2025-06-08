package services;

import dao.Comment;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;
import java.util.logging.Level;

@Service
public class CommentService {

	private Logger commentLogger;
	
	public CommentService()
	{
		commentLogger=Logger.getLogger(this.getClass().getSimpleName().toUpperCase());
	}
	
	public void publishComment(Comment comment)
	{
		commentLogger.log(Level.INFO, "Publishing comment from ("+comment.getAuthor()+"): "+
				comment.getText());
	}
	
	
}
