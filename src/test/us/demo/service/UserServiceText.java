package test.us.demo.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.us.demo.model.User;
import org.spring.us.demo.service.UserService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations = "classpath:META-INF/applicationContext.xml")
public class UserServiceText {
	@Resource
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Test
	  public void testGetUser(){
		User user = userService.getUser("20141203000001");
		System.out.println(user.getUser_acount());
		  assertTrue(true);
	  }
}
