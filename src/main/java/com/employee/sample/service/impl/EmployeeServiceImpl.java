package com.employee.sample.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.employee.sample.model.Employee;
import com.employee.sample.service.EmployeeService;

/**
 * The Class EmployeeServiceImpl.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private List<Employee> employeeDatabase = new ArrayList<>();
	
	public EmployeeServiceImpl() {
		
		employeeDatabase.add(new Employee(1, "george", "bluth", "george.bluth@reqres.in"));
		employeeDatabase.add(new Employee(3, "emma", "wong", "emma.wong@reqres.in"));
		employeeDatabase.add(new Employee(10, "byron", "fields", "byron.fields@reqres.in"));
	}

	@Override
	public String getEmailId(int empId) {
		
		Optional<Employee> findFirst = employeeDatabase.stream().filter(empDB -> empDB.getId() == empId).findFirst();
		
		if(findFirst.isEmpty())
			return "UNKNOWN";
		return findFirst.get().getEmail();
	}

}
