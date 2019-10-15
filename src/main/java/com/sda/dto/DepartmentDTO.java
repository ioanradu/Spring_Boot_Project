package com.sda.dto;

public class DepartmentDTO {
    private String nameOfDepartment;

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    @Override
    public String toString() {
        return " Numele departamentului este " + nameOfDepartment;
    }
}
