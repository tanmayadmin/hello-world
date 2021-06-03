package com.emp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpInfoController {
	
	@GetMapping("/api/employees")
	public List<Employee> getEmpDetails(){
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("100","Tanmay"));
		empList.add(new Employee("200","Sujit"));
		return empList;
		
	}

}
