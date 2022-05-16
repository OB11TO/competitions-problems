CREATE DATABASE flight_repository;

-- airport (аэропорт)
--         code (уникальный код аэропорта)
--              country (страна)
--                      city (город)
create table airport
(
    code    CHAR(3) PRIMARY KEY,
    country VARCHAR(256) NOT NULL,
    city    VARCHAR(128) NOT NULL
);
--  aircraft (самолет)
--  id
--    model (модель самолета - unique)
create table aircraft
(
    id    SERIAL PRIMARY KEY,
    model VARCHAR(128) NOT NULL
);

-- seat (место в самолете)
--    aircraft_id (самолет)
--    seat_no (номер места в самолете)
create table seat
(
    aircraft_id INT REFERENCES aircraft (id),
    seat_no     VARCHAR(4) NOT NULL,
    PRIMARY KEY (aircraft_id, seat_no)
);

-- flight (рейс)
--    id (номер рейса не уникальный, поэтому нужен id)
--    flight_no (номер рейса)
--    departure_date (дата вылета)
--    departure_airport_code (аэропорт вылета)
--    arrival_date (дата прибытия)
--    arrival_airport_code (аэропорт прибытия)
--    aircraft_id (самолет)
--    status (статус рейса: cancelled, arrived, departed, scheduled)

create table flight
(
    id                     SERIAL PRIMARY KEY,
    flight_no              VARCHAR(132) NOT NULL,
    departure_date         TIMESTAMP    NOT NULL,
    departure_airport_code CHAR(3)      NOT NULL,
    arrival_date           TIMESTAMP    NOT NULL,
    arrival_airport_code   CHAR(3)      NOT NULL,
    aircraft_id            INT REFERENCES aircraft (id),
    status                 VARCHAR(32)  NOT NULL
);

-- ticket (билет на самолет)
--    id
--    passenger_no (номер паспорта пассажира)
--    passenger_name (имя и фамилия пассажира)
--    flight_id (рейс)
--    seat_no (номер места в самолете – flight_id + seat-no - unique)
--    cost (стоимость)

create table ticket
(
    id             BIGSERIAL PRIMARY KEY,
    passenger_no   VARCHAR(24)   NOT NULL,
    passenger_name VARCHAR(128)  NOT NULL,
    flight_id      INT REFERENCES flight (id),
    seat_no        VARCHAR(4)    NOT NULL,
    cost           NUMERIC(8, 2) NOT NULL
);

insert into airport (code, country, city)
values ('MNK', 'Беларусь', 'Минск'),
       ('LDN', 'Англия', 'Лондон'),
       ('MSK', 'Россия', 'Москва'),
       ('BSL', 'Испания', 'Барселона');

insert into aircraft (model)
values ('Боинг 777-300'),
       ('Боинг 737-300'),
       ('Аэробус A320-200'),
       ('Суперджет-100');

insert into seat (aircraft_id, seat_no)
select id,
       s.column1
from aircraft
         cross join (values ('A1'), ('A2'), ('B1'), ('B2'), ('C1'), ('C2'), ('D1'), ('D2') order by 1) s;

insert into flight (flight_no, departure_date, departure_airport_code, arrival_date, arrival_airport_code, aircraft_id,
                    status)
values ('MN3002', '2020-06-14T14:30', 'MNK', '2020-06-14T18:07', 'LDN', 1, 'ARRIVED'),
       ('MN3002', '2020-06-16T09:15', 'LDN', '2020-06-16T13:00', 'MNK', 1, 'ARRIVED'),
       ('BC2801', '2020-07-28T23:25', 'MNK', '2020-07-29T02:43', 'LDN', 2, 'ARRIVED'),
       ('BC2801', '2020-08-01T11:00', 'LDN', '2020-08-01T14:15', 'MNK', 2, 'DEPARTED'),
       ('TR3103', '2020-05-03T13:10', 'MSK', '2020-05-03T18:38', 'BSL', 3, 'ARRIVED'),
       ('TR3103', '2020-05-10T07:15', 'BSL', '2020-05-10T012:44', 'MSK', 3, 'CANCELLED'),
       ('CV9827', '2020-09-09T18:00', 'MNK', '2020-09-09T19:15', 'MSK', 4, 'SCHEDULED'),
       ('CV9827', '2020-09-19T08:55', 'MSK', '2020-09-19T10:05', 'MNK', 4, 'SCHEDULED'),
       ('QS8712', '2020-12-18T03:35', 'MNK', '2020-12-18T06:46', 'LDN', 2, 'ARRIVED');

