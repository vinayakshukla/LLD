package service;

import Repository.UserRepo;
import model.User;

public class UserService {
	public boolean addUser(User user) {
		if (user == null) {
			System.out.println("User cannot be null");
			return false;
		}
		UserRepo.addUser(user);
		return true;
	}

	public User getUserById(String userId) {
		return UserRepo.getUserById(userId);

	}
}
