create table toll
(
    id int auto_increment primary key,
    highway_code    varchar(100),
    vehicle_type    varchar(20),
    name            varchar(300),
    price           decimal
);
