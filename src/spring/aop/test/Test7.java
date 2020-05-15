package spring.aop.test;

import java.lang.reflect.Proxy;

import spring.aop.dynamicproxy.IUserService;
import spring.aop.dynamicproxy.MyHandler;
import spring.aop.dynamicproxy.UserServiceImpl;

/**
 * 动态代理
 * @author Administrator
 *
 */
public class Test7 {
	public static void main(String[] args) {
		/**
		 * Java反射机制，使用proxy类的newInstance来生成动态代理类的对象
		 * 1.loader 类加载器
		 * 2.业务类接口数组
		 * 3.InvocationHandler
		 */
		MyHandler h = new MyHandler();
		h.setTarget(new UserServiceImpl());
		IUserService userService = (IUserService) Proxy.newProxyInstance(Test7.class.getClassLoader(), new Class[]{IUserService.class}, h);
		userService.addUser();
	}
}
