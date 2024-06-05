CREATE TABLE `user`(
    `user_id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `username` VARCHAR(255) NULL,
    `userplaylist_id` INT NOT NULL,
    `email` VARCHAR(255) NULL,
    `password` VARCHAR(255) NULL,
    `admin` TINYINT(1) NULL
);
CREATE TABLE `playlist`(
    `userplaylist_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `song_id` INT NULL,
    `artist_id` INT NULL,
    `duration` TIME NOT NULL,
    `genre` VARCHAR(255) NOT NULL,
    `language` VARCHAR(255) NOT NULL
);
CREATE TABLE `artist`(
    `artist_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `artist_name` VARCHAR(255) NULL,
    `genre` VARCHAR(255) NOT NULL
);
CREATE TABLE `songs`(
    `song_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `title` VARCHAR(255) NULL,
    `artist_id` INT NULL,
    `genre` INT NOT NULL,
    `duration` TIME NOT NULL,
    `language` VARCHAR(255) NOT NULL
);
ALTER TABLE
    `songs` ADD CONSTRAINT `songs_artist_id_foreign` FOREIGN KEY(`artist_id`) REFERENCES `artist`(`artist_id`);
ALTER TABLE
    `playlist` ADD CONSTRAINT `playlist_artist_id_foreign` FOREIGN KEY(`artist_id`) REFERENCES `artist`(`artist_id`);
ALTER TABLE
    `playlist` ADD CONSTRAINT `playlist_song_id_foreign` FOREIGN KEY(`song_id`) REFERENCES `songs`(`song_id`);
ALTER TABLE
    `user` ADD CONSTRAINT `user_userplaylist_id_foreign` FOREIGN KEY(`userplaylist_id`) REFERENCES `playlist`(`userplaylist_id`);