package eCommerceProject.business.abstracts;

import eCommerceProject.entities.concretes.User;

public interface LoginService {
	void register(User user);
	void login(String email, String password);
}
