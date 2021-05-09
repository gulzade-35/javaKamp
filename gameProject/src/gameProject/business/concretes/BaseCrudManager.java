package gameProject.business.concretes;

import gameProject.business.abstracts.CrudService;

public class BaseCrudManager<T> implements CrudService<T>  {

	@Override
	public T getAll() {
		System.out.println("T�m oyuncular getirildi");
		return null;
	}

	@Override
	public void add(T entity) {
		System.out.println("Eklendi");
		
	}

	@Override
	public void update(T entity) {
		System.out.println("G�ncellendi");
		
	}

	@Override
	public void delete(T entity) {
		System.out.println("Silindi");
		
	}

}
