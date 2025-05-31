package main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.SingletonAppService;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		SingletonAppService commentService1=context.getBean(CommentService.class);
		SingletonAppService commentService2=context.getBean(CommentService.class);
		
		String serviceIDOne=commentService1.getServiceID();
		String serviceIDTwo=commentService2.getServiceID();
		
		System.out.println("Service Id for comment service 1 is "+serviceIDOne);
		System.out.println("Service Id for comment service 2 is "+serviceIDTwo);
		
		Boolean equals=serviceIDOne.equals(serviceIDTwo);
		
		System.out.println("Are the service objects the same "+equals.toString());
		

	}

}
