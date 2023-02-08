LFP batch 235 - day 31 employee payroll service using mysql

UC1

Ability to create a payroll
service database
- Using MSSQL Client use create database
  query to create a payroll_service
  database
- Also you can see the DB created by
  using show database query
- And go to the database created by using
  use payroll_service query

UC 2

Ability to create a employee payroll table
in the payroll service database to
manage employee payrolls
- Use payroll_service database in MSSQL Client
- Use Create Table employee_payroll Query
  to create employee payroll table with columns id,
  name, salary and start date as column. Note Id is set to
  auto increment.
- Understand the SQL data types to be used for the
  table
- Note: SQL Queries as case insensitive

MSSQL Data
Types

UC 3

Ability to create employee
payroll data in the payroll
service database as part of
CRUD Operation - Use payroll_service database in
MSSQL Client
- Use INSERT INTO employee_payroll
  Query to create employees payroll
  data into the employee_payroll table

UC 4

Ability to retrieve all the
employee payroll data that is
added to payroll service
database
- Use payroll_service database in MSSQL
  Client
- Use SELECT * FROM employee_payroll to
  retrieve all the data from the
  employee_payroll table

UC 5

Ability to retrieve salary data for a particular
employee as well as all employees who have
joined in a particular data range from the
payroll service database
- Use SELECT salary FROM employee_payroll
  WHERE name = 'Bill’ Query to View Bill’s salary
- Use Select query with Where condition View employees
  between start dates
- Query: WHERE start BETWEEN CAST('2018-01-01'
  AS DATE) AND DATE(NOW());
- Note: Where Condition Clause is used to retrieve the row needed
  from the table
- Note: Use of Database Functions like CAST() and NOW() in the
  Query

UC 6

Ability to add Gender to Employee
Payroll Table and Update the Rows to
reflect the correct Employee Gender
- Use payroll_service database in MSSQL Client
- Use Alter Table Command to add Field gender after
  the name field
- Use Update Query to set the gender using where
  condition with the employee name
- E.g. UPDATE employee_payroll set gender =
  'M' where name = 'Bill' or name =
  'Charlie';

UC 7

Ability to find sum, average, min, max
and number of male and female
employees
- Use payroll_service database in MSSQL Client
- Use Database Function SUM, AVG, MIN, MAX, COUNT
  to do analysis by Male or Female.
- Note: You will need to use GROUP BY GENDER grouping to
  get the result
- E.g. SELECT SUM(salary) FROM employee_payroll
  WHERE gender = 'F' GROUP BY gender;

MSSQL
Commands

Section 2: ER Diagram

UC 8

Ability to extend
employee_payroll data to
store employee information
like employee phone, address
and department - Ensure employee department is non
nullable fields.
- Add Default Value for address field.

UC 9

Ability to extend
employee_payroll table
to have Basic Pay,
Deductions, Taxable Pay,
Income Tax, Net Pay

UC 10

Ability to make Terissa as part of
Sales and Marketing Department
- Note: The Complete employee payroll
  roll need to be Inserted
- If a Salary is now going to be updated
  multiple rows has to be updated
  creating unnecessary redundancy
- Further There is 2 Employee ID so
  according to Database there is two
  different Terissa

Entity Relationship Diagram – ER Diagram

• An Entity–relationship model (ER model) describes the
structure of a database with the help of a diagram, which is
known as Entity Relationship Diagram (ER Diagram).
• An ER model is more intuitive approach than following
rules in Normalized forms like 1NF, 2NF, etc. and is a design
or blueprint of a database that can later be implemented as
a database. Very similar to Class Diagram.
• The best way to design the DB is to keep the knowledge of
Normalized Forms and use the Intuitive Approach and
Domain Knowledge to arrive at the ER Diagram.
• The main components of E-R Diagram are:
• Entity
• Attribute
• Relationship

Employee Payroll Table

Employee Payroll Table

UC 10

Draw the ER Diagram for
Payroll Service DB
- Identifies the Entities – Entities
  can be Identified using
  Normalization Technique
- Check each attribute and see if

they are Composite or Multi-
Valued

Entity Relationship Diagram – ER Diagram

• Entity – An Entity is similar to a Class or a Table in DB and is identified by its
attributes and relationship with other entities. An Entity can be a Week Entity if it
dependent on other Entity.
• Attribute – An Attribute is the property of an Entity and are following 4 Types:
• Key attribute – Uniquely Identified the Entity e.g. employee id
• Composite attribute – is a combination of other attributes e.g. employee address
• Multivalued attribute – hold multiple values like the phone number
• Derived attribute – value is dynamic and derived from another attribute e.g. net pay
• Relationship –

