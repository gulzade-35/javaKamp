package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.LoginService;
import eCommerceProject.core.abstracts.CheckService;
import eCommerceProject.core.abstracts.EmailService;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class LoginManager implements LoginService {

	
	private EmailService emailService;
	private CheckService checkService;
	private UserDao userDao;
	
	public LoginManager(UserDao userDao, CheckService checkService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
		this.emailService = emailService;
	}
	
	@Override
	public void register(User user) {
		
		if (!userDao.emailExist(user)) {
			System.out.println("Kay�t ba�ar�s�z!\n"+ user.getEmail() + " Bu e-posta adresi daha �nce kullan�lm��. ");	
			return;
		}
		
		if(checkService.checkFirstName(user.getFirstName()))  
		{ 	
			System.out.println("Ad�n�z do�ruland�!");
		}
		else {
			return;
		}
		
		if(checkService.checkLastName(user.getLastName())) {
			System.out.println("Soyad�n�z do�ruland�!");
		}
		else {
			return;
		}
		
		if(checkService.checkEmail(user.getEmail())) {
			System.out.println("E-mail do�ruland�!");	
		}
		else {
			return;
		}
		
		if(checkService.checkPassword(user.getPassword())) {
			System.out.println("Parola do�ruland�!");	
		}
		else {
			return;
		}
		
		emailService.clickToVerify(user);
		emailService.sendVerifyEmail(user);
		
		userDao.add(user);
		System.out.println("Ba�ar�l�:" + user.getFirstName());
	}

	@Override
	public void login(String email, String password) {
		for(User user:userDao.getAll()) {
			if(email== user.getEmail() && password==user.getPassword()) {
				System.out.println("Login successful");
				return;
			}
			System.out.println("Yanl�� giri� yapt�n�z.Tekrar deneyin.");
		}
		
	}

	

}
