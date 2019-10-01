package service;

import java.util.ArrayList;

import bean.User;

public class LoginService {
	private ArrayList<User> users = new ArrayList<>();
	
	public LoginService() {
		User user1 = new User();
		user1.setId("blue");
		user1.setPassword("123");
		user1.setNickName("바다");
		
		User user2 = new User();
		user2.setId("red");
		user2.setPassword("123");
		user2.setNickName("파이어");
		
		users.add(user1);
		users.add(user2);
	}

	public User getUser(String id, String password) {
		for (User user : users) {
			if (user.getId().equals(id) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

}
