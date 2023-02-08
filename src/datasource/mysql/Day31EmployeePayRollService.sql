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
('Terisa', '30000.00', '2015-04-23');
select * from employee_payroll;
select salary from employee_payroll where name = 'Sourav';
select * from employee_payroll where start_date between cast('2018-01-01' as date) and date(now());
alter table employee_payroll add column gender char(1) not null after name;
update employee_payroll set gender = 'M' where name = 'Sourav' or name = 'Prasanna' or name = 'Hari';
update employee_payroll set gender = 'F' where name = 'Terisa';
