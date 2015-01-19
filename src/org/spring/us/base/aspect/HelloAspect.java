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
		System.out.println("����ɹ�");
	}
	@After ("execution(* org.spring.us.base.service.Hello.sayHello(..))")
	public void cutSayHelloAfter(){
		System.out.println("������");
	}
	@Around("execution(* org.spring.us.base.service.Hello.sayHello(..))")  
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{  
        System.out.println("���뻷��֪ͨ");  
        Object object = pjp.proceed();//ִ�и÷���  
        System.out.println("�˳�����");  
        return object;  
    }  
}
