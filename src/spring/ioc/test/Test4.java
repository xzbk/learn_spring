package spring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ioc.entity.Animal;

/**
 * 抽象工厂
 * @author Administrator
 *
 */
public class Test4 {
	public static void main(String[] args) {
		//加载spring配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-ioc.xml");
		//从配置文件中获取bean
		Animal dog = ctx.getBean("abstractAnimalFactory",Animal.class);
		//执行方法
		dog.eat();
	}
}
