package jbr.springmvc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import jbr.springmvc.dao.UserDao;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	public void register(User user){
		dao.register(user);
	}
	public User validateUser(Login login){
		return dao.validateUser(login);
	}
	
	public List<User> getUserList(){
		return dao.getUserList();
	}
}
