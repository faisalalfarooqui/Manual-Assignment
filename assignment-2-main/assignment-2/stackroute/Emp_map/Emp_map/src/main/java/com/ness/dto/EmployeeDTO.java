package com.ness.dto;
public class EmployeeDTO {
    int id;
    String name;
    public EmployeeDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public EmployeeDTO(){}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}