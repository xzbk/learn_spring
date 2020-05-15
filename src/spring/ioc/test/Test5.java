package spring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ioc.action.UserAction;
import spring.ioc.entity.Animal;

/**
 * 注解方式ioc
 * @author Administrator
 *
 */
public class Test5 {
	public static void main(String[] args) {
		//加载spring配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-ioc-annotation.xml");
		//从配置文件中获取bean
		UserAction userAction = ctx.getBean("userAction",UserAction.class);
		//执行方法
		userAction.addUser();
	}
}
