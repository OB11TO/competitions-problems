CREATE TABLE author
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(128) NOT NULL,
    last_name  VARCHAR(128) NOT NULL

);

DROP TABLE author;
DROP TABLE book;

CREATE TABLE book
(
    id        BIGSERIAL PRIMARY KEY,
    name      VARCHAR(128) NOT NULL,
    date      SMALLINT     NOT NULL,
    pages     SMALLINT     NOT NULL,
    author_id INT REFERENCES author (id) ON DELETE CASCADE
);

INSERT INTO author (first_name, last_name)
VALUES ('Обито', 'Учиха'),
       ('Кей ', 'Хорстманн'),
       ('Наруто', 'Узумаки'),
       ('Кэнтаро', 'Миура'),
       ('Джошуа', 'Блох');

SELECT *
from author;


insert into book (name, date, pages, author_id)
values ('Java. Библиотеку профессионала. Том 1', 2010, 1102, (SELECT id FROM author WHERE last_name = 'Хорстманн')),
       ('Java. Библиотеку профессионала. Том 2', 2012, 954, (SELECT id FROM author WHERE last_name = 'Хорстманн')),
       ('Java SE 8. Вводный курс', 2015, 203, (SELECT id FROM author WHERE last_name = 'Хорстманн')),
       ('7 навыков высокоэффективных людей', 1989, 396, (SELECT id FROM author WHERE last_name = 'Узумаки')),
       ('Разбуди в себе исполина', 1991, 576, (SELECT id FROM author WHERE last_name = 'Учиха')),
       ('Думай и богатей', 1937, 336, (SELECT id FROM author WHERE last_name = 'Миура')),
       ('Богатый папа, бедный папа', 1997, 352, (SELECT id FROM author WHERE last_name = 'Блох')),
       ('Квадрант денежного потока', 1998, 368, (SELECT id FROM author WHERE last_name = 'Блох')),
       ('Как перестать беспокоиться и начать жить', 1948, 368, (SELECT id FROM author WHERE last_name = 'Учиха')),
       ('Как завоевывать друзей и оказывать влияние на людей', 1936, 352,
        (SELECT id FROM author WHERE last_name = 'Миура'));

select *
from book;


----------------------------------

select name,
    date,
    (select first_name from author where id = book.author_id)
from book
order by date DESC;


select b.name,
       b.date,
       (select a.first_name from author a where a.id = b.author_id)
from book b
order by b.date;


-------------------------------------------------

select count(*)
from book
where author_id = (select id from author where last_name = 'Миура');

---------------------------------------------------

select pages
from book
where pages > (
    select avg(pages)
    from book);


select avg(pages)
from book;

-----------------------------------------------------

select *
from book
order by date
    limit 5;

select sum(pag.pages)
from (select *
      from book
      order by date
          limit 5) pag;

-----------------------------------------------------------
update book
set pages = pages + 5
where id = 2
    RETURNING name, date,pages;


-------------------------------------------------------------------
-- для этого при создании таблицы нужно было указать ON DELETE CASCADE
DELETE
FROM author
WHERE id = (select author_id
            from book
            where pages = (select max(pages)
                           from book));



select (select first_name from author where id = book.author_id)
from book
where pages = (select max(pages)
               from book);

select author_id
from book
where pages = (select max(pages)
               from book);





