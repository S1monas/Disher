package entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Dish {
	
	private int id;
	
	@NotNull(message="Can't be empty!")
	@Pattern(regexp="^[A-Za-z0-9.-]{1,30}", message="Klaidingas pavadinimas!")
	private String dishgroup;
	
	@NotNull(message="Can't be empty!")
	@Pattern(regexp="^[A-Za-z0-9.-]{1,30}", message="Klaidingai formatas!")
	private String dishname;
	
	@NotNull(message="Can't be empty!")
	//@Pattern(regexp="^[0-9]{1,4}$", message="Only 4 digits allowed")
	private int calories;
	
	@NotNull(message="Can't be empty!")
	private double price;


	public Dish() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDishgroup() {
		return dishgroup;
	}


	public void setDishgroup(String dishgroup) {
		this.dishgroup = dishgroup;
	}


	public String getDishname() {
		return dishname;
	}


	public void setDishname(String dishname) {
		this.dishname = dishname;
	}


	public int getCalories() {
		return calories;
	}


	public void setCalories(int calories) {
		this.calories = calories;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
}
