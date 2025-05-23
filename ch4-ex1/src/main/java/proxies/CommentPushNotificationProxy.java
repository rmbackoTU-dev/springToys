package proxies;

import dao.Comment;

public class CommentPushNotificationProxy implements CommentNotificationProxy {

	
	public void sendComment(Comment comment)
	{
		System.out.println("Pushing notification to message queue-- "+comment);
	}
}
