package org.zerock.service.ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.ex01.CustomerDto;
import org.zerock.domain.ex01.EmployeeDto;
import org.zerock.mapper.ex02.Ex02Mapper;

@Service
public class Ex04Service {

	@Autowired
	private Ex02Mapper mapper;
	
	public String getNameById(int id) {
		
		
		String name = mapper.selectNameById(id);
		
		return name;
	}

	public String getNameByFirstName(int id) {
		
		return mapper.selectNameByFirstName(id);
		
	}

	public CustomerDto getCustomerInfoById(int id) {
		
		
		return mapper.selectCustomerById(id);
	}

	public EmployeeDto getEmployeeInfoById(int id) {
		return mapper.selectEmployeeById(id);
	}

	public boolean addCustomer(CustomerDto customer) {
		
		int count = mapper.insertCustomer(customer);
		return count == 1;
	}

	public boolean addEmployees(EmployeeDto employee) {
		
		int count = mapper.insertEmployees(employee);
		return count == 1;
	}
	

}