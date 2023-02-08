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
select sum(salary) from employee_payroll where gender = 'M' group by gender;
select sum(salary) from employee_payroll where gender = 'F' group by gender;
select avg(salary) from employee_payroll where gender = 'M' group by gender;
select avg(salary) from employee_payroll where gender = 'F' group by gender;
select min(salary) from employee_payroll where gender = 'M' group by gender;
select min(salary) from employee_payroll where gender = 'F' group by gender;
select max(salary) from employee_payroll where gender = 'M' group by gender;
select count(salary) from employee_payroll where gender = 'M' group by gender;
alter table employee_payroll add column phone_number varchar(20) not null, add column address varchar(40) not null, add column department varchar(40) not null;
update employee_payroll set phone_number = '23434345345' where name = 'Sourav';
update employee_payroll set phone_number = '23533465767' where name = 'Prasanna';
update employee_payroll set phone_number = '78980980343' where name = 'Hari';
update employee_payroll set phone_number = '98709347543' where name = 'Terisa';
update employee_payroll set address = '147, Malligai Nagar' where name = 'Sourav';
update employee_payroll set address = '148, Malligai Nagar' where name = 'Prasanna';
update employee_payroll set address = '149, Malligai Nagar' where name = 'Hari';
update employee_payroll set address = '150, Malligai Nagar' where name = 'Terisa';
update employee_payroll set department = 'Full Stack Developer' where name = 'Sourav';
update employee_payroll set department = 'Back end Developer' where name = 'Prasanna';
update employee_payroll set department = 'Quality analyst' where name = 'Hari';
update employee_payroll set department = 'Accounts' where name = 'Terisa';
alter table employee_payroll add column basic_pay decimal(10), add column deductions decimal(10), add column taxable_pay decimal(10), add column income_tax decimal(10), add column net_pay decimal(10);
update employee_payroll set basic_pay = '13000' where name = 'Sourav';
update employee_payroll set basic_pay = '14000' where name = 'Prasanna';
update employee_payroll set basic_pay = '15000' where name = 'Hari';
update employee_payroll set basic_pay = '16000' where name = 'Terisa';
update employee_payroll set deduction = '130' where name = 'Sourav';
update employee_payroll set deduction = '140' where name = 'Prasanna';
update employee_payroll set deduction = '150' where name = 'Hari';
update employee_payroll set deduction = '160' where name = 'Terisa';
update employee_payroll set taxable_pay = '13' where name = 'Sourav';
update employee_payroll set taxable_pay = '14' where name = 'Prasanna';
update employee_payroll set taxable_pay = '15' where name = 'Hari';
update employee_payroll set taxable_pay = '16' where name = 'Terisa';
update employee_payroll set income_tax = '356' where name = 'Sourav';
update employee_payroll set income_tax = '653' where name = 'Prasanna';
update employee_payroll set income_tax = '578' where name = 'Hari';
update employee_payroll set income_tax = '245' where name = 'Terisa';
update employee_payroll set net_pay = '13356' where name = 'Sourav';
update employee_payroll set net_pay = '14653' where name = 'Prasanna';
update employee_payroll set net_pay = '15578' where name = 'Hari';
update employee_payroll set net_pay = '16245' where name = 'Terisa';