DROP TABLE IF EXISTS account;

CREATE TABLE account (
   id INT AUTO_INCREMENT  PRIMARY KEY,
   amount INT DEFAULT NULL,
   holder VARCHAR(250) NOT NULL
);

INSERT INTO Account(holder, amount)
       VALUES
       ('Иван Иванов',3434),
       ('Петр Петров',15000),
       ('Каренина Анна',14678),
       ('Марина Маринова',1000),
       ('Огурец Помидоркин',1233),
       ('Октавия Августовна',2353),
       ('Павел Павловский',400),
       ('Граф Дракула',30234);