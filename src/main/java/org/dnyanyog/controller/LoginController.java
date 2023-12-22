package org.dnyanyog.controller;

import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@PostMapping(path = "/api/auth/validate",consumes= {"application/json","application/xml"},produces= {"application/json","application/xml"})
	public LoginResponse validate(@RequestBody  LoginRequest loginRequest) {

		LoginResponse response = new LoginResponse();

		if (loginRequest.getPassword().equals("admin123") && 
				loginRequest.getUsername().equals("admin")) {

			response.setStatus("Success");
			response.setMessage("Login Successful ");
		} else {
			response.setStatus("Fail");
			response.setMessage(" Login Failure ");
		}
		return response;

	}

}
