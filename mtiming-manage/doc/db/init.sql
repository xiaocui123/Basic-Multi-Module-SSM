/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : mtiming

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2019-03-04 14:51:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for points
-- ----------------------------
DROP TABLE IF EXISTS `points`;
CREATE TABLE `points` (
  `CourseID` int(10) NOT NULL,
  `Points` varchar(20) NOT NULL,
  `Device` varchar(20) NOT NULL,
  `Seq` int(10) NOT NULL,
  `PriorPoint` varchar(20) DEFAULT NULL,
  `Interval` int(10) DEFAULT NULL,
  `NextPoint` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for racecatmaster
-- ----------------------------
DROP TABLE IF EXISTS `racecatmaster`;
CREATE TABLE `racecatmaster` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `RaceNo` int(10) NOT NULL,
  `RaceCat` varchar(10) NOT NULL,
  `CourseID` int(10) NOT NULL,
  `RaceCatName` varchar(100) DEFAULT NULL,
  `RaceCatNameChi` varchar(100) DEFAULT NULL,
  `Gender` char(1) NOT NULL,
  `IsTeam` char(1) NOT NULL,
  `CoreLeg` int(10) NOT NULL,
  `NoOfPrize` int(10) NOT NULL,
  `Header` char(1) NOT NULL,
  `Seperator` varchar(10) NOT NULL,
  `Laps` int(10) NOT NULL,
  `RankCatBy` char(1) NOT NULL,
  `WinPos` int(10) DEFAULT NULL,
  `TeamSize` int(10) DEFAULT NULL,
  `TeamTimeMode` char(1) DEFAULT NULL,
  PRIMARY KEY (`RaceCat`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `PK_RaceCatMaster` (`RaceCat`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for racegun
-- ----------------------------
DROP TABLE IF EXISTS `racegun`;
CREATE TABLE `racegun` (
  `Race` int(10) NOT NULL,
  `PlannedGunTime` varchar(12) DEFAULT NULL,
  `GunTime` varchar(24) DEFAULT NULL,
  `CutOffOffset` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`Race`),
  UNIQUE KEY `PK_RaceGun` (`Race`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for result
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result` (
  `Tag` varchar(30) DEFAULT NULL,
  `ScoreGun` varchar(30) DEFAULT NULL,
  `ScoreClean` varchar(30) DEFAULT NULL,
  `RkCat` varchar(30) DEFAULT NULL,
  `RkGun` varchar(30) DEFAULT NULL,
  `Start` varchar(30) DEFAULT NULL,
  `CP1_1` varchar(30) DEFAULT NULL,
  `CP1_2` varchar(30) DEFAULT NULL,
  `CP1_3` varchar(30) DEFAULT NULL,
  `CP2` varchar(30) DEFAULT NULL,
  `CP1_4` varchar(30) DEFAULT NULL,
  `Finish` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for runner
-- ----------------------------
DROP TABLE IF EXISTS `runner`;
CREATE TABLE `runner` (
  `Cat` varchar(10) NOT NULL,
  `Cat2` varchar(10) NOT NULL,
  `Bib` varchar(30) DEFAULT NULL,
  `NameChi` varchar(100) DEFAULT NULL,
  `NameEng` varchar(100) DEFAULT NULL,
  `Tag` int(10) NOT NULL,
  `Disq` varchar(255) DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `TeamType` varchar(100) DEFAULT NULL,
  `TeamCat` varchar(100) DEFAULT NULL,
  `Team` varchar(100) DEFAULT NULL,
  `TeamNameEng` varchar(100) DEFAULT NULL,
  `TeamNameChi` varchar(100) DEFAULT NULL,
  `CoreLeg` char(1) DEFAULT NULL,
  `Association` varchar(100) DEFAULT NULL,
  `Phone` varchar(200) DEFAULT NULL,
  `LastYearTime` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`Tag`),
  UNIQUE KEY `PK_Runner` (`Tag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_department
-- ----------------------------
DROP TABLE IF EXISTS `sys_department`;
CREATE TABLE `sys_department` (
  `department_id` varchar(36) NOT NULL COMMENT 'id',
  `department_name` varchar(36) NOT NULL COMMENT '部门名称',
  `parent_dep_id` varchar(36) DEFAULT NULL COMMENT '上级部门id',
  `department_update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `dept_order` int(11) DEFAULT NULL COMMENT '部门顺序',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门信息表';

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `rp_id` varchar(36) NOT NULL COMMENT ' id',
  `role_id` varchar(36) DEFAULT NULL COMMENT '角色id',
  `permission_id` varchar(36) DEFAULT NULL COMMENT ' 权限id',
  PRIMARY KEY (`rp_id`),
  KEY `permission_id` (`permission_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限表';

-- ----------------------------
-- Table structure for sys_t_dict
-- ----------------------------
DROP TABLE IF EXISTS `sys_t_dict`;
CREATE TABLE `sys_t_dict` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '字典名称',
  `val` varchar(255) NOT NULL COMMENT '字典值',
  `describe` varchar(255) DEFAULT NULL COMMENT '字典描述',
  `parent` int(11) DEFAULT NULL,
  `sortno` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT '1' COMMENT '字典是否有效，0：无效 1：有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统字典表';

-- ----------------------------
-- Table structure for sys_t_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_t_menu`;
CREATE TABLE `sys_t_menu` (
  `menu_id` varchar(36) NOT NULL COMMENT ' 菜单id',
  `permission_id` varchar(36) DEFAULT NULL COMMENT '权限id',
  `menu_name` varchar(64) DEFAULT NULL COMMENT '菜单名称',
  `menu_url` varchar(100) DEFAULT NULL COMMENT '菜单URL',
  `menu_class` varchar(64) DEFAULT NULL COMMENT ' 菜单样式',
  `parent_id` varchar(36) DEFAULT NULL COMMENT '父菜单id',
  `display_order` int(11) DEFAULT NULL COMMENT '菜单顺序',
  `menu_status` varchar(1) DEFAULT '1' COMMENT '菜单状态， 是否显示该菜单 0不显示 1显示',
  PRIMARY KEY (`menu_id`),
  KEY `permission_id` (`permission_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单项表';

-- ----------------------------
-- Table structure for sys_t_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_t_role`;
CREATE TABLE `sys_t_role` (
  `role_id` varchar(36) NOT NULL COMMENT '系统内置的5个角色的ID是不能修改的，必须满足一下对应关系\r\n1 上报\r\n2 审核\r\n3 领导\r\n4 发布\r\n5 普通用户',
  `role_name` varchar(36) DEFAULT NULL COMMENT '角色名称',
  `role_desc` varchar(64) DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Table structure for sys_t_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_t_user`;
CREATE TABLE `sys_t_user` (
  `user_id` varchar(36) NOT NULL,
  `user_account` varchar(20) NOT NULL COMMENT '登录名称',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户姓名',
  `user_psw` varchar(255) DEFAULT NULL COMMENT '登录密码 MD5',
  `user_gender` varchar(2) DEFAULT NULL,
  `user_age` int(11) DEFAULT NULL COMMENT '用户年龄',
  `mobile_phone` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `dept_id` varchar(36) DEFAULT NULL COMMENT '所属部门',
  `create_dt` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(36) DEFAULT NULL,
  `update_dt` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_by` varchar(36) DEFAULT NULL,
  `user_status` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` varchar(36) NOT NULL,
  `role_id` varchar(36) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关联表\r\n';
SET FOREIGN_KEY_CHECKS=1;
