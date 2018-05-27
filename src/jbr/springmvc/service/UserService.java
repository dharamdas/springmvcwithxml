package jbr.springmvc.service;

import java.util.List;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserService {
	public void register(User user);
	public User validateUser(Login login);
	public List<User> getUserList();

}
