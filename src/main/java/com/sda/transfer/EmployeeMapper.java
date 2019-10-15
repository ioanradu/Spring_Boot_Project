package com.sda.transfer;

import com.sda.dto.EmployeeDTO;
import com.sda.entities.Employee;
import org.springframework.stereotype.Component;

/**
 * Created by Ionel Radu on 10/15/2019
 */
@Component
public class EmployeeMapper {

    public EmployeeDTO convertEmployeeToEmployeeDTO(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setNameOfEmployee(employee.getNameOfEmployee());
        employeeDTO.setPosition(employee.getPosition());
        employeeDTO.setAge(employee.getAge());
        employeeDTO.setDepartment(employee.getDepartment());
        return employeeDTO;
    }
}
