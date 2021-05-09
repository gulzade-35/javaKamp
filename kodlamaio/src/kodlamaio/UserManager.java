package kodlamaio;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserName() + " kullan�c� kay�t edildi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getUserName() + " kullan�c� silindi.");
	}
	
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
}
