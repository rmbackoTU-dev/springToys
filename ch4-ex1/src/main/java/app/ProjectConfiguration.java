package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import proxies.CommentNotificationProxy;
import proxies.CommentPushNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

@Configuration
public class ProjectConfiguration {
	
	/**
	 * Adds Database storage repository to the Spring context
	 * @return
	 */
	@Bean
	public CommentRepository commentRepository()
	{
		return new DBCommentRepository();
	}
	
	
	/*
	 * Adds email notification proxy to the Spring context
	 */
	@Bean
	public CommentNotificationProxy[] commentNotificationProxys()
	{
		EmailCommentNotificationProxy email=new EmailCommentNotificationProxy();
		CommentPushNotificationProxy push=new CommentPushNotificationProxy();
		CommentNotificationProxy[] proxies= {email, push};
		return proxies;
	}
	
	/**
	 * Adds Comment service into context and wires its Dependencies via Dependency 
	 * Injection
	 * @param repo
	 * @param proxy
	 * @return
	 */
	@Bean
	public CommentService commentService(CommentRepository repo, CommentNotificationProxy[] proxies)
	{
		return new CommentService(repo, proxies);
	}
	
	

}
