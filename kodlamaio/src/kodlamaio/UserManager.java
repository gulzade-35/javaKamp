package kodlamaio;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserName() + " kullanýcý kayýt edildi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getUserName() + " kullanýcý silindi.");
	}
	
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
}
