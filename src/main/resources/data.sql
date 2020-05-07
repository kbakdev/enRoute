insert into users (username, password, enabled) values ('bob', '{noop}123', true);
insert into authorities (username, authority) values ('bob', 'ROLE_USER');

insert into users (username, password, enabled) values ('sara', '{noop}234', true);
insert into authorities (username, authority) values ('sara', 'ROLE_ADMIN');

insert into users (username, password, enabled) values ('sejki', '{noop}123', true);
insert into authorities (username, authority) values ('sejki', 'ROLE_ADMIN');