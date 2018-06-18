package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import entity.Dish;
import mapper.DishMapper;

public class DishDaoImpl implements DishDao{

	public final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public DishDaoImpl (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Dish> getAll() {
		String sql = "SELECT * FROM dishes"; 
		return jdbcTemplate.query(sql, new DishMapper());
	}

	@Override
	public void save(Dish dish) {
		String sql = "INSERT INTO dishes (id, dishgroup, dishname, calories, price) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, dish.getId(),dish.getDishgroup(), dish.getDishname(), dish.getCalories(), dish.getPrice());
		
	}

	@Override
	public Dish getById(int id) {
		String sql = "SELECT * FROM dishes WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new DishMapper(), id);
	}

	@Override
	public void update(Dish dish) {
		String sql = "UPDATE dishes SET dishgroup =?, dishname = ?, calories = ?, price = ? WHERE id = ?";
		jdbcTemplate.update(sql, dish.getDishgroup(), dish.getDishname(), dish.getCalories(), dish.getPrice(), dish.getId());
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM dishes WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

}
