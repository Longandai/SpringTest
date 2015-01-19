package org.spring.us.demo.service.imp;

import javax.annotation.Resource;

import org.spring.us.demo.dao.UserDao;
import org.spring.us.demo.model.User;
import org.spring.us.demo.service.UserService;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		
		return userDao.getUser(userId);
	}

}
