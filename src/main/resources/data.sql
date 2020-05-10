insert into users (username, password, enabled) values ('40851', '{noop}123', true);
insert into authorities (username, authority) values ('40851', 'ROLE_USER');

insert into users (username, password, enabled) values ('user', '{noop}123', true);
insert into authorities (username, authority) values ('user', 'ROLE_USER');

insert into users (username, password, enabled) values ('saykey', '{noop}123', true);
insert into authorities (username, authority) values ('saykey', 'ROLE_USER');

insert into users (username, password, enabled) values ('sara', '{noop}123', true);
insert into authorities (username, authority) values ('sara', 'ROLE_ADMIN');

insert into users (username, password, enabled) values ('sejki', '{noop}123', true);
insert into authorities (username, authority) values ('sejki', 'ROLE_ADMIN');