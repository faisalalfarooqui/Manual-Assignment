package com.ness.controller;

import com.ness.dto.EmployeeDTO;
import com.ness.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService emp;

    public void add_emp(EmployeeDTO employeeDTO) throws Exception
    {
        if(employeeDTO ==null){
            throw new Exception();
        }
        emp.add_data(employeeDTO.getId(), employeeDTO.getName());
    }
    public void get_data()
    {
        emp.get_data();
    }
}