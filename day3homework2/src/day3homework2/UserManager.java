package day3homework2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme eklendi!");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}