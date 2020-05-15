package spring.aop.test;

import spring.aop.staticproxy.JinLian;
import spring.aop.staticproxy.WangPo;

/**
 * 静态代理
 * @author Administrator
 *
 */
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WangPo wangPo = new WangPo();
		wangPo.setJl(new JinLian());
		wangPo.dating();
	}

}
