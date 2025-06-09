package service;

import annotations.ToLog;
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
	
	@ToLog
	public void deleteComment(Comment comment)
	{
		commentLogger.log(Level.INFO, "Deleting comment from ("+comment.getAuthor()+"): "+
				comment.getText());
	}
	
	public void editComment(Comment comment, String newText)
	{
		String previousText=comment.getText();
		comment.setText(newText);
		deleteComment(comment);
		commentLogger.log(Level.INFO, "Changing comment from ("+comment.getAuthor()+"): "+
				previousText+" to "+comment.getText());
		publishComment(comment);
	}
	
	
}
