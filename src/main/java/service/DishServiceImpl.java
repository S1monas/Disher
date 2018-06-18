package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DishDao;
import entity.Dish;

@Service
public class DishServiceImpl implements DishService{
	
	@Autowired
	public DishDao dishDao;

	@Override
	public List<Dish> getAll() {
		return dishDao.getAll();
	}

	@Override
	public void save(Dish dish) {
		dishDao.save(dish);
	}

	@Override
	public Dish getById(int id) {
		return dishDao.getById(id);
	}

	@Override
	public void update(Dish dish) {
		dishDao.update(dish);
	}

	@Override
	public void delete(int id) {
		dishDao.delete(id);
	}
}
