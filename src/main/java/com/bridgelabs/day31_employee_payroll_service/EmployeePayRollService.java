package com.bridgelabs.day31_employee_payroll_service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayRollService {

    List<EmployeePayRoll> employeePayRollList = new ArrayList<>();
    EmployeePayRollConnection connection = new EmployeePayRollConnection();
    public List<EmployeePayRoll> retrieveData() throws ClassNotFoundException, SQLException {
        Statement statement = connection.connectToDatabase().createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee_payroll");
        while (resultSet.next()) {
            employeePayRollList.add(new EmployeePayRoll(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3), resultSet.getDate(4)));
        }
        connection.connectToDatabase().close();
        return employeePayRollList;
    }
    public  int updateSalary(String name, double salary) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = connection.connectToDatabase().prepareStatement("update employee_payroll set salary = ? where name = ?");
        preparedStatement.setDouble(1, salary);
        preparedStatement.setString(2,name);
        int rowAffected = preparedStatement.executeUpdate();
        if(rowAffected > 0) {
            System.out.println("Salary updated successfully");
        }
        return rowAffected;
    }
    public EmployeePayRoll refactorUC4(String name) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = connection.connectToDatabase().prepareStatement("select * from employee_payroll where name = ?");
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        EmployeePayRoll result = null;
        while(resultSet.next()) {
            result = new EmployeePayRoll(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3), resultSet.getDate(4));
        }
        connection.connectToDatabase().close();
        return result;
    }
}
