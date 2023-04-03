package in.ashokit.service;

import java.util.List;

import in.ashokit.model.User;

public interface UserService {

	public List<User> findAll();

	public User findById(Long id);

	public void save(User user);
}