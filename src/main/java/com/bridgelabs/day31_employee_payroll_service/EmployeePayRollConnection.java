package com.bridgelabs.day31_employee_payroll_service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayRollConnection {
    public Connection connectToDatabase() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Day31EmployeePayRollService";
        String user = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
