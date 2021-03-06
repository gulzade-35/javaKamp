package eCommerceProject.core.concretes;

import eCommerceProject.core.abstracts.EmailService;
import eCommerceProject.entities.concretes.User;

public class EmailManager implements EmailService {

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("Doğrulama gönderildi : " + user.getEmail());
		
	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("E-Posta adresiniz doğrulandı.Buraya tıklayınız : " + user.getFirstName());
		
	}

}
