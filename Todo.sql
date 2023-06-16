create database todo;
use todo;
create table list (Task_id int primary key,Task_name varchar(255),description varchar(255), is_completed(255));
insert into list(Task_id,Task_name) values(1,'washing');
insert into list(Task_id,Task_name) values(2,'cleaning');
insert into list(Task_id,Task_name) values(3,'baking');

