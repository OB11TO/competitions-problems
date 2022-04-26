CREATE DATABASE company_repository;
CREATE SCHEMA company_storage;

DROP SCHEMA company_storage;



CREATE TABLE company
(
    id   INT PRIMARY KEY,
    name VARCHAR(128) NOT NULL UNIQUE,
    data DATE         NOT NULL CHECK (data > '1995-03-12' AND data < '2012-01-12' )

    -- NOT NULL
    -- UNIQUE
    --CHECK
    --PRIMARY KEY == UNIQUE AND NOT NULL
);

DROP TABLE company;

INSERT INTO company(id, name, data)
VALUES (1, 'Google', '2000-01-01'),
       (2, 'Apple', '2002-10-29'),
       (3, 'Facebook', '1998-03-12');

-- DROP TABLE public.company;


CREATE TABLE employee
(
    id         SERIAL PRIMARY KEY, --SERIAL счетчик
    first_name VARCHAR(128),
    last_name  VARCHAR(128),
    salary     INT,
    company_id INT REFERENCES company (id),
    UNIQUE (first_name, last_name)
);

DROP TABLE employee;

insert into employee (first_name, last_name, salary)
values ('Ivan', 'Ivanov', 1500),
       ('Ivan', 'Sidorov', 2500),
       ('Petr', 'Petrov', 2500),
       ('I', 'Arrow', 3500);

-------------------------------------SELECT 08-----------------------------------------------------------
-- SELECT * FROM employee;

--AS -  в postgres можно отбросить
--DISTINCT - получить уникальные значение, если не было изначально в таблице UNIQUE
--LIMIT - максимально количество записей, которое нужно вывести
--OFFSET - пропустить количество записей (не важен порядок)
--Без сортировки лучше не использовать OFFSET LIMIT
--SELECT не гарантирует порядок без сортировки
--ORDER BY (имя колонки) - сортировка по дефолту по возрастанию (ASC)
--ORDER BY (имя колонки) DESC - сортировка по убыванию

SELECT DISTINCT id,
                first_name AS f_name,
                last_name  AS l_name,
                salary
FROM employee AS empl
ORDER BY first_name, salary DESC
OFFSET 2 LIMIT 2
;



-----------------------------------------WHERE 09-----------------------------------------------------------

--WHERE - фильтрация по сути
-- <> - не равно  (!=)
-- имя столбца LIKE "Pet%" - пример, что нужно искать в данном атрибуте Pet (% - дальше не интересует)
-- знак % можно ставить и  начало, чтобы искать по постфиксу, так и в середине %ав%
-- В POSTGRES есть ILIKE - нам не важен регистр того, что искать
-- BETWEEN - диапазон от чего до чего искать (пример есть) используется,как с числами, так с датами
-- IN(что нужно искать) - поиск конкретного значения (пример есть)


SELECT DISTINCT id,
                first_name AS f_name,
                last_name  AS l_name,
                salary
FROM employee AS empl
-- WHERE first_name ILIKE 'ivan'
-- WHERE salary BETWEEN 1000 AND 2500
-- WHERE  salary IN(100,1000,1500)
WHERE salary IN (1000, 2500)
   OR (first_name ILIKE 'iv%'
    AND first_name ILIKE '%ov')

ORDER BY first_name, salary DESC
;

-------------------------Агрегирующие и встроенные функции 10-----------------------------------------------------------

--Функции их можно посмотреть в pg_catalog
-- max() min() sum() count() - кол строк выборки avg() -среднее
-- count(*) - выведет кол-во строк без null
-- upper() lower() - приводит все строки атрибута в верхний/нижний регистр
-- concat() - объединит атрибуты в одну строку
--now() без параметров - возвращает текущую дату по серверу


SELECT lower(first_name),
       concat(first_name, ' ', last_name) fio, -- название атрибута просто
       now(),
       1 * 2 + 3


FROM employee AS empl
-- WHERE first_name ILIKE 'ivan'

;


