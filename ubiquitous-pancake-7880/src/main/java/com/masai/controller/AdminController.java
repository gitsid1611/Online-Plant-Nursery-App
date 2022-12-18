package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.AdminException;
import com.masai.exception.LoginException;
import com.masai.model.Admin;
import com.masai.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService userService;

	@PostMapping("/admins")
	public ResponseEntity<Admin> addAdminHandler(@Valid @RequestBody Admin user) throws AdminException {

		Admin savedUser = userService.saveUser(user);

		return new ResponseEntity<Admin>(savedUser, HttpStatus.OK);

	}

	@PutMapping("/admins")
	public ResponseEntity<Admin> updateAdminHandler(@Valid @RequestBody Admin user, @RequestParam("key") String key)
			throws AdminException, LoginException {

		Admin updatedUser = userService.updateUser(user, key);

		return new ResponseEntity<Admin>(updatedUser, HttpStatus.OK);

	}

	@DeleteMapping("/admins/{username}")
	public ResponseEntity<Admin> deleteAdminHandler(@PathVariable("username") String username)
			throws AdminException, LoginException {

		Admin updatedUser = userService.deleteUser(username);

		return new ResponseEntity<Admin>(updatedUser, HttpStatus.OK);

	}
	
	@GetMapping("/admins/{username}")
	public ResponseEntity<Admin> getAdminDetailsHandler(@PathVariable("username") String username) throws AdminException {

		Admin existingUser = userService.findByUserName(username);

		return new ResponseEntity<Admin>(existingUser, HttpStatus.OK);

	}

	@GetMapping("/admins")
	public ResponseEntity<List<Admin>> getAllAdminDetailsHandler() throws AdminException {

		List<Admin> userList = userService.findAllUsers();

		return new ResponseEntity<List<Admin>>(userList, HttpStatus.OK);

	}

}
