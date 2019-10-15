package com.sda.repo;

import com.sda.dao.EmployeeDao;
import com.sda.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ionel Radu on 10/15/2019
 */
@Repository
public class EmployeeRepo {

    @Autowired
    public EmployeeDao employeeDao;

    public List<Employee> displayAllEmployees(){
        List<Employee> employeeList = employeeDao.displayAllEmployees();
        return employeeList;
    }
}
