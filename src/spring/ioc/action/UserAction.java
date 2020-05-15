package spring.ioc.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import spring.ioc.dao.UserDao;
@Controller
public class UserAction {
	@Resource
	private UserDao userDao;

	public UserAction() {
		super();
	}

	public UserAction(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void addUser() {
		userDao.addUser();
	}
}
