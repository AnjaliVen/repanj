package com.cognizant.Cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Cart.model.MenuItem;


@RestController
public class CartController {
	
	@Autowired
	private List<MenuItem> menuItemList;
	@GetMapping("/carts/")
	public MenuItem CartDetails(@PathVariable int id,@PathVariable MenuItem mi)
	{
		return menuItemList.set(id, mi);
	}
}
