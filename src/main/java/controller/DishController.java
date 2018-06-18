package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;

import entity.Dish;
import service.DishService;

@Controller
@RequestMapping("/")
public class DishController {
	
	@Autowired
	public DishService dishService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	/*@GetMapping("/nextPage")
	public String nextPage() {
		return "nextPage";
	}*/
	
	@GetMapping("/dishes")
	//Model need for working between view and controller
	public String getAllDishes(Model model) {
		model.addAttribute("dishes", dishService.getAll());
		return "dishesList";
	}
	
	@GetMapping("/dish/{id}")
	public String getById(@PathVariable("id") int id, Model model) {
		model.addAttribute("dish", dishService.getById(id));
		return "showDish";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		model.addAttribute("dish", dishService.getById(id));
		return "editDish";
	}
	
	@PostMapping("/updateDish")
	public String updateDish(@ModelAttribute("dish") Dish dish) {
		dishService.update(dish);
		return "redirect:/dish/" + dish.getId();
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		dishService.delete(id);
		return "redirect:/dishes";
	}

	@PostMapping("/addDish")
	public String addDish(@Valid Dish dish, BindingResult bindingResult, Model model) {
		if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
            dishService.save(dish);
        }
        return "createDish";
	}
	
	@GetMapping("/addDish")
	public String createDishPage(Model model) {
		model.addAttribute("dish", new Dish());
		return "createDish";
	} 
		
}
