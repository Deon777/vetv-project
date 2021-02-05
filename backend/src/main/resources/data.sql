INSERT INTO tb_users(age, name, nickname, gender, email, number, picURL) VALUES (20, 'Igor Deon', 'Deon', 1, 'igor@gmail.com', '54 984190819', 'urlficticia.com');

INSERT INTO tb_pets (age, name, weight, gender) VALUES (13, 'Luma', 25, 0);
INSERT INTO tb_pets (age, name, weight, gender) VALUES (7, 'Dragao', 35, 1);
INSERT INTO tb_pets (age, name, weight, gender) VALUES (8, 'Loop', 8, 1);

INSERT INTO tb_consultation (description, metode, value) VALUES ('Otite', 1, 120.50);
INSERT INTO tb_consultation (description, metode, value) VALUES ('Consulta rotineira', 0, 60.25);
INSERT INTO tb_consultation (description, metode, value) VALUES ('Cirurgia', 2, 550.80);
INSERT INTO tb_consultation (description, metode, value) VALUES ('Infecção alimentar', 3, 120.50);

INSERT INTO tb_users_pets (users_id, pets_id) VALUES (1 , 1);
INSERT INTO tb_users_pets (users_id, pets_id) VALUES (1 , 2);
INSERT INTO tb_users_pets (users_id, pets_id) VALUES (1 , 3);

INSERT INTO tb_pets_consultations (pets_id, consultation_id) VALUES (1 , 1);
INSERT INTO tb_pets_consultations (pets_id, consultation_id) VALUES (1 , 2);
INSERT INTO tb_pets_consultations (pets_id, consultation_id) VALUES (2 , 3);
INSERT INTO tb_pets_consultations (pets_id, consultation_id) VALUES (3 , 4);