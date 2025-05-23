package proxies;

import dao.Comment;

public interface CommentNotificationProxy {
	
	/**
	 * Implement a function to send a comment to an external application via a message
	 * must take in Comment object
	 */
	public void sendComment(Comment comment);

}
