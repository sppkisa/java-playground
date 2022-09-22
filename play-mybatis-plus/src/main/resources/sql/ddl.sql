-- `play-mybatis-plus`.`user` definition

CREATE TABLE `user`
(
    `id`           bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `name`         varchar(30)            DEFAULT NULL COMMENT '姓名',
    `age`          int(11)                DEFAULT NULL COMMENT '年龄',
    `email`        varchar(50)            DEFAULT NULL COMMENT '邮箱',
    `create_time`  datetime   NOT NULL,
    `update_time`  datetime               DEFAULT NULL,
    `user_qr_code` varchar(100)           DEFAULT NULL,
    `gender`       enum ('MALE','FEMALE') DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1572506591652261891
  DEFAULT CHARSET = latin1;


