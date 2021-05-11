package com.employee.sample.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.employee.sample.model.Data;
import com.employee.sample.model.User;
import com.employee.sample.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class EmployeeServiceImpl.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final String USER_DATA_URL = "https://reqres.in/api/users/{userId}";
	@Autowired
	private RestTemplate restTemplate;
	
	public EmployeeServiceImpl() {
		
	}

	@Override
	public String getEmailId(int userId) {
		
		try {
			Map<String, Integer> uriVar = new HashMap<>();
			uriVar.put("userId", userId);
			
			ResponseEntity<User> response = restTemplate.getForEntity(USER_DATA_URL, User.class, uriVar);
			
			if(response != null && response.getBody() != null)
				return response.getBody().getData().getEmail();
		} catch (HttpStatusCodeException e) {
			throw new RuntimeException("Excption in communicating with end point: " + e.getStatusCode());
		} catch (Exception ex) {
			throw new RuntimeException("Generic exception in application: " + ex.getMessage());
		}
		
		return null;
	}

}
