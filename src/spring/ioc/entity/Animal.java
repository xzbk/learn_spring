package spring.ioc.entity;
/**
 * 动物类
 * @author Administrator
 *
 */
public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println("animal can eat");
	}
}
