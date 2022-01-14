INSERT INTO tb_user (name, email, password) VALUES ('Ana Brown', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Blue', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');
INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);

INSERT INTO tb_genre (name) VALUES ('Action');
INSERT INTO tb_genre (name) VALUES ('Comedy');
INSERT INTO tb_genre (name) VALUES ('Drama');
INSERT INTO tb_genre (name) VALUES ('Fantasy');

INSERT INTO tb_movie (title, sub_title, img_url, synopsis, year, genre_id) VALUES ('Tropa de Elite', '', 'https://stz1.imgix.net/Web_BR/contentId/51922/type/KEY/dimension/1920x1080/lang/pt-BR?auto=compress,format&w=370&fit=max', 'Rio de Janeiro, 1997. Nascimento (Wagner Moura), capitão da Tropa de Elite do Rio de Janeiro, é designado para chefiar uma das equipes que tem como missão "apaziguar" o Morro do Turano por um motivo que ele considera insensato.', 2007, 1);
INSERT INTO tb_movie (title, sub_title, img_url, synopsis, year, genre_id) VALUES ('Rápida Vingança', '', 'https://stz1.imgix.net/Web_BR/contentId/63738/type/KEY/dimension/1920x1080/lang/pt-BR?auto=compress,format&w=370&fit=max', 'Um ex-presidiário entra em uma série de assassinatos não relacionados. Ele é rastreado por um policial veterano com segredos e um matador egocêntrico.', 2010, 1);

INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Filme muito bom, indico.', 1, 2);
INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Filme muito ruim, não indico.', 2, 2);  