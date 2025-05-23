package services;

import org.springframework.beans.factory.annotation.Autowired;

import dao.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;


public class CommentService {

	@Autowired
	private CommentRepository repository;
	
	@Autowired
	private CommentNotificationProxy notifications;
	
	public CommentService(CommentRepository repo, CommentNotificationProxy proxy)
	{
		this.repository=repo;
		this.notifications=proxy;
	}
	
	public void publishComment(Comment comment)
	{
		this.repository.storeComment(comment);
		this.notifications.sendComment(comment);
	}
	
	
}
