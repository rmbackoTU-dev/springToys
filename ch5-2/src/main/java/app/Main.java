package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import services.CommentService;

public class Main {
	
	public static AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext(ProjectConfig.class);
	
	public static void main(String[] args)
	{
		
		
		CommentService commentServiceBeanOne=c.getBean("commentService", CommentService.class);
		
		CommentService commentServiceBeanTwo=c.getBean("commentService", CommentService.class);
		
		
		String serviceOneStr=commentServiceBeanOne.getServiceID();
		String serviceTwoStr=commentServiceBeanTwo.getServiceID();
		
		System.out.println("The value of service one "+ serviceOneStr);
		System.out.println("The value of service two "+ serviceTwoStr);
		
		Boolean b1=serviceOneStr.equals(serviceTwoStr);
		
		System.out.println("Is service one the same service as service two? :"+b1.toString());
		
	}

}
