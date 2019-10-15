package com.sda.controller;

import com.sda.dto.EmployeeDTO;
import com.sda.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @RequestMapping("/employees") // face legatura cu front-end
    @ResponseBody // astea 2 annotari ne spune ca primeste reuest-ul si creaza un raspuns
    public ResponseEntity displayEmployees() {
        List<EmployeeDTO> employeeDTOList =  employeeService.displayEmployeeDTO();

        return new ResponseEntity(employeeDTOList, HttpStatus.OK); // trimite status 200
    }

}
