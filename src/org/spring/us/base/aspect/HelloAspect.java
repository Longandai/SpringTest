package org.spring.us.base.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class HelloAspect {
	
	@Before ("execution(* org.spring.us.base.service.Hello.sayHello(..))")
	public void cutSayHello(){
		System.out.println("切入成功");
	}
	@After ("execution(* org.spring.us.base.service.Hello.sayHello(..))")
	public void cutSayHelloAfter(){
		System.out.println("阿拉啦");
	}
	@Around("execution(* org.spring.us.base.service.Hello.sayHello(..))")  
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{  
        System.out.println("进入环绕通知");  
        Object object = pjp.proceed();//执行该方法  
        System.out.println("退出方法");  
        return object;  
    }  
}
