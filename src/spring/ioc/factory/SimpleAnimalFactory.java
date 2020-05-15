package spring.ioc.factory;

import spring.ioc.entity.Animal;
import spring.ioc.entity.Cat;
import spring.ioc.entity.Dog;
/**
 * 简单工厂
 * 当创建复杂类型对象的时候，可以采用简单工厂模式.
 * 工厂模式的代码集中在一个类里面，未来创建对象的代码修改只需要修改一处即可。
 * @author Administrator
 *
 */
public class SimpleAnimalFactory {
	public static Animal createAnimal(String animalType) {
		if(animalType.equals("Dog")) {
			return new Dog();
		}else {
			return new Cat();
		}
	}
}
