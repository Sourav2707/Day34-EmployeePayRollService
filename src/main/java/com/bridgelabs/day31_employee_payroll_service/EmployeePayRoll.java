package com.bridgelabs.day31_employee_payroll_service;

import java.util.Date;

public class EmployeePayRoll {
    private int id;
    private String name;
    private double salary;
    private Date startDate;

    public EmployeePayRoll(int id, String name, double salary, Date startDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.startDate = startDate;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public String toString() {
        return "ID = "+id+", Name = "+name+", Salary = "+salary+", Start Date = "+startDate;
    }
}
