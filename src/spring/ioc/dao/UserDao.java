package spring.ioc.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public void addUser() {
		System.out.println("addUser");
	}
}
