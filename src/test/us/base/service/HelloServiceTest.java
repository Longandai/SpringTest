package test.us.base.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.us.base.service.Hello;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations = "classpath:META-INF/applicationContext.xml")
public class HelloServiceTest {
	@Resource(name="helloImpl")
	Hello hello;
	
	public void setHello(Hello hello) {
		this.hello = hello;
	}

	@Test
	public void testSayHello(){
//		hello.sayHello("world");
		System.out.println(hello.sayHello("world"));
		assertTrue(true);
	}
	
}
