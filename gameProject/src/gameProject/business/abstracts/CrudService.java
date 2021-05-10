package gameProject.business.abstracts;

public interface CrudService<T> {
	T getAll();
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	
}
