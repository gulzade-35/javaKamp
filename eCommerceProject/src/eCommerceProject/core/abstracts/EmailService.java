package eCommerceProject.core.abstracts;

import eCommerceProject.entities.concretes.User;

public interface EmailService {
	void sendVerifyEmail(User user);
	void clickToVerify(User user);
}
