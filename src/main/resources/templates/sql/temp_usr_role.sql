/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50543
Source Host           : 127.0.0.1:3306
Source Database       : permissiondb

Target Server Type    : MYSQL
Target Server Version : 50543
File Encoding         : 65001

Date: 2019-01-16 17:26:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for temp_usr_role
-- ----------------------------
DROP TABLE IF EXISTS `temp_usr_role`;
CREATE TABLE `temp_usr_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dfa` (`user_id`),
  KEY `sdafas` (`role_id`),
  CONSTRAINT `dfa` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`),
  CONSTRAINT `sdafas` FOREIGN KEY (`role_id`) REFERENCES `role_info` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of temp_usr_role
-- ----------------------------
INSERT INTO `temp_usr_role` VALUES ('1', '1', '1');
INSERT INTO `temp_usr_role` VALUES ('2', '2', '2');
INSERT INTO `temp_usr_role` VALUES ('3', '3', '3');
INSERT INTO `temp_usr_role` VALUES ('4', '4', '4');
INSERT INTO `temp_usr_role` VALUES ('5', '5', '5');
INSERT INTO `temp_usr_role` VALUES ('6', '6', '6');
INSERT INTO `temp_usr_role` VALUES ('7', '7', '7');
INSERT INTO `temp_usr_role` VALUES ('8', '8', '8');
INSERT INTO `temp_usr_role` VALUES ('13', '9', '9');
