create database employee; -- Create database 
show databases; -- Show all databases 

use employee; -- Select database 

-- Create tables
create table hobby (id int(10) primary key, name varchar(20)); 
create table employee (id int(10) primary key, first_name varchar(35), last_name varchar(35), age tinyint(3), mobile_number bigint(17), address varchar(80));
create table employee_salary (id int(10) primary key, salary decimal(10, 5), date date, fk_employee_id int(10), foreign key(fk_employee_id) references employee(id));
create table employee_hobby (id int(10) primary key, fk_employee_id int(10), fk_hobby_id int(10), foreign key(fk_employee_id) references employee(id), foreign key(fk_hobby_id) references hobby(id));

-- Show tables
show tables;
desc hobby;
desc employee;
desc employee_salary;
desc employee_hobby;

-- Delete table	
drop table hobby;
drop table employee_hobby;
drop table employee_salary;
drop table employee;

-- Insert data in table
insert into hobby value (1, 'Reading'), (2, 'Writing'), (3, 'Travelling'), (4, 'Swimming'), (5, 'Drawing');
insert into employee value 
(101, 'Parth', 'Patel', 20, 9876543210, 'Ahmedabad - 300001'), 
(102, 'Arpit', 'Jain', 27, 9876549510, 'Bhuj - 300009'), 
(103, 'Ashish', 'verma', 25, 9876223210, 'Ahmedabad - 300008'), 
(104, 'Anant', 'Kumar', 21, 9876543000, 'Surat - 300004'),
(105, 'Vipul', 'Shah', 30, 9806543210, 'Anand - 300002'); 
insert into employee_salary value (1, 10000.50, '2021-12-20', 1),
(2, 12000.70, '2021-11-21', 2),
(3, 15000.60, '2021-09-20', 3),
(4, 12000.70, '2021-12-19', 4),
(5, 10000.50, '2021-10-15', 5);
insert into employee_hobby values (501, 1, 1), (502, 2, 2), (503, 3, 3), (504, 4, 4), (505, 5, 5);

-- Delete table data
truncate table hobby;
truncate table employee;
truncate table employee_salary;
truncate table employee_hobby;