----------------------------------------ВНЕШНИЙ КЛЮЧ FOREIGN KEY 11-----------------------------------------------------

--Расширяем таблицы
--КАК СОЗДАВАТЬ ВНЕШНИЙ КЛЮЧ
--Приято писать название таблицы и атрибут для ключа. Пример company_id
--Далее указывается такой же тип данных, как и в той таблице
--Далее указывается из какой таблицы обращаться REFERENCES
--После названия таблицы в скобках пишется названия колонки, если него нет, то указывается на первую

--ИНАЧЕ можно было бы создать FOREIGN KEY (company_id) REFERENCES company (id)

CREATE TABLE company_storage.company
(
    id   INT PRIMARY KEY,
    name VARCHAR(128) NOT NULL UNIQUE,
    data DATE         NOT NULL CHECK (data > '1995-03-12' AND data < '2012-01-12' )

    -- NOT NULL -
    -- UNIQUE  -
    --CHECK -
    --PRIMARY KEY == UNIQUE AND NOT NULL
);

CREATE TABLE employee
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(128),
    last_name  VARCHAR(128),
    salary     INT,
    company_id INT REFERENCES company (id),
    UNIQUE (first_name, last_name)
);

--Просто создаем заново таблицы (добавил новые значения)

DROP TABLE employee;

insert into employee (first_name, last_name, salary, company_id)
values ('Ivan', 'Ivanov', 1500, 1),
       ('Ivan', 'Sidorov', 2500, 2),
       ('Petr', 'Petrov', 2500, 3),
       ('Arni', 'Panoramio', NULL, 2),
       ('I', 'Arrow', 3500, NULL);


----------------------------------------Объединение запросов UNION 12-----------------------------------------------------

--МНОГО ОГРАНИЧЕНИЙ
--1)Колонки должны совпадать по количеству и иметь один и тот же тип

--UNION - обрезает дублирующие значения
--UNION ALL - выводит всё

SELECT first_name
FROM employee
WHERE company_id IS NOT NULL
UNION ALL
SELECT first_name
FROM employee
WHERE salary IS NULL;


--------------------------------------------------ПОДЗАПРОСЫ 13-----------------------------------------------------

SELECT sum(salary)
FROM (SELECT *
      FROM employee
      ORDER BY salary
      LIMIT 2) empl;


SELECT *
FROM employee
ORDER BY salary
LIMIT 2;


SELECT *,
       (select avg(salary) from employee)
FROM employee;

SELECT *,
       (select max(salary) from employee) - salary diff
FROM employee;


----------------------------------------Удаление строк DELETE 14-----------------------------------------------------

--DELETE FROM employee; -- удалит все данные в таблице (НЕбЕЗОПАСНЫЙ ЗАПРОС)

select *
from employee;

DELETE
FROM employee
WHERE salary IS NULL;

DELETE
FROM employee
WHERE salary = (SELECT max(salary)
                FROM employee);


---------------------------------------------------------------------------------------------------------------------------
CREATE DATABASE book_repository;


-------------------------------------------INNER JOIN PR 20------------------------------------------------------------------------------
CREATE TABLE company
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(128) NOT NULL
);
DROP TABLE employee;
DROP TABLE company;
CREATE TABLE employee
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(128),
    last_name  VARCHAR(128),
    company_id INT REFERENCES company (id)
);

CREATE TABLE contact
(
    id     SERIAL PRIMARY KEY,
    number VARCHAR(128) NOT NULL,
    type   VARCHAR(128)
);
DROP TABLE employee_contact;
DROP TABLE contact;

CREATE TABLE employee_contact
(
    employee_id INT REFERENCES employee (id),
    contact_id  INT REFERENCES contact (id),
    PRIMARY KEY (employee_id, contact_id)
);

insert into contact (number, type)
values ('234-56-78', 'домашний'),
       ('987-65-43', 'рабочий'),
       ('565-25-91', 'мобильный'),
       ('332-55-67', NULL),
       ('465-11-22', NULL);

