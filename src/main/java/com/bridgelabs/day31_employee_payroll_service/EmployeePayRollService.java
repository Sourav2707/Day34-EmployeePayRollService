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
            employeePayRollList.add(new EmployeePayRoll(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4), resultSet.getDate(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8)));
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
            result = new EmployeePayRoll(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4), resultSet.getDate(5),resultSet.getString(6), resultSet.getString(7), resultSet.getString(8));
        }
        connection.connectToDatabase().close();
        return result;
    }
    public List<EmployeePayRoll> retrieveDataFromDateRange(String date1, String date2) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = connection.connectToDatabase().prepareStatement("select * from employee_payroll where start_date between cast( ? as date) and cast( ? as date)");
        preparedStatement.setString(1, date1);
        preparedStatement.setString(2, date2);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            employeePayRollList.add(new EmployeePayRoll(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4), resultSet.getDate(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8)));
        }
        connection.connectToDatabase().close();
        return employeePayRollList;
    }
    public void printSumofSalarybyGender() throws SQLException, ClassNotFoundException {
        Statement statement = connection.connectToDatabase().createStatement();
        ResultSet resultSet1 = statement.executeQuery("select sum(salary) from employee_payroll where gender = 'M' group by gender");
        while (resultSet1.next()) {
            System.out.println("Sum of Male salary : "+resultSet1.getDouble(1));
        }
        ResultSet resultSet2 = statement.executeQuery("select avg(salary) from employee_payroll where gender = 'M' group by gender");
        while (resultSet2.next()) {
            System.out.println("Average of Male salary : "+resultSet2.getDouble(1));
        }
        ResultSet resultSet3 = statement.executeQuery("select min(salary) from employee_payroll where gender = 'M' group by gender");
        while (resultSet3.next()) {
            System.out.println("Minimum Male salary : "+resultSet3.getDouble(1));
        }
        ResultSet resultSet4 = statement.executeQuery("select max(salary) from employee_payroll where gender = 'M' group by gender");
        while (resultSet4.next()) {
            System.out.println("Maximum Male salary : "+resultSet4.getDouble(1));
        }
        ResultSet resultSet5 = statement.executeQuery("select count(salary) from employee_payroll where gender = 'M' group by gender");
        while (resultSet5.next()) {
            System.out.println("Count of Male salary : "+resultSet5.getDouble(1));
        }
    }
}
