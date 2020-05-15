package spring.aop.dynamicproxy;
/**
 * 被代理类
 * @author Administrator
 *
 */
public class UserServiceImpl implements IUserService{

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("addUser................");
	}

}
