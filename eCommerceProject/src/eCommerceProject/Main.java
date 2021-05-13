package eCommerceProject;

import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.business.concretes.LoginManager;
import eCommerceProject.business.concretes.UserManager;
import eCommerceProject.core.GoogleManagerAdapter;
import eCommerceProject.core.concretes.CheckManager;
import eCommerceProject.core.concretes.EmailManager;
import eCommerceProject.dataAccess.concretes.MemoryUserDao;
import eCommerceProject.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new LoginManager(new MemoryUserDao(), new CheckManager(), new EmailManager()), new GoogleManagerAdapter());
		
		User user1 = new User(1,"Gülzade","Odabaþ","gülzade@gmail.com","1234");
		userService.register(user1);
		userService.login("gülzade@gmail.com", "123456");
		
		System.out.println("Google simulation.");
		userService.registerGoogle();
	
		User user2= new User(1,"Gülzade","Odabaþ","gülzade@gmail.com","1234");
		userService.register(user2);
	}

}
