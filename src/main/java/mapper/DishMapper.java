package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Dish;

public class DishMapper implements RowMapper<Dish> {

	@Override
	public Dish mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dish dish = new Dish();
		dish.setId(rs.getInt("id"));
		dish.setDishgroup(rs.getString("dishgroup"));
		dish.setDishname(rs.getString("dishname"));
		dish.setCalories(rs.getInt("calories"));
		dish.setPrice(rs.getDouble("price"));
		
		return dish;
	}

}
