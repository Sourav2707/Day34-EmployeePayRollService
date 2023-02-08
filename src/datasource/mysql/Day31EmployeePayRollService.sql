create database Day31EmployeePayRollService;
create table employee_payroll (
id int auto_increment primary key,
name varchar (40) not null,
salary decimal (10) not null,
start_date date not null );
insert into employee_payroll (name, salary, start_date)
values (
'Sourav', 33817.25, '2019-02-07'),
('Prasanna', 25740.34, '2022-07-27'),
('Hari', 17589.90, '2021-03-10'); 