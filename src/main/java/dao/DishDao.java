package dao;

import java.util.List;

import entity.Dish;

public interface DishDao {

	List<Dish> getAll();
	
	void save(Dish dish);
	
	Dish getById(int id);
	
	void update(Dish dish);
	
	void delete (int id);
}
