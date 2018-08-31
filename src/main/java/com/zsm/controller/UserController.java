package com.zsm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.zsm.services.UserService;

@Controller()
public class UserController {
	@Resource
	private UserService userService;
}
