package com.masai.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Dto.AdminDto;
import com.masai.Dto.CustomerDto;
import com.masai.exception.LoginException;
import com.masai.model.Admin;
import com.masai.service.LoginService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class LoginController {

	
	@Autowired
	private LoginService loginService;
	
	

	 @GetMapping("/admin/login")
	public ResponseEntity<Admin> validateAdmin(@RequestParam String name,@RequestParam String password)throws LoginException{

		 Admin val = loginService.ValidatAdmin(name, password);

		return new ResponseEntity<Admin>(val,HttpStatus.ACCEPTED);


	}
	 
//	 
//	 @PostMapping("/adminLogin")
//		public ResponseEntity<String> loginAdminHandler(@Valid @RequestBody AdminDto admin) throws LoginException {
//
//			String res = loginService.loginAdmin(admin);
//
//			return new ResponseEntity<String>(res, HttpStatus.OK);
//
//		}
//		
//		@PostMapping("/adminLogout")
//		public ResponseEntity<String> logoutAdminHandler(@RequestParam("key") String key) throws LoginException {
//
//			String res = loginService.logoutAdmin(key);
//
//			return new ResponseEntity<String>(res, HttpStatus.OK);
//
//		}
		
//		@PostMapping("/customerLogin")
//		public ResponseEntity<String> loginUserHandler(@Valid @RequestBody CustomerDto customer) throws LoginException {
//
//			String res = loginService.loginCustomer(customer);
//
//			return new ResponseEntity<String>(res, HttpStatus.OK);
//
//		}
//		
//		@PostMapping("/customerLogout")
//		public ResponseEntity<String> logoutUserHandler(@RequestParam("key") String key) throws LoginException {
//
//			String res = loginService.logoutCustomer(key);
//
//			return new ResponseEntity<String>(res, HttpStatus.OK);
//
//		}
	 
	 
	 
	 @PostMapping("/adminLogin")
		public ResponseEntity<String> loginAdminHandler(@Valid @RequestBody AdminDto admin) throws LoginException {

//		 System.out.println(admin.getAdminUsername());
			String res = loginService.loginAdmin(admin);

			return new ResponseEntity<String>(res, HttpStatus.ACCEPTED);

		}
		
		@PostMapping("/adminLogout")
		public ResponseEntity<String> logoutAdminHandler(@RequestParam("key") String key) throws LoginException {

			String res = loginService.logoutAdmin(key);

			return new ResponseEntity<String>(res, HttpStatus.OK);

		}
		
		
	 
	
}
