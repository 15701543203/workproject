/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50543
Source Host           : 127.0.0.1:3306
Source Database       : permissiondb

Target Server Type    : MYSQL
Target Server Version : 50543
File Encoding         : 65001

Date: 2019-01-16 17:26:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role_info
-- ----------------------------
DROP TABLE IF EXISTS `role_info`;
CREATE TABLE `role_info` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `role_status` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `gentime` datetime DEFAULT NULL,
  `role_description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of role_info
-- ----------------------------
INSERT INTO `role_info` VALUES ('1', 'admin', '1', '2018-12-25 00:00:00', '管理员');
INSERT INTO `role_info` VALUES ('2', 'thm_operator', '1', '2018-12-25 00:00:00', 'Thm运用人员');
INSERT INTO `role_info` VALUES ('3', 'pbm_editor', '1', '2018-12-25 00:00:00', '录入员');
INSERT INTO `role_info` VALUES ('4', 'pbm_reviewer', '1', '2018-12-25 00:00:00', '审方专家');
INSERT INTO `role_info` VALUES ('5', 'pbm_mmgr', '1', '2018-12-25 00:00:00', '医学经理');
INSERT INTO `role_info` VALUES ('6', 'pbm_cmgr', '1', '2018-12-25 00:00:00', '个案管理师');
INSERT INTO `role_info` VALUES ('7', 'ccm_mmgr', '1', '2018-12-25 00:00:00', 'CCM医学经理');
INSERT INTO `role_info` VALUES ('8', 'ccm_cngr', '1', '2018-12-25 00:00:00', 'CCM个案管理师');
INSERT INTO `role_info` VALUES ('9', 'guest', '1', '2018-12-25 00:00:00', '游客');
