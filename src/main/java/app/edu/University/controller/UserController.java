package app.edu.University.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.edu.University.entity.User;
import app.edu.University.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("allUsers")
	public List<User> getAllUsers(){
		return userService.getAllUserList();
	}
	
	@PostMapping("addUser")
	public User createUser(@RequestBody User newUser) {
		return userService.createUser(newUser);
	}

}
