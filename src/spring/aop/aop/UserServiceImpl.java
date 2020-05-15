package spring.aop.aop;

import org.springframework.stereotype.Component;

@Component("userServiceImpl")
public class UserServiceImpl implements IUserService{

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("add user");
	}

}
