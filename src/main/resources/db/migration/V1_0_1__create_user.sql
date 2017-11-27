CREATE TABLE `users` (
`id` int(10) unsigned NOT NULL AUTO_INCREMENT,
`phone` varchar(20) NOT NULL COMMENT '手机号',
`username` VARCHAR(30) NOT NULL COMMENT '登录名',
`password` varchar(100) DEFAULT NULL COMMENT '密码',
`create_time` datetime DEFAULT NULL COMMENT '创建时间',
PRIMARY KEY (`id`),
UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;