package com.food.foodSpringApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.foodSpringApp.dao.FoodOrderDao;
import com.food.foodSpringApp.dto.FoodOrder;

@RestController
@RequestMapping("/foodorders")
public class FoodOrderController {

	@Autowired
	FoodOrderDao foodorderDao;
	
	@PostMapping
	public FoodOrder saveData(@RequestBody FoodOrder foodorder)
	{
		 return foodorderDao.saveFoodOrder(foodorder);
	}
	
}
