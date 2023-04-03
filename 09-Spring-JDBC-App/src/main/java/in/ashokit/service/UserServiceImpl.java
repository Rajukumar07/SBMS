package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.ashokit.model.User;
import in.ashokit.repository.UserDao;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public List<User> findAll() {
		return userDao.findAll();
	}

	public User findById(Long id) {
		return userDao.findById(id);
	}

	public void save(User user) {
		userDao.save(user);
	}

}
