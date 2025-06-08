package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspects.LoggingAspect;
import services.CommentService;

@Configuration
@ComponentScan(basePackages = "services")
@EnableAspectJAutoProxy
public class ProjectConfiguration {
	
	
	
	@Bean
	public LoggingAspect logAspect()
	{
		return new LoggingAspect();
	}
	
	/**
	 * Adds Comment service into context and wires its Dependencies via Dependency 
	 * Injection
	 * @return
	 */
	@Bean
	public CommentService commentService()
	{
		return new CommentService();
	}
	
	

}
