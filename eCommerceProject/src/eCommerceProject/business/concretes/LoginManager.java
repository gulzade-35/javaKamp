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
			System.out.println("Kayýt baþarýsýz!\n"+ user.getEmail() + " Bu e-posta adresi daha önce kullanýlmýþ. ");	
			return;
		}
		
		if(checkService.checkFirstName(user.getFirstName()))  
		{ 	
			System.out.println("Adýnýz doðrulandý!");
		}
		else {
			return;
		}
		
		if(checkService.checkLastName(user.getLastName())) {
			System.out.println("Soyadýnýz doðrulandý!");
		}
		else {
			return;
		}
		
		if(checkService.checkEmail(user.getEmail())) {
			System.out.println("E-mail doðrulandý!");	
		}
		else {
			return;
		}
		
		if(checkService.checkPassword(user.getPassword())) {
			System.out.println("Parola doðrulandý!");	
		}
		else {
			return;
		}
		
		emailService.clickToVerify(user);
		emailService.sendVerifyEmail(user);
		
		userDao.add(user);
		System.out.println("Baþarýlý:" + user.getFirstName());
	}

	@Override
	public void login(String email, String password) {
		for(User user:userDao.getAll()) {
			if(email== user.getEmail() && password==user.getPassword()) {
				System.out.println("Login successful");
				return;
			}
			System.out.println("Yanlýþ giriþ yaptýnýz.Tekrar deneyin.");
		}
		
	}

	

}
