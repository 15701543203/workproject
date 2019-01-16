/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50543
Source Host           : 127.0.0.1:3306
Source Database       : permissiondb

Target Server Type    : MYSQL
Target Server Version : 50543
File Encoding         : 65001

Date: 2019-01-16 17:26:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for per_info
-- ----------------------------
DROP TABLE IF EXISTS `per_info`;
CREATE TABLE `per_info` (
  `per_id` int(11) NOT NULL AUTO_INCREMENT,
  `per_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `page_url` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `meta` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `order_number` int(11) DEFAULT NULL,
  `is_parent` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `permission` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `type` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `per_description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`per_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of per_info
-- ----------------------------
INSERT INTO `per_info` VALUES ('1', '医学经理', null, '', '', '1', '1', '', '', '医学经理');
INSERT INTO `per_info` VALUES ('2', '医学经理个案服务待办', '1', '/medicalManager/medicalAgency', 'medicalManager', '2', '0', 'ccm:operator:query', '', '个案服务待办');
INSERT INTO `per_info` VALUES ('3', '医学经理个案追踪池', '1', '/medicalManager/trackIngPoolList', 'trackIngPoolList', '3', '0', 'ccm:operator', '', '追踪池');
INSERT INTO `per_info` VALUES ('4', '个案管理师', null, '', '', '4', '1', 'ccm:caseManager:*', '', '个案管理师');
INSERT INTO `per_info` VALUES ('5', '个案服务待办', '4', '/caseManager/caseServiceAgency', 'caseServiceAgency', '5', '0', 'ccm:caseManager:wait', '', '个案服务待办');
INSERT INTO `per_info` VALUES ('6', 'PBM结构化处方', null, '', '', '6', '1', 'ccm:structureAgent:*', '', ' 结构化处方');
INSERT INTO `per_info` VALUES ('7', 'PBM结构化处方待办', '6', '/structureAgent/index', 'structureAgent', '7', '0', 'ccm:structureAgent:wait', '', '结构化处方代办');
INSERT INTO `per_info` VALUES ('8', 'PBM药方审核', null, '', '', '8', '1', 'ccm:pharmacyReview:*', '', '药方审核');
INSERT INTO `per_info` VALUES ('9', 'PBM审方待办', '8', '/pharmacyReview/index', 'pharmacyReview', '9', '0', 'ccm:pharmacyReview:wait', '', '审方代办');
INSERT INTO `per_info` VALUES ('10', '特药-医学经理', null, '', '', '10', '1', '', '', '特药-医学经理');
INSERT INTO `per_info` VALUES ('11', '特药-医学经理待办', '10', '/specialMedicalManager/index', 'specialMedicalManager', '11', '0', 'ccm:pbm', '', '审方代办');
INSERT INTO `per_info` VALUES ('12', '特药-医学经理追踪池', '10', '/specialMedicalManager/specialTrackIngPoolList', 'specialTrackIngPoolList', '12', '0', 'ccm:pbm', '', '追踪池');
INSERT INTO `per_info` VALUES ('13', '特药-个案管理师', null, '', '', '13', '1', 'ccm:specialCaseManager:*', '', '特药-个案管理师');
INSERT INTO `per_info` VALUES ('14', '特药-个案管理师待办', '13', '/specialCaseManager/index', 'specialCaseManager', '14', '0', 'ccm:specialCaseManager:wait', '', '个案管理师代办');
INSERT INTO `per_info` VALUES ('15', null, null, null, null, null, null, null, null, null);
