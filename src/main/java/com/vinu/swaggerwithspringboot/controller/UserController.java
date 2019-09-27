package com.vinu.swaggerwithspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.swaggerwithspringboot.model.User;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class UserController {

	@GetMapping("/user")
	@ApiOperation(value = "api title",
	notes = "This is a small description of this api",
	response = User.class
	)
	public User addUser(@RequestParam String firstname, @RequestParam String lastname, @RequestParam long mobile, @RequestParam String city) {
		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setMobile(mobile);
		user.setCity(city);
		return user;
	}
}
