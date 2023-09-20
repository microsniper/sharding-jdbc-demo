CREATE TABLE `user` (
    `id` bigint(64) NOT NULL AUTO_INCREMENT,
    `age` int(5) NOT NULL DEFAULT '0',
    `name` varchar(255) NOT NULL DEFAULT '',
    `address` varchar(255) DEFAULT '',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;