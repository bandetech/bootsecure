insert into users (username, password, enabled) values ('usera', '$2a$10$ZOX3v7efmYCdyTTdvqcjze23p4VXAlCudWwCzinLyOI0vzeETnPoW', true);
insert into users (username, password, enabled) values ('userb', '$2a$10$KVhg4//cxNmxabPHTJ9iJO7q2cyBKMHxodTfw1s.yiLoOLqvt3Umu', true);
insert into authorities (username, authority) values ('usera', 'ROLE_USER');
insert into authorities (username, authority) values ('userb', 'ROLE_HOGE');