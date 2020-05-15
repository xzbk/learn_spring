package spring.aop.staticproxy;
/**
 * 被代理类(潘金莲)
 * @author Administrator
 *
 */
public class JinLian implements Dating{
	@Override
	public void dating() {
		System.out.println("Datint with ximenqing......");
	}
}
