package spring.ioc.factory;

import spring.ioc.entity.Animal;
import spring.ioc.entity.Dog;

/**
 * 狗工厂
 * @author Administrator
 *
 */
public class DogFactory extends AbstractAnimalFactory{

	@Override
	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new Dog();
	}

}
