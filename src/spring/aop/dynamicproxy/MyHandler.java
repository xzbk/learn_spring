package spring.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理手柄
 * @author Administrator
 *
 */
public class MyHandler implements InvocationHandler{
	
	private Object target;
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//执行被代理者方法
		Object obj = method.invoke(target, args);
		//代理额外做的事
		System.out.println("after works");
		return obj;
	}

}
