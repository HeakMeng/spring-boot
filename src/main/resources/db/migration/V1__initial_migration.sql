create table users
(
    id       serial
        constraint users_pk
            primary key,
    name     varchar(255) not null,
    email    varchar(255) not null,
    password varchar(255) not null
);

alter table users
    owner to postgres;

create table addresses
(
    id      serial
        constraint addresses_pk
            primary key,
    steet   varchar(255) not null,
    city    varchar(255) not null,
    zip     varchar(255) not null,
    user_id integer      not null
        constraint addresses_users_id_fk
            references users
);

alter table addresses
    owner to postgres;

