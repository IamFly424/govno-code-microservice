DROP TABLE IF EXISTS t_user CASCADE;

create table t_user (
    id SERIAL PRIMARY KEY,
    username varchar(20) not null UNIQUE,
    email varchar(100) not null UNIQUE,
    password varchar(255) not null,
    created_at TIMESTAMP not null,
    posts_id INTEGER[],
    version int
);

CREATE INDEX idx_username ON t_user(username);