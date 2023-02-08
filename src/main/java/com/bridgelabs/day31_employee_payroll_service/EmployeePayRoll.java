package com.bridgelabs.day31_employee_payroll_service;

import java.util.Date;

public class EmployeePayRoll {
    private int id;
    private String name;
    private double salary;
    private Date startDate;
    private String gender;
    private String ph_no;
    private String address;
    private String dept;
    private double bp;
    private double deduction;
    private double tp;
    private double it;
    private double np;
    public EmployeePayRoll(int id, String name, String gender, double salary,
                           Date startDate, String ph_no, String address, String dept
            , double bp, double deduction, double tp, double it, double np) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.startDate = startDate;
        this.ph_no = ph_no;
        this.address = address;
        this.dept = dept;
        this.bp = bp;
        this.deduction = deduction;
        this.tp = tp;
        this.it = it;
        this.np = np;
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
        return "ID = "+id+", Name = "+name+", Gender = "+gender+", Salary = "+salary+", Start Date = "+startDate+", Phone number = "+ph_no+", Address = "+address+", Department = "+dept+
                ",\n Basic pay = "+bp+", Deduction = "+deduction+", Taxable pay = "+tp+", Income Tax = "+it+", Net pay = "+np;
    }
}
