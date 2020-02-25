package com.app.admin_1o1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.admin_1o1.model.UserModel;
import com.app.admin_1o1.repo.User;
import com.app.admin_1o1.repo.UserRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/user")
@Api(value = "1o1_admin", description = "CRUD operations on user")
@CrossOrigin("*")
public class RegistrationController {

	private final UserRepository userRepository;
	private final User user;

	public RegistrationController(UserRepository userRepository, User user) {
		this.userRepository = userRepository;
		
		this.user = user;
	}
    // Save user 
	@RequestMapping(value = "", method = RequestMethod.POST)
	public UserModel updateUser(@RequestBody UserModel inputUser) {
		String emailId = inputUser.getEmail();
		UserModel model = null;
		UserModel result = user.checkUser(emailId);
		if(result != null && result.getPassword() == null) {
			model =  user.updateUser(inputUser);
		}
		return model;
	}
	// Save user 
		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public UserModel addUser(@RequestBody UserModel inputUser) {
			return userRepository.save(inputUser);
		}
	 // GEt all  user 
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<UserModel> getAllUsers(){
		return userRepository.findAll();
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public UserModel getUser(@RequestBody UserModel inputUser) {
		return user.getUser(inputUser);
	}
	
	@RequestMapping(value = "/role/{roleId}", method = RequestMethod.GET)
	public List<UserModel> getUsersByRole(@PathVariable String roleId) {
		return user.getUsersByRoleId(roleId);
	}

}
