package spring.ioc.factory;

import spring.ioc.entity.Animal;
/**
 * 动态工厂(抽象工厂)
 * @author Administrator
 *
 */
public abstract class AbstractAnimalFactory {
	public abstract Animal createAnimal();
}
