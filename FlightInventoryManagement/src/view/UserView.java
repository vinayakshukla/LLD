package view;

import model.User;
import service.UserService;

public class UserView {
      UserService userService= new UserService();
	public void addUser(String userId, String userName, double funds) {
		if(userService.addUser(new User(userId, userName,funds))) {
		System.out.println("User added:"+userName);
		}
		else {
			System.out.println("Some error occured while adding user:"+userName);	
		}
		
	}
}
