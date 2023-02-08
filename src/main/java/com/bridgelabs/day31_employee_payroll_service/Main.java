package com.bridgelabs.day31_employee_payroll_service;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Welcome to day 31 employee payroll sercvice using JDBC!");
        EmployeePayRollService employeePayRollService = new EmployeePayRollService();
        employeePayRollService.retrieveData().forEach(x -> System.out.println(x));
    }
}