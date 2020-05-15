package spring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ioc.induction.HelloSpring;
/**
 * spring入门案例
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		//加载spring配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-ioc.xml");
		//从配置文件中获取bean
		HelloSpring helloSpring = ctx.getBean("helloSpring",HelloSpring.class);
		//执行方法
		helloSpring.helloSpring();
	}
}
