package com.example.FlightReservationSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FlightReservationSystem.entity.User;
import com.example.FlightReservationSystem.repository.UserRepo;

@Controller
public class UserController {
	@Autowired
	private UserRepo userRepo;
	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "login/login";
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email")String emailId,@RequestParam("password")String password,ModelMap modelMap) {
		User user = userRepo.findByEmail(emailId);
		if(user!=null) {
		if(user.getEmail().equals(emailId)&& user.getPassword().equals(password)) {
			return "findFlight";
		}else {
			modelMap.addAttribute("error", "Invalid Username/password");
			return "login/login";
		}
		}
		else {
			modelMap.addAttribute("error", "Invalid Username/password");
			return "login/login";
	}
		}
@RequestMapping("/showReg")
	public String showReg() {
		return "login/showReg";
	}

@RequestMapping("/saveReg")
public String saveReg(@ModelAttribute("user") User user) {
	 userRepo.save(user);
	
	return "login/login";
}

}