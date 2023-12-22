package org.dnyanyog.services;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserServices {
	
	public AddUserResponse adduser(@RequestBody AddUserRequest addUserRequest) {
		
		AddUserResponse response = new AddUserResponse();
		
		response.setStatus("success");
		response.setMessage("User successfully added ");
		response.setUserid(addUserRequest.getUserid());
		response.setUsername(addUserRequest.getUsername());
		response.setUseremail(addUserRequest.getUseremail());
		response.setUserage(addUserRequest.getUserage());
		
		return response;
		
	}

}
