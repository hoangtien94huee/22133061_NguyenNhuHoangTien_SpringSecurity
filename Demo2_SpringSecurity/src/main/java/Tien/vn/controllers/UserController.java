package Tien.vn.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import Tien.vn.entity.UserInfo;
import Tien.vn.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	private final UserService userService = null;
	@PostMapping("/new")
	public String addUser(@RequestBody UserInfo useInfo)
	{
		return userService.addUser(useInfo);
	}
}
