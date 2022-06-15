DROP TABLE IF EXISTS `math`;

CREATE TABLE `math` (
    `id` BIGINT NOT NULL AUTO_INCREMENT,
    `first_input` BIGINT NOT NULL,
    `second_input` BIGINT NOT NULL,
    `plus` BIGINT NOT NULL,
    PRIMARY KEY(`id`)
);
