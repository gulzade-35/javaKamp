package eCommerceProject.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceProject.core.abstracts.CheckService;

public class CheckManager implements CheckService {

	public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	
	@Override
	public boolean checkPassword(String password) {
		if(password.length()>6) {
			System.out.println("Girdi�iniz parola en az 6 karakterden olu�mal�d�r");
			return false;
		}
		return true;
		}
		
	

	@Override
	public boolean checkEmail(String email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(!matcher.matches()) {
			System.out.println("E-Posta Regex bi�iminde de�il");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()<2) {
			System.out.println("Ad�n�z en az iki karakter i�ermelidir.");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()<2) {
			System.out.println("Soyad�n�z en az iki karakter i�ermelidir.");
			return false;
		}
		return true;
	}

}