insert into employee (first_name, last_name, company_id)
values ('Ivan', 'Ivanov', 1),
       ('Sveta', 'Svetikova', 2),
       ('Petr', 'Petrov', 3);

insert into employee_contact (employee_id, contact_id)
values (1, 1),
       (1, 2),
       (2, 2),
       (2, 3),
       (3, 4),
       (4, 5);

------------------------------------------ПРОДОЛЖЕНИЕ-------------------------------------------------------------------------------

--INNER JOIN
--CROSS JOIN
--RIGHT JOIN
--FULL JOIN

SELECT company.name,
       employee.first_name || ' ' || employee.last_name fio,
       ec.contact_id,
       c.number || ' ' || c.type
FROM employee
         JOIN company
              ON company.id = employee.company_id
         JOIN employee_contact ec
              ON employee.id = ec.employee_id
         JOIN contact c on c.id = ec.contact_id;

SELECT *
from company
         cross join (select count(*) from employee) t1;


select company.name,
       e.first_name
       -- count(*)
from company
         left join employee e
                   on company.id = e.company_id
where company.name = 'Apple';
-- group by company.name  -- группировка
-- having count(*) <2;   -- фильтрация


--------------------------------------Оконные функции Windows function---------------------------------------------------

select c.name,
--        e.first_name,
       count(*)
from company c
         left join employee e
                   on c.id = e.company_id
group by c.name

order by c.name;



--OVER() и есть оконная функция
--partition by - ранжирование происходит внутри по группам
-- lag(e.salary) over (order by e.salary) простое смещение
select c.name,
       e.first_name,
       e.salary,
       row_number() over (partition by first_name),                           -- одна из оконных функций
       count(e.id) OVER (),
       max(e.salary) OVER (),
--         avg(e.salary) OVER(),
       lag(e.salary) over (order by e.salary),
       rank() OVER (order by e.salary nulls first ),                          -- nulls firs (null поля ставим первыми)
       dense_rank() OVER (partition by c.name order by e.salary nulls first ) -- не пропускает места
from company c
         left join employee e
                   on c.id = e.company_id;

--------------------------------------Представление.View-----------------------------------------------------------------------

--CREATE VIEW employee_view по сути оболочка, когда мы вызываем её вызывается SELECT
--CREATE MATERIALIZED VIEW employee_materialized_view AS - отличие в том, что сохраняет запрос, но изменять данные нельзя
--REFRESH MATERIALIZED VIEW - обновить данные в таблице кэша для MATERIALIZED

CREATE VIEW employee_view AS
select c.name,
       e.first_name,
       e.salary,
       row_number() over (partition by first_name),                           -- одна из оконных функций
       count(e.id) OVER (),
       max(e.salary) OVER (),
--         avg(e.salary) OVER(),
       lag(e.salary) over (order by e.salary),
       rank() OVER (order by e.salary nulls first ),                          -- nulls firs (null поля ставим первыми)
       dense_rank() OVER (partition by c.name order by e.salary nulls first ) -- не пропускает места
from company c
         left join employee e
                   on c.id = e.company_id;



select *
from employee_view
where name = 'Facebook';

CREATE MATERIALIZED VIEW employee_materialized_view AS
select c.name,
       e.first_name,
       e.salary,
       row_number() over (partition by first_name),                           -- одна из оконных функций
       count(e.id) OVER (),
       max(e.salary) OVER (),
--         avg(e.salary) OVER(),
       lag(e.salary) over (order by e.salary),
       rank() OVER (order by e.salary nulls first ),                          -- nulls firs (null поля ставим первыми)
       dense_rank() OVER (partition by c.name order by e.salary nulls first ) -- не пропускает места
from company c
         left join employee e
                   on c.id = e.company_id;

--------------------------------------Изменение таблиц. ALTER----------------------------------------------------------------------

ALTER TABLE IF EXISTS employee
    ADD COLUMN gender INT;

update employee
set gender = 1
where id <= 3;

select employee.gender
from employee;

--Удалить
ALTER TABLE IF EXISTS employee
    DROP COLUMN  gender;