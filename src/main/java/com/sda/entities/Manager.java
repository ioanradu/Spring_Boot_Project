package com.sda.entities;

import javax.persistence.*;

/**
 * Created by Ionel Radu on 10/18/2019
 */


public class Manager{
    @Column(name = "department_managed")
    private String departmentManaged;

    public Manager() {
    }

    public String getDepartmentManaged() {
        return departmentManaged;
    }

    public void setDepartmentManaged(String departmentManaged) {
        this.departmentManaged = departmentManaged;
    }
}
