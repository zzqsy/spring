package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {

    public  Object log(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("strat log:"+joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:" + joinPoint.getSignature().getName());
        return object;
    }
    public Object log2(ProceedingJoinPoint joinPoint) throws  Throwable{
        System.out.println("the AOP of Source is start");
        Object object=joinPoint.proceed();
        System.out.println("the AOP of source is end");
        return object;
    }
}