package org.spring.us.base.service.impl;

import org.spring.us.base.service.Hello;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * spring ������
 * @Service ������
 * @author Administrator
 *
 */

@Component("helloImpl")
@Scope("prototype")
public class HelloImpl implements Hello{

	public String sayHello(String str) {
		// TODO Auto-generated method stub
		return "Hello" + str;
	}

}
