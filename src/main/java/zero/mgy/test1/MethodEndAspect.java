package zero.mgy.test1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MethodEndAspect {

    @Before("execution(* zero.mgy.test1.UserServiceEnd.printLog())")
    public void setStartTimeInThreadLocal(JoinPoint joinPoint) {
        System.out.println("before ...");
    }

}
