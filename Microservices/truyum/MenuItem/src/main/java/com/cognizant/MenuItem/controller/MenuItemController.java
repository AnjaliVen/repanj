package com.cognizant.MenuItem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuItemController {
	
	@GetMapping("/menuitems/")
	public String menuitem()
	{
		return ("23 burger 120.0 Yes 12/12/12 lunch Yes");
	}

}