Company Employee Payroll

Department

1 M One to Many One to One

Many to One

Many to Many

1 1

M

M

UC 11

Implement the ER Diagram
into Payroll Service DB
- Create the corresponding tables as
  identified in the ER Diagram along
  with attributes
- For Many to Many relationship,
  create new Table called Employee
  Department having Employee Id and
  Department ID and redo the UC 7

UC 12

Ensure all retrieve

queries done especially

in UC 4, UC 5 and UC 7

are working with new
table structure

Section 3: ADO.NET

UC 1

Ability to create a payroll service
database and have java program
connect to database
- Use the payroll_service database created in MSSQL
- Download and register the Ado.Net driver to your
  source in Visual Studio
- Alternatively use NuGet to add Ado.Net driver to your
  source
- Check if the Driver Class is available for the C# program
- Check all the drivers registered with the Ado.Net driver
- Check if the database connection to payroll_service
  mssql DB is established

Test Database Connectivity using C# Program

• Test Database connectivity. Please note the
following:
• Set the DB URL to local host database you
have created.
• Check the Username and Password set in
MSSQL
• Check if MSSQL Ado.Net driver class is
loaded
• List the MSSQL Ado.Net Drivers Registered
• Get the SQL Connection from the Ado.Net
Driver passing the DB URL, User name and
Password
• Output of the C# Program is Connection
Established

ADO.NET API Core Concepts

• ADO.NET Statement – The Step 3 is to create ADO.NET Statement
or Prepared Statement using the Connection Object to execute the
CRUD operation
• public static string connectionString = "Data
Source=(localdb)\\MSSQLLocalDB;Initial Catalog=payroll_service;";
• SqlConnection connection = new SqlConnection(connectionString);

• ResultSet – The Step 4 is to process the result of the database
query. For this Ado.Net ResultSet interface is used. The ResultSet
contains set of records and each record contains values
corresponding to the Columns retrieved from the DB

UC 2

Ability for Employee Payroll
Service to retrieve the Employee
Payroll from the Database
- Using ODBC read the employee payroll data from the
  database
- Add Start Data to EmployeePayroll Class and ensure
  backward compatibility
- Populate the EmployeePayroll Object
- Return the list of Employee Payroll Data

UC 3

Ability to update the salary i.e.
the base pay for Employee
Terisa to 3000000.00 and sync it
with Database
- Update the employee payroll in the database
- Update the Employee Payroll Object with the Updated
  Salary
- Compare Employee Payroll Object with DB to pass the
  MSTest Test.

UC 4

Ability to update the salary i.e. the
base pay for Employee Terisa to
3000000.00 and sync it with Database
using JDBC PreparedStatement
- Update the employee payroll in the database
- Update the Employee Payroll Object with the Updated Salary
- Compare Employee Payroll Object with DB to pass the MSTest
  Test.

Refactor UC 4

Refactor Code to do the
following
- Create PreparedStatement to retrieve payroll data by
  name
- Cache the PreparedStatement at the Driver and DB
  Level
- Make Payroll DB Service Object as Singleton so
  PreparedStatement is cached in the Program
- Reuse the ResultSet to populate EmployeePayrollData
  Object

UC 5

Ability to retrieve all
employees who have
joined in a particular
data range from the
payroll service
database

UC 6

Ability to find sum, average, min,
max and number of male and
female employees
- Use Database Function SUM, AVG, MIN, MAX,
  COUNT to do analysis by Male and Female.
- Note: You will need to use GROUP BY GENDER
  grouping to get the result
- E.g. SELECT SUM(salary) FROM
  employee_payroll WHERE gender = 'F'
  GROUP BY gender;

UC 7

Ensure UC 2 – UC 7 works with the new ER
Diagram implemented into Payroll Service
DB
- Ensure the EmployeePayroll Class incorporates all
  the Entities identified in the ER Diagram
- Ensure When Adding new Employee Payroll, many
  tables will be impacted and transaction in the
  table need to be implemented
- For Department, Employee Payroll class can hold
  array of Department Name

UC 8

Implement the complete ER Diagram in
the Database
- Refactor the code to ensure all the queries are working
- Ensure the EmployeePayroll Class incorporates all the
  Entities identified in the ER Diagram
- Ensure When Adding new Employee Payroll, many
  tables will be impacted and transaction in the table
  need to be implemented
- For Department, Employee Payroll class can hold array
  of Department Name

UC 9

Ensure UC 2 – UC 7

works with the new ER

Diagram implemented

into Payroll Service DB