package com.vinu.swaggerwithspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.swaggerwithspringboot.model.User;

@RestController
@RequestMapping("/api")
public class UserController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User addUser(@RequestParam String firstname, @RequestParam String lastname, @RequestParam long mobile, @RequestParam String city) {
		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setMobile(mobile);
		user.setCity(city);
		return user;
	}
}
