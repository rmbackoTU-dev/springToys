package proxies;


import dao.Comment;


public class EmailCommentNotificationProxy implements CommentNotificationProxy {
	
	/**
	 * Sends a comment via email in mock example only prints
	 */
	@Override
	public void sendComment(Comment comment)
	{
		System.out.println("Sending Comment: "+comment);
	}
}
