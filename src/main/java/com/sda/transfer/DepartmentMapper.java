package com.sda.transfer;

import com.sda.dto.DepartmentDTO;
import com.sda.entities.Department;
import org.springframework.stereotype.Component;

/**
 * Created by Ionel Radu on 10/15/2019
 */

@Component
public class DepartmentMapper {

    public DepartmentDTO convertDepartmentToDepartmentDTO(Department department) {
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setNameOfDepartment(department.getNameOfDepartment());
        //departmentDTO.setEmployee(department.getEmployee());
        return departmentDTO;
    }

    public Department convertDepartmentDTOToDepartment(DepartmentDTO departmentDTO) {
        Department department = new Department();
        department.setNameOfDepartment(departmentDTO.getNameOfDepartment());
        return department;
    }
}
