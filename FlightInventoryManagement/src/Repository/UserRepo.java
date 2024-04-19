package Repository;

import java.util.*;
import model.*;

public class UserRepo {
	public static Map<String, User> users = new HashMap<>();

	public static void addUser(User user) {
		users.put(user.getId(), user);

		System.out.println(users);
	}

	public static User getUserById(String userId) {
		if (!users.containsKey(userId)) {
			return null;
		}
		return users.get(userId);
	}
}
