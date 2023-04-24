package com.ness.Emp_map;

import com.ness.dto.EmployeeDTO;
import com.ness.controller.EmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.ness")
public class EmpMapApplication implements CommandLineRunner {
	@Autowired
	EmployeeController empController;

	public static void main(String[] args) {
		SpringApplication.run(EmpMapApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		EmployeeDTO empDto = new EmployeeDTO();
		//Setting employee details to add into database
		empDto.setId(1);
		empDto.setName("Faisal");
		//Adding employee into database
		empController.add_emp(empDto);
		//Printing employee details from database
		System.out.println("Employee Details");
		empController.get_data();
	}
}