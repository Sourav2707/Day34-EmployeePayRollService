package com.bridgelabs.day31_employee_payroll_service;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Welcome to day 31 employee payroll sercvice using JDBC!");
        String url = "jdbc:mysql://localhost:3306/Day31EmployeePayRollService";
        String user = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("");
    }
}