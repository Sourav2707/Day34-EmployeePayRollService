package com.bridgelabs.day31_employee_payroll_service;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
        System.out.println("Welcome to day 31 employee payroll sercvice using JDBC!");
        EmployeePayRollService employeePayRollService = new EmployeePayRollService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu 1: Print the data 2. Update salary for Terisa 3. Retrieve data of Sourav 4. Retreive data from date range");
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
            case 4:
                String date1 = "2018-01-01";
                String date2 = "2023-02-08";
                employeePayRollService.retrieveDataFromDateRange(date1, date2).forEach(x -> System.out.println(x));
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}