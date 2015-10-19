package com.ssmm.controller;

import com.ssmm.model.User;
import com.ssmm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
//@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	String showUser() {

		return "12";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	User showOneUser(@PathVariable("id") int id) {


		return userService.getUserById(id);
	}

	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public @ResponseBody
	String demo() {
		return new String("123");
	}
	@RequestMapping(value = "/d1", method = RequestMethod.GET)
	public @ResponseBody
	User get() {
		return userService.getUserById(1);
	}
}
