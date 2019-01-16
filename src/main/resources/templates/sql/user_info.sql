/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50543
Source Host           : 127.0.0.1:3306
Source Database       : permissiondb

Target Server Type    : MYSQL
Target Server Version : 50543
File Encoding         : 65001

Date: 2019-01-16 17:26:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `user_pwd` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `true_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `mobile` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `status` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `salt` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `remark` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'zhao', '1', '赵', '15701543203', 'zhao_@qq.com', '1', '知否', '');
INSERT INTO `user_info` VALUES ('2', 'qian', '1', '钱', '15701543204', 'qian_@qq.com', '1', '知否', '');
INSERT INTO `user_info` VALUES ('3', 'sun', '1', '孙', '15701543205', 'sun_@qq.com', '1', '应该', '');
INSERT INTO `user_info` VALUES ('4', 'li', '1', '李', '15701543206', 'li_@qq.com', '1', '是', '');
INSERT INTO `user_info` VALUES ('5', 'zhou', '1', '周', '15701543207', 'zhou_@qq.com', '1', '绿肥', '');
INSERT INTO `user_info` VALUES ('6', 'wu', '1', '吴', '15701543208', 'wu_@qq.com', '1', '红瘦', '');
INSERT INTO `user_info` VALUES ('7', 'zheng', '1', '郑', '15701543209', 'zheng_@qq.com', '1', '璎', '');
INSERT INTO `user_info` VALUES ('8', 'wang', '1', '王', '15701543210', 'wang_@qq.com', '1', '珞', '');
INSERT INTO `user_info` VALUES ('9', 'feng', '1', '冯', '15701543211', 'feng_@qq.com', '1', '传', '');
