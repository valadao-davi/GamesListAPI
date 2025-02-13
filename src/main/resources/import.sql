INSERT INTO tb_game_list (name) VALUES ('Role-playing (RPG), Adventure');
INSERT INTO tb_game_list (name) VALUES ('Platform');
INSERT INTO tb_game_list (name) VALUES ('Role-playing (RPG), Shooter');

INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description) VALUES('Mass Effect Trilogy', 4.8, 2012, 'Role-playing (RPG), Shooter', 'XBox, Playstation, PC', 'https://image.api.playstation.com/vulcan/ap/rnd/202101/2517/xK2b8gY5A5oyYlc1pnUUVEm5.png', 'The epic Mass Effect trilogy.', 'Explore the galaxy while fighting to save humanity and other races from an ancient threat. Make decisions that affect the fate of the galaxy.');
INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description) VALUES('Red Dead Redemption 2', 4.7, 2018, 'Role-playing (RPG), Adventure', 'XBox, Playstation, PC', 'https://image.api.playstation.com/cdn/UP1004/CUSA03041_00/Hpl5MtwQgOVF9vJqlfui6SDB5Jl4oBSq.png', 'A journey in the Old West.', 'Live as an outlaw in an immersive, cinematic open world at the end of the 19th century, with profound moral choices.');
INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description) VALUES('The Witcher 3: Wild Hunt', 4.7, 2014, 'Role-playing (RPG), Adventure', 'XBox, Playstation, PC', 'https://upload.wikimedia.org/wikipedia/pt/0/06/TW3_Wild_Hunt.png', 'A fantastic world full of choices.', 'Play as Geralt of Rivia in a vibrant open world, hunting monsters and making decisions that shape the story.');
INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description) VALUES('Sekiro: Shadows Die Twice', 3.8, 2019, 'Role-playing (RPG), Adventure', 'XBox, Playstation, PC', 'https://image.api.playstation.com/vulcan/img/rnd/202010/2723/knxU5uU5aKvQChKX5OvWtSGC.png', 'A revenge journey in feudal Japan.', 'Take control of a shinobi seeking revenge, facing deadly enemies in challenging and strategic combat.');
INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description) VALUES('Ghost of Tsushima', 4.6, 2012, 'Role-playing (RPG), Adventure', 'XBox, Playstation, PC', 'https://upload.wikimedia.org/wikipedia/pt/d/dc/Ghost_of_Tsushima_capa.png', 'The resistance of a samurai.', 'Defend your land against Mongol invaders, fighting with honor or using stealth tactics in feudal Japan.');
INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description) VALUES('Super Mario World', 4.7, 1990, 'Platform', 'Super Ness, PC', 'https://upload.wikimedia.org/wikipedia/pt/0/06/Super-Mario-World.jpg', 'A classic Mario adventure.', 'Join Mario and Luigi as they explore Dinosaur Land to rescue Princess Peach from Bowser.');
INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description) VALUES('Hollow Knight', 4.6, 2017, 'Platform', 'XBox, Playstation, PC', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/7.png', 'The journey of a knight in a dark world.', 'Explore a mysterious underground kingdom, face challenging creatures, and uncover ancient secrets.');
INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description) VALUES('Ori and the Blind Forest', 4, 2015, 'Platform', 'XBox, Playstation, PC', 'https://upload.wikimedia.org/wikipedia/pt/3/3b/OriandtheBlindForestCapa.jpg', 'An emotional adventure.', 'Join Ori on a journey to save their home forest in a visually stunning game with fluid mechanics.');
INSERT INTO tb_game (title, score, game_year, genre, platforms, img_url, short_description, long_description) VALUES('Cuphead', 4.6, 2017, 'Platform', 'XBox, Playstation, PC', 'https://image.api.playstation.com/vulcan/img/cfn/11307fllh6D-IvbpCa18N0vRggVeRYWA06paTNCj3DENJMScAzW2f3ry4IwFcXBAt9kWXdZGpGoOGjxJ_e9MdordMVAosNhZ.png', 'A challenging game with retro visuals.', 'Follow Cuphead and Mugman as they face unique bosses in intense battles inspired by 1930s cartoons.');

INSERT INTO tb_belonging (list_id, game_id, position) VALUES (1, 2, 0);
INSERT INTO tb_belonging (list_id, game_id, position) VALUES (1, 3, 1);
INSERT INTO tb_belonging (list_id, game_id, position) VALUES (1, 4, 2);
INSERT INTO tb_belonging (list_id, game_id, position) VALUES (1, 5, 3);

INSERT INTO tb_belonging (list_id, game_id, position) VALUES (2, 6, 0);
INSERT INTO tb_belonging (list_id, game_id, position) VALUES (2, 7, 1);
INSERT INTO tb_belonging (list_id, game_id, position) VALUES (2, 8, 2);
INSERT INTO tb_belonging (list_id, game_id, position) VALUES (2, 9, 3);

INSERT INTO tb_belonging (list_id, game_id, position) VALUES (3, 1, 0);