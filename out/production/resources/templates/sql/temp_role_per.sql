/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50543
Source Host           : 127.0.0.1:3306
Source Database       : permissiondb

Target Server Type    : MYSQL
Target Server Version : 50543
File Encoding         : 65001

Date: 2019-01-16 17:26:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for temp_role_per
-- ----------------------------
DROP TABLE IF EXISTS `temp_role_per`;
CREATE TABLE `temp_role_per` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roel_id` int(11) DEFAULT NULL,
  `per_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1` (`roel_id`),
  KEY `FK2` (`per_id`),
  CONSTRAINT `FK1` FOREIGN KEY (`roel_id`) REFERENCES `role_info` (`role_id`),
  CONSTRAINT `FK2` FOREIGN KEY (`per_id`) REFERENCES `per_info` (`per_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of temp_role_per
-- ----------------------------
INSERT INTO `temp_role_per` VALUES ('1', '1', '1');
INSERT INTO `temp_role_per` VALUES ('2', '1', '2');
INSERT INTO `temp_role_per` VALUES ('3', '1', '3');
INSERT INTO `temp_role_per` VALUES ('4', '1', '4');
INSERT INTO `temp_role_per` VALUES ('5', '1', '5');
INSERT INTO `temp_role_per` VALUES ('6', '1', '6');
INSERT INTO `temp_role_per` VALUES ('7', '1', '7');
INSERT INTO `temp_role_per` VALUES ('8', '1', '8');
INSERT INTO `temp_role_per` VALUES ('9', '1', '9');
INSERT INTO `temp_role_per` VALUES ('10', '1', '10');
INSERT INTO `temp_role_per` VALUES ('11', '1', '12');
INSERT INTO `temp_role_per` VALUES ('12', '1', '13');
INSERT INTO `temp_role_per` VALUES ('13', '1', '14');
