select * from users

select * from roles

insert into roles(id, name)
values(1, 'CASUAL'),
(2, 'ADMIN'),
(3, 'VIP')

select * from users_roles

insert into users_roles(user_id, roles_id)
values(9, 2),
(10, 3)