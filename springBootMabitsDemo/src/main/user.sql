/*
Navicat MySQL Data Transfer

Source Server         : bendi
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-06-21 15:40:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '王哈哈', '12');
INSERT INTO `user` VALUES ('2', '王意义', '22');
INSERT INTO `user` VALUES ('3', '哈哈', '24');
INSERT INTO `user` VALUES ('4', '哈哈', '24');
INSERT INTO `user` VALUES ('5', '哇啊', '25');
INSERT INTO `user` VALUES ('6', '王子', '24');
INSERT INTO `user` VALUES ('7', '王子', '24');
