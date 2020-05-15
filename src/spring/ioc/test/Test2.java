package spring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ioc.action.UserAction;

/**
 * 测试依赖注入
 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {
		//加载spring配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-ioc.xml");
		//从配置文件中获取bean
		UserAction userAction = ctx.getBean("userAction",UserAction.class);
		//执行方法
		userAction.addUser();
	}

}
