package com.bridgelabs.day31_employee_payroll_service;

import java.sql.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Welcome to day 31 employee payroll sercvice using JDBC!");
        EmployeePayRollService employeePayRollService = new EmployeePayRollService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu 1: Print the data 2. Update salary for Terisa");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                employeePayRollService.retrieveData().forEach(x -> System.out.println(x));
                break;
            case 2:
                employeePayRollService.updateSalary("Terisa", 3000000.00);
                break;
            case 3:
                System.out.println(employeePayRollService.refactorUC4("Sourav"));
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}