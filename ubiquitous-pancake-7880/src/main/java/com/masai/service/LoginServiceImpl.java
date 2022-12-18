package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Dto.AdminDto;
import com.masai.exception.LoginException;
import com.masai.model.Admin;
import com.masai.model.CurrentUserSession;
import com.masai.repository.AdminDao;
import com.masai.repository.CurrentUserSessionDao;

import java.time.LocalDateTime;
import java.util.Optional;


import net.bytebuddy.utility.RandomString;

@Service
public class LoginServiceImpl implements LoginService{


	@Autowired
	private AdminDao admindao;

//	@Autowired
////	private CustomerDao customerRepo;

	@Autowired
	private CurrentUserSessionDao currUserSession;

@Override
public Admin ValidatAdmin(String name, String password) throws LoginException {
	
	Admin val = admindao.validatecustomer(name, password);



	if(val== null) {
		throw new LoginException("Invalid Data");
	}
	else {

		return val;
	}

}

//@Override
//public String loginAdmin(AdminDto dto) throws LoginException {
//	Admin existingUser = admindao.findByAdminUsername(dto.getAdminUsername());
//
//	if (existingUser == null)
//		throw new LoginException("Invalid credentials. Username does not exist " + dto.getAdminUsername());
//
//	Optional<CurrentUserSession> validCustomerSessionOpt = currUserSession.findById(existingUser.getAdminId());
//
//	if (validCustomerSessionOpt.isPresent()) {
//
//		throw new LoginException("User already Logged In with this username");
//
//	}
//
//	if (existingUser.getAdminPassword().equals(dto.getAdminPassword())) {
//
//		String key = RandomString.make(6);
//
//		Boolean isAdmin = true;
//
//		CurrentUserSession cs = new CurrentUserSession();
//		
//		cs.setUserId(existingUser.getAdminId());
//		cs.setLocalDateTime(LocalDateTime.now());
//		cs.setAdmin(isAdmin);
//		cs.setUuid(key);
//		
//		
//		
//
//		currUserSession.save(cs);
//
//		return cs.toString();
//	} else
//		throw new LoginException("Please Enter a valid password");
//}
//
//@Override
//public String logoutAdmin(String key) throws LoginException {
//
//	Optional<CurrentUserSession> validCustomerSession = currUserSession.findByuuid(key);
//	
//	
//	if(validCustomerSession.get() == null) {
//		throw new LoginException("User Not Logged In with this number");
//		
//	}
//	
//	
//	currUserSession.delete(validCustomerSession.get());
//	
//	
//	return "Logged Out !";
//}



@Override
public String loginAdmin(AdminDto admin) throws LoginException {
	
//	System.out.println(admin.getAdminUsername());
//	
//	Admin existingUser = admindao.findByAdminUsername(admin.getAdminUsername());
//
//	if (existingUser != null)
//		throw new LoginException("Invalid credentials. Username does not exist " + admin.getAdminUsername());
//
//	Optional<CurrentUserSession> validCustomerSessionOpt = currUserSession.findById(existingUser.getAdminId());
//
//	if (validCustomerSessionOpt.isPresent()) {
//
//		throw new LoginException("User already Logged In with this username");
//
//	}
//
//	if (existingUser.getAdminPassword().equals(admin.getAdminPassword())) {
//
//		String key = RandomString.make(6);
//
//		Boolean isAdmin = true;
//
//		CurrentUserSession currentUserSession = new CurrentUserSession(existingUser.getAdminId(), key, isAdmin,
//				LocalDateTime.now());
//
//		currUserSession.save(currentUserSession);
//
//		return currentUserSession.toString();
//	} else
//		throw new LoginException("Please Enter a valid password");
	
	
	
	
	
	
	
	Admin adm = admindao.findByAdminUsername(admin.getAdminUsername());
	
	if(adm==null) {
		
		throw new LoginException("Please enter a valid username");
		
	}
	
	Optional<CurrentUserSession> session = currUserSession.findById(adm.getAdminId());
	
	if(session.isPresent()) {
		
		throw new LoginException("User is already exists");
	}
	else
		
		if(adm.getAdminPassword().equals(admin.getAdminPassword())) {
			
			String key = RandomString.make(6);
			
			CurrentUserSession adminSession = new CurrentUserSession(adm.getAdminId(),key,true,LocalDateTime.now());
			
			currUserSession.save(adminSession);
			
			return adminSession.toString();
			
		}else
			
			throw new LoginException("Please enter valid password");

	
	
	
	
	
	
	
	
	
	
	
	
	
}

@Override
public String logoutAdmin(String key) throws LoginException {
	CurrentUserSession validCustomerSession = currUserSession.findByUuid(key);

	if (validCustomerSession == null) {
		throw new LoginException("User Not Logged In with this username");

	}

	currUserSession.delete(validCustomerSession);

	return "Logged Out !";
}


}
	
	
	
	
	
	