insert into ticket (passenger_no, passenger_name, flight_id, seat_no, cost)
values ('112233', 'Иван Иванов', 1, 'A1', 200),
       ('23234A', 'Петр Петров', 1, 'B1', 180),
       ('SS988D', 'Светлана Светикова', 1, 'B2', 175),
       ('QYASDE', 'Андрей Андреев', 1, 'C2', 175),
       ('POQ234', 'Иван Кожемякин', 1, 'D1', 160),
       ('898123', 'Олег Рубцов', 1, 'A2', 198),
       ('555321', 'Екатерина Петренко', 2, 'A1', 250),
       ('QO23OO', 'Иван Розмаринов', 2, 'B2', 225),
       ('9883IO', 'Иван Кожемякин', 2, 'C1', 217),
       ('123UI2', 'Андрей Буйнов', 2, 'C2', 227),
       ('SS988D', 'Светлана Светикова', 2, 'D2', 277),
       ('EE2344', 'Дмитрий Трусцов', 3, 'А1', 300),
       ('AS23PP', 'Максим Комсомольцев', 3, 'А2', 285),
       ('322349', 'Эдуард Щеглов', 3, 'B1', 99),
       ('DL123S', 'Игорь Беркутов', 3, 'B2', 199),
       ('MVM111', 'Алексей Щербин', 3, 'C1', 299),
       ('ZZZ111', 'Денис Колобков', 3, 'C2', 230),
       ('234444', 'Иван Старовойтов', 3, 'D1', 180),
       ('LLLL12', 'Людмила Старовойтова', 3, 'D2', 224),
       ('RT34TR', 'Степан Дор', 4, 'A1', 129),
       ('999666', 'Анастасия Шепелева', 4, 'A2', 152),
       ('234444', 'Иван Старовойтов', 4, 'B1', 140),
       ('LLLL12', 'Людмила Старовойтова', 4, 'B2', 140),
       ('LLLL12', 'Роман Дронов', 4, 'D2', 109),
       ('112233', 'Иван Иванов', 5, 'С2', 170),
       ('NMNBV2', 'Лариса Тельникова', 5, 'С1', 185),
       ('DSA586', 'Лариса Привольная', 5, 'A1', 204),
       ('DSA583', 'Артур Мирный', 5, 'B1', 189),
       ('DSA581', 'Евгений Кудрявцев', 6, 'A1', 204),
       ('EE2344', 'Дмитрий Трусцов', 6, 'A2', 214),
       ('AS23PP', 'Максим Комсомольцев', 6, 'B2', 176),
       ('112233', 'Иван Иванов', 6, 'B1', 135),
       ('309623', 'Татьяна Крот', 6, 'С1', 155),
       ('319623', 'Юрий Дувинков', 6, 'D1', 125),
       ('322349', 'Эдуард Щеглов', 7, 'A1', 69),
       ('DIOPSL', 'Евгений Безфамильная', 7, 'A2', 58),
       ('DIOPS1', 'Константин Швец', 7, 'D1', 65),
       ('DIOPS2', 'Юлия Швец', 7, 'D2', 65),
       ('1IOPS2', 'Ник Говриленко', 7, 'C2', 73),
       ('999666', 'Анастасия Шепелева', 7, 'B1', 66),
       ('23234A', 'Петр Петров', 7, 'C1', 80),
       ('QYASDE', 'Андрей Андреев', 8, 'A1', 100),
       ('1QAZD2', 'Лариса Потемнкина', 8, 'A2', 89),
       ('5QAZD2', 'Карл Хмелев', 8, 'B2', 79),
       ('2QAZD2', 'Жанна Хмелева', 8, 'С2', 77),
       ('BMXND1', 'Светлана Хмурая', 8, 'В2', 94),
       ('BMXND2', 'Кирилл Сарычев', 8, 'D1', 81),
       ('SS988D', 'Светлана Светикова', 9, 'A2', 222),
       ('SS978D', 'Андрей Желудь', 9, 'A1', 198),
       ('SS968D', 'Дмитрий Воснецов', 9, 'B1', 243),
       ('SS958D', 'Максим Гребцов', 9, 'С1', 251),
       ('112233', 'Иван Иванов', 9, 'С2', 135),
       ('NMNBV2', 'Лариса Тельникова', 9, 'B2', 217),
       ('23234A', 'Петр Петров', 9, 'D1', 189),
       ('123951', 'Полина Зверева', 9, 'D2', 234);


