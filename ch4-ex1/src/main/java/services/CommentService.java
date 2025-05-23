package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;


public class CommentService {

	private CommentRepository repository;
	

	private CommentNotificationProxy[] notificationProxies;
	
	public CommentService(CommentRepository repo, CommentNotificationProxy[] proxies)
	{
		
		this.repository=repo;
		int numbOfProxies=proxies.length;
		notificationProxies=new CommentNotificationProxy[numbOfProxies];
		for(int i=0; i<numbOfProxies; i++)
		{
			notificationProxies[i]=proxies[i];
		}
	}
	
	public void publishComment(Comment comment)
	{
		this.repository.storeComment(comment);
		sendAllComments(comment);
	}
	
	public void sendAllComments(Comment comment)
	{
		for(int i=0; i< notificationProxies.length; i++)
		{
			notificationProxies[i].sendComment(comment);
		}
	}
	
	
}
