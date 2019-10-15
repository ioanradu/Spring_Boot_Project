package com.sda.service;

import com.sda.dto.EmployeeDTO;
import com.sda.entities.Employee;
import com.sda.repo.EmployeeRepo;
import com.sda.transfer.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<EmployeeDTO> displayEmployeeDTO() {

        List<Employee> employeeList = employeeRepo.displayAllEmployees();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();

        for(Employee employee : employeeList){
            employeeDTOList.add(employeeMapper.convertEmployeeToEmployeeDTO(employee));
            System.out.println(employee);
        }

        return employeeDTOList;
    }
}
