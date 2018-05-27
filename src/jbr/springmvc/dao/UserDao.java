package jbr.springmvc.dao;

import java.util.List;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserDao {
	
	public void register(User user);
	 public  User validateUser(Login login);
	 public List<User> getUserList();

}
