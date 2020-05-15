package spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.aop.IUserService;
/**
 * aop
 * @author Administrator
 *
 */
public class Test8 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		IUserService userService = ctx.getBean("userServiceImpl",IUserService.class);
		userService.addUser();
	}

}
