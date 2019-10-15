package com.sda.service;

import com.sda.dto.DepartmentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DepartmentService {

    public List<DepartmentDTO> displayDepartmentsDTO(){
        List<DepartmentDTO> departmentDTOList = new ArrayList<>();

        DepartmentDTO departmentDTO1 = new DepartmentDTO();
        departmentDTO1.setNameOfDepartment("HR");

        DepartmentDTO departmentDTO2 = new DepartmentDTO();
        departmentDTO2.setNameOfDepartment("Marketing");

        DepartmentDTO departmentDTO3 = new DepartmentDTO();
        departmentDTO3.setNameOfDepartment("Management");

        departmentDTOList.add(departmentDTO1);
        departmentDTOList.add(departmentDTO2);
        departmentDTOList.add(departmentDTO3);

        return departmentDTOList;
    }
}