-- 3 Кто летел позавчера рейсом Минск (MNK) - Лондон (LDN) на месте B1?

select *
from ticket
         join flight f
              on f.id = ticket.flight_id
                  AND seat_no = 'B1'
                  AND departure_airport_code = 'MNK'
                  AND arrival_airport_code = 'LDN';


-- 4 Сколько мест осталось незанятыми 2020-06-14 на рейсе MN3002?


select t2.count - t1.count freeSead
from (
         select count(seat_no),
                aircraft_id
         from ticket
                  join flight f on f.id = ticket.flight_id
             and flight_no = 'MN3002'
             and departure_date::date = '2020-06-14'
         group by aircraft_id) t1
         join (
    select count(*), aircraft_id
    from seat
    group by aircraft_id) t2
              on t2.aircraft_id = t1.aircraft_id;


-- 5 Какие 2 перелета были самые длительные за все время?

select id,
       departure_date,
       arrival_date,
       arrival_date - flight.departure_date fly
from flight
order by (flight.arrival_date - flight.departure_date) desc
limit 2;



-- 6 Какая максимальная и минимальная продолжительность перелетов
-- между Минском и Лондоном и сколько было всего таких перелетов?

select first_value(f.arrival_date - f.departure_date)
       OVER (order by (f.arrival_date - f.departure_date) desc )                                           max_value,
       first_value(f.arrival_date - f.departure_date) OVER (order by (f.arrival_date - f.departure_date) ) min_value,
       count(*) OVER ()
from flight f
where departure_airport_code = 'MNK'
  AND arrival_airport_code = 'LDN'
limit 1;


-- 7 Какие имена встречаются чаще всего и какую долю от числа всех пассажиров они составляют?

select t.passenger_name,
       count(*),
       round(100.0 * count(*) / (select count(*) from ticket), 2) round
from ticket t
group by t.passenger_name
order by 2 desc;


-- 8 Вывести имена пассажиров, сколько всего каждый с таким именем купил билетов,
-- а также на сколько это количество меньше от того имени пассажира, кто купил билетов больше всего?

select first_value(t.cnt) over () - t.cnt
from (select t.passenger_name,
             t.passenger_no,
             count(*) cnt
      from ticket t
      group by t.passenger_name, t.passenger_no
      order by 3 desc) t;


select t.passenger_name,
       t.passenger_no,
       count(*) cnt
from ticket t
group by t.passenger_name, t.passenger_no
order by 3 desc;


--9  Вывести стоимость всех маршрутов по убыванию.
-- Отобразить разницу в стоимости между текущим и ближайшими в отсортированном списке маршрутами

select t1.*,
       COALESCE(lead(t1.sum_cost) OVER (order by t1.sum_cost), t1.sum_cost) - t1.sum_cost
from (select t.flight_id,
             sum(t.cost) sum_cost

      from ticket t
      group by t.flight_id
      order by 2 desc) t1;


---------------------------TRIGGER-----------------------------


-----before

insert into aircraft (model)
values ('new boeing');

---- after


create table audit
(
    id         INT,
    table_name TEXT,
    date       TIMESTAMP
);

create or replace function audit_function() returns trigger
    language plpgsql
AS
$$
BEGIN
    insert into audit(id, table_name, date)
    values (new.id, tg_table_name, now());
    return null;
END;
$$;

create trigger audit_aircraft_triggers
    AFTER UPDATE OR INSERT OR DELETE
    ON aircraft
    FOR EACH ROW
EXECUTE FUNCTION audit_function();

insert into aircraft(model)
values ('новый боинг');


