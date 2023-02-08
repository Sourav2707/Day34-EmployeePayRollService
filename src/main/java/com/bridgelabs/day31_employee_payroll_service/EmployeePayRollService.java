package com.bridgelabs.day31_employee_payroll_service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayRollService {
    List<EmployeePayRoll> employeePayRollList = new ArrayList<>();
    public List<EmployeePayRoll> retrieveData() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Day31EmployeePayRollService";
        String user = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee_payroll");
        while (resultSet.next()) {
            employeePayRollList.add(new EmployeePayRoll(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3), resultSet.getDate(4)));
        }
        connection.close();
        return employeePayRollList;
    }
}
