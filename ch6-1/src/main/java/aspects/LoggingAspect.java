package aspects;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;


@Aspect
public class LoggingAspect {

	private Logger aspectLogger;
	
	
	public LoggingAspect()
	{
		aspectLogger=Logger.getLogger("this.getClass().getSimpleName().toUpperCase()");
	}
	
	@Around("execution(* services.*.*(..))")
	public void log(ProceedingJoinPoint joinPoint)
	throws Throwable
	{
		try {
			String methodName=joinPoint.getSignature().getName();
			aspectLogger.log(Level.INFO, "The following method will run: "+methodName);
			joinPoint.proceed();
			aspectLogger.log(Level.INFO, "Successfully executed method "+methodName);
		}
		catch(Throwable t)
		{
			String error=t.getMessage();
			aspectLogger.log(Level.SEVERE, error);
			throw new Throwable(error);
		}
		
	}
}
