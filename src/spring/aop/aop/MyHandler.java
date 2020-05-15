package spring.aop.aop;

import org.springframework.stereotype.Component;
/**
 * 切面
 * @author Administrator
 *
 */
@Component("myHandler")
public class MyHandler {
	public void checkSecurity() {
		System.out.println("check security ........");
	}
}
