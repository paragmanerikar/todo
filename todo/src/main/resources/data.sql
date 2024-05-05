-- create a table to store todo items
create table todo (
    id int primary key auto_increment,
    title varchar(255),
    description varchar(255),
    target_date date,
    status varchar(255)
    );

-- insert sample data into the table
insert into todo (id, title, description, target_date, status) values (1, 'Buy Laptop', 'Laptop to web development','2024-05-10', 'TODO');
insert into todo (id, title, description, target_date,  status) values (2, 'Start new workout routine', '1Hr workout','2024-05-10', 'TODO');
insert into todo (id, title, description, target_date,  status) values (3, 'Buy Stationary', 'Books an notebooks','2024-05-10', 'COMPLETED');
insert into todo (id, title, description, target_date,  status) values (4, 'Grocery shopping', 'some gorcery','2024-05-10', 'TODO');
insert into todo (id, title, description, target_date,  status) values (5, 'Finish presentation slides', 'PPT on GenAI','2024-05-10', 'TODO');
insert into todo (id, title, description, target_date,  status) values (6, 'Clean the garage', 'Monthly activity','2024-05-10', 'TODO');
insert into todo (id, title, description, target_date,  status) values (7, 'Pay bills', 'Light Bill','2024-05-10', 'TODO');

