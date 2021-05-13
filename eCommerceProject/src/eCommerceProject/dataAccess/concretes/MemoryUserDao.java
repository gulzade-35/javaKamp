package eCommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class MemoryUserDao implements UserDao {

	public List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Kullanýcý database'e eklendi. Kullanýcý adý ve soyadý : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		System.out.println("Kullanýcý database'den silindi. Silinen kullanýcý:  " + user.getFirstName());
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public boolean emailExist(User user) {
		for (User person : users) 
			if (person.getEmail() == user.getEmail()) {
				return false;
			}				
		return true;
		
	}
	
}


