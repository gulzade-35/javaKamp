package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.LoginService;
import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.core.abstracts.GoogleService;
import eCommerceProject.entities.concretes.User;

public class UserManager implements UserService {

	private LoginService loginService;
	private GoogleService googleService;
	
	public UserManager(LoginService loginService, GoogleService googleService) {
		this.googleService = googleService;
		this.loginService = loginService;
	}
	@Override
	public void login(String email, String password) {
		loginService.login(email, password);
		
	}

	@Override
	public void register(User user) {
		loginService.register(user);
		
	}

	@Override
	public void registerGoogle() {
		googleService.registerToSystem();
		
	}

}
