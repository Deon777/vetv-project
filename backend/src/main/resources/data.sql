INSERT INTO tb_users(age, name, nickname, gender, email, numbers, picURL) VALUES (20, 'Igor Deon', 'Deon', 2, 'igor@gmail.com', '', '');

INSERT INTO tb_pets (age, gender, name, weight) VALUES (13, 1, 'Luma', 25);
INSERT INTO tb_pets (age, gender, name, weight) VALUES (7, 2, 'Dragao', 35);
INSERT INTO tb_pets (age, gender, name, weight) VALUES (8, 2, 'Loop', 8);

INSERT INTO tb_users_pets (users_id, pets_id) VALUES (1 , 1);
INSERT INTO tb_users_pets (users_id, pets_id) VALUES (1 , 2);
INSERT INTO tb_users_pets (users_id, pets_id) VALUES (1 , 3);