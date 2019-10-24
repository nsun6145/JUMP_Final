/* 
CREATE TABLE `game`(
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`title` varchar (255) NOT NULL,
`category1` varchar(255) NOT NULL,
`category2` varchar(255) DEFAULT NULL,
`description` varchar(1000) DEFAULT NULL,
`image` varchar(255) DEFAULT NULL,
`developer_id` bigint(20) NOT NULL,
`price` double NOT NULL,
PRIMARY KEY (`id`),
KEY `fk_game_developer` (`developer_id`),
CONSTRAINT `fk_game_developer` FOREIGN KEY (`developer_id`) REFERENCES `developer` (`id`)
)
*/
/*
use testdb2;
use games_db;
select * from developer;
select * from game;
describe orderline;
update developer set name = "Capcom" where id = 1;
commit; 
*/



insert into developer (developerID, developer_name) values
(1, "Capcom"),
(2, "Nintendo"),
(3, "Level-5"),
(4, "Telltale Games"),
(5, "French Bread"),
(6, "HB Studios"),
(7, "Midway Studios");

insert into game (gameID, title, category1, category2, description, image, developed, price) values 
(1, 'Backyard Wrestling', 'Fighting', NULL, 'Intense 1v1 wrestling action, all from the comfort of your own lawn.', 'images/placeholder.png', 7, 5.99),
(2, 'Big Beach Sports', 'Party', NULL, 'Hit the beach with your friends and have a blast with six riveting games!', 'images/placeholder.png', 6, 5.99),
(3, 'Super Smash Bros Ultimate', 'Fighting', 'Party', 'Everyone is Here! Fight as your favorite video game characters, either as returning veterans from the past, or the esteemed newcomers! Fight 1v1 or engage in an 8-player frenzy! ', 'images/placeholder.png', 2, 59.99),
(4, 'Legend of Zelda: Breath of the Wild', 'Adventure', 'Action', 'Hyrule has fallen. You have awoken from a 100-year slumber in order to prevent the annihilation of the world. Explore a vast world with new discoveries around the corner and fight back to set things right.', 'images/placeholder.png', 2, 59.99
),
(5, 'Professor Layton and the Curious Village', 'Puzzle', NULL, 'Solve various brainteasers and puzzles as you work to uncover the mystery of the curious village!', 'images/placeholder.png', 3, 29.99
),
(6, 'Sam & Max Season 1 & 2', 'Adventure', NULL, 'Sam & Max: Freelance Police are on the case! Join them on their zany adventures to save the world from many wacky adversaries!', 'images/placeholder.png', 4, 19.99
),
(7, 'Mario Party 4', 'Party', NULL, '(I don\'t actually have a good description of this game. It\'s just a party game with a lot of minigames in one giant board game. Don\'t kill each other, please.', 'images/placeholder.png', 2, 9.99
),
(8, 'Street Fighter V', 'Fighting', NULL, 'The World Warriors come to blows once again! Engage in intense 1v1 battles with new mechanics to spice up the action!', 'images/placeholder.png', 1, 59.99
),
(9, 'Under Night In-Birth', 'Fighting', NULL, 'Fast 2D fighting and devastating combo action! Pick one of 20 unique characters and fight your way through the dangers of the “Hollow Night”, and claim your victory over those who would get in your way.', 'images/placeholder.png', 5, 39.99
),
(10, 'Devil May Cry 5', 'Action', NULL, 'Save the world from the Qliphoth Tree in this Stylish action game. Fight with three heroes in their jorney to save the world!', 'images/placeholder.png', 1, 9.99
),
(11, 'Monster Hunter World', 'Action', NULL, 'Hunt many ferocious monsters in the New World! Old and new monsters alike with be your game, as you fight with 16 weapon types with endless customization!', 'images/placeholder.png', 1, 59.99
);

INSERT INTO rating(ratingID, stars, gameid) VALUES
(1, 5, 1),
(2, 5, 2),
(3, 5, 3),
(4, 4, 4),
(5, 4, 5),
(6, 4, 6),
(7, 3, 7),
(8, 3, 8),
(9, 4, 9),
(10,5,10),
(11, 5, 11);



select * from `game`;
#select * from developer;
#select * from rating;