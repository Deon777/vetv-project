INSERT INTO tb_users(age, name, nickname, gender, email, number, picURL) VALUES (20, 'Igor Deon', 'Deon', 1, 'igor@gmail.com', '54 984190819', 'urlficticia.com');

INSERT INTO tb_pets (age, name, weight, gender) VALUES (13, 'Luma', 25, 0);
INSERT INTO tb_pets (age, name, weight, gender) VALUES (7, 'Dragao', 35, 1);
INSERT INTO tb_pets (age, name, weight, gender) VALUES (8, 'Loop', 8, 1);

INSERT INTO tb_users_pets (users_id, pets_id) VALUES (1 , 1);
INSERT INTO tb_users_pets (users_id, pets_id) VALUES (1 , 2);
INSERT INTO tb_users_pets (users_id, pets_id) VALUES (1 , 3);