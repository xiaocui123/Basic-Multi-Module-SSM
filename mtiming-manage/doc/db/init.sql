/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : mtiming

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2019-02-19 14:25:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for result
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result` (
  `Cat` varchar(30) DEFAULT NULL,
  `Bib` varchar(30) DEFAULT NULL,
  `NameChi` varchar(30) DEFAULT NULL,
  `NameEng` varchar(30) DEFAULT NULL,
  `Tag` varchar(30) DEFAULT NULL,
  `Gender` varchar(30) DEFAULT NULL,
  `Phone` varchar(30) DEFAULT NULL,
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
-- Records of sys_department
-- ----------------------------

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
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('175b193c-b3e7-4dcd-b534-4b9f76566d50', '759f441e-2a55-4b28-99e9-107122961976', '3624fe80-b49c-490d-8956-69e382f815d3');
INSERT INTO `sys_role_permission` VALUES ('19e20e02-480b-4e7f-bee6-f9bda8238946', '4175ec05-41e9-446c-ab7a-5bd72c392002', 'fa9cba1c-5c08-483a-b2a6-df11713d7c4d');
INSERT INTO `sys_role_permission` VALUES ('738686e2-42a8-4294-bf7d-023278a6e344', '694cc7f2-12f7-4613-8139-be0a5db90995', 'fb9cba1c-5c08-483a-b2a6-df11713d7c4d');
INSERT INTO `sys_role_permission` VALUES ('a39d4a40-9e60-4d40-9e6b-795a1c7c20f6', '759f441e-2a55-4b28-99e9-107122961976', 'fc9cba1c-5c08-483a-b2a6-df11713d7c4d');
INSERT INTO `sys_role_permission` VALUES ('a89661c1-6f45-4873-9f9d-69dbd30c26a4', '277b3350-b289-47c3-a0eb-138d3bd79093', '53fd4c51-0f32-4654-be17-3d88067f5225');
INSERT INTO `sys_role_permission` VALUES ('bae55248-9b80-42a6-a23f-6dd82c2ca9d7', '759f441e-2a55-4b28-99e9-107122961976', '618d87e919ff41c999541ec64309037c');

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
-- Records of sys_t_dict
-- ----------------------------
INSERT INTO `sys_t_dict` VALUES ('250', 'activityclassify', '业务分类', '', null, null, '1');
INSERT INTO `sys_t_dict` VALUES ('251', 'volunteer_require', '志愿者需求', null, null, null, '1');
INSERT INTO `sys_t_dict` VALUES ('2501', null, '竞赛及物资', null, '250', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('2502', null, '赛道及物资', null, '250', '2', '1');
INSERT INTO `sys_t_dict` VALUES ('2503', null, '计时计分', null, '250', '3', '1');
INSERT INTO `sys_t_dict` VALUES ('2504', null, '医疗', null, '250', '4', '1');
INSERT INTO `sys_t_dict` VALUES ('2505', null, '志愿者', null, '250', '5', '1');
INSERT INTO `sys_t_dict` VALUES ('2511', null, '问讯处', null, '251', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('2512', null, '集结区', null, '251', '2', '1');
INSERT INTO `sys_t_dict` VALUES ('2513', null, '特邀选手', null, '251', '3', '1');
INSERT INTO `sys_t_dict` VALUES ('2514', null, '更衣区', null, '251', '4', '1');
INSERT INTO `sys_t_dict` VALUES ('2515', null, '存包区', null, '251', '5', '1');
INSERT INTO `sys_t_dict` VALUES ('2516', null, '起终点移动厕所指引', null, '251', '6', '1');
INSERT INTO `sys_t_dict` VALUES ('2517', null, '起终点医疗中心', null, '251', '7', '1');
INSERT INTO `sys_t_dict` VALUES ('2518', null, '赛会执行中心', null, '251', '8', '1');
INSERT INTO `sys_t_dict` VALUES ('2519', null, '颁奖等候区', null, '251', '9', '1');
INSERT INTO `sys_t_dict` VALUES ('2520', null, 'VIP区', null, '251', '10', '1');
INSERT INTO `sys_t_dict` VALUES ('2521', null, '媒体区', null, '251', '11', '1');
INSERT INTO `sys_t_dict` VALUES ('2522', null, '终点补给区', null, '251', '12', '1');
INSERT INTO `sys_t_dict` VALUES ('2523', null, '计时区', null, '251', '13', '1');
INSERT INTO `sys_t_dict` VALUES ('2524', null, '冲刺区', null, '251', '14', '1');
INSERT INTO `sys_t_dict` VALUES ('2525', null, '起跑倒计时举牌', null, '251', '15', '1');
INSERT INTO `sys_t_dict` VALUES ('2526', null, '停车场指引', null, '251', '16', '1');
INSERT INTO `sys_t_dict` VALUES ('2527', null, '沿途饮水饮料补给站', null, '251', '17', '1');
INSERT INTO `sys_t_dict` VALUES ('2528', null, '沿途医疗站', null, '251', '18', '1');
INSERT INTO `sys_t_dict` VALUES ('2529', null, '沿途赛道指引 手举KT板', null, '251', '19', '1');
INSERT INTO `sys_t_dict` VALUES ('2530', null, '赛后按摩区', null, '251', '20', '1');
INSERT INTO `sys_t_dict` VALUES ('2531', null, '彩绘区', null, '251', '21', '1');
INSERT INTO `sys_t_dict` VALUES ('2532', null, '技术官员', null, '251', '22', '1');
INSERT INTO `sys_t_dict` VALUES ('2533', null, '竞赛主管', null, '251', '23', '1');
INSERT INTO `sys_t_dict` VALUES ('2534', null, '检录裁判长-配志愿者', null, '251', '24', '1');
INSERT INTO `sys_t_dict` VALUES ('2535', null, '起终点裁判长-配志愿者', null, '251', '25', '1');
INSERT INTO `sys_t_dict` VALUES ('2536', null, '检查裁判长', null, '251', '26', '1');
INSERT INTO `sys_t_dict` VALUES ('2537', null, '编排记录裁判长', null, '251', '27', '1');
INSERT INTO `sys_t_dict` VALUES ('2538', null, '兴奋剂检察官-配志愿者', null, '251', '28', '1');
INSERT INTO `sys_t_dict` VALUES ('2539', null, '特约选手服务', null, '251', '29', '1');
INSERT INTO `sys_t_dict` VALUES ('2540', null, '自备饮料', null, '251', '30', '1');
INSERT INTO `sys_t_dict` VALUES ('2541', null, '机动组', null, '251', '31', '1');
INSERT INTO `sys_t_dict` VALUES ('25111', null, '地铁出口', null, '2511', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('25112', null, '安检入口前', null, '2511', '2', '1');
INSERT INTO `sys_t_dict` VALUES ('25113', null, '安检入口后', null, '2511', '3', '1');
INSERT INTO `sys_t_dict` VALUES ('25121', null, '半程组别特邀选手集结区', null, '2512', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('25122', null, '半程组别大众选手集结A区', null, '2512', '2', '1');
INSERT INTO `sys_t_dict` VALUES ('25123', null, '半程组别大众选手集结B区', null, '2512', '3', '1');
INSERT INTO `sys_t_dict` VALUES ('25124', null, '迷你组别集结区', null, '2512', '4', '1');
INSERT INTO `sys_t_dict` VALUES ('25131', null, '特邀选手接待处', null, '2513', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('25141', null, '半程、迷你选手更衣区', null, '2514', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('25151', null, '半程组别大众A区存包', null, '2515', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('25152', null, '半程组别大众B区存包', null, '2515', '2', '1');
INSERT INTO `sys_t_dict` VALUES ('25153', null, '迷你组别存包区', null, '2515', '3', '1');
INSERT INTO `sys_t_dict` VALUES ('25221', null, '半程组别终点补给', null, '2522', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('25222', null, '迷你组别终点补给', null, '2522', '2', '1');
INSERT INTO `sys_t_dict` VALUES ('25231', null, '起终点区', null, '2523', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('25232', null, '沿途计时点', null, '2523', '2', '1');
INSERT INTO `sys_t_dict` VALUES ('25241', null, '半程组别', null, '2524', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('25242', null, '迷你组别', null, '2524', '2', '1');
INSERT INTO `sys_t_dict` VALUES ('25261', null, '大众选手停车指引', null, '2526', '1', '1');
INSERT INTO `sys_t_dict` VALUES ('25262', null, 'VIP停车场指引', null, '2526', '2', '1');
INSERT INTO `sys_t_dict` VALUES ('25271', null, '沿途10个水站', null, '2527', '1', '1');

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
-- Records of sys_t_menu
-- ----------------------------
INSERT INTO `sys_t_menu` VALUES ('3624fe80-b49c-490d-8956-69e382f815d3', null, '部门人员', 'department/init', 'glyphicon glyphicon-user', null, null, '1');
INSERT INTO `sys_t_menu` VALUES ('53fd4c51-0f32-4654-be17-3d88067f5225', null, '媒体服务', 'mediaactivity/init', 'glyphicon glyphicon-book', null, null, '1');
INSERT INTO `sys_t_menu` VALUES ('618d87e919ff41c999541ec64309037c', null, '角色管理', 'sysrole/init', 'glyphicon glyphicon-duplicate', null, null, '1');
INSERT INTO `sys_t_menu` VALUES ('fa9cba1c-5c08-483a-b2a6-df11713d7c4d', null, '赛事管理', 'marathon/init', 'glyphicon glyphicon-list', null, null, '1');
INSERT INTO `sys_t_menu` VALUES ('fb9cba1c-5c08-483a-b2a6-df11713d7c4d', null, '活动执行', 'userMarathonActivity/init', 'glyphicon glyphicon-list', null, null, '1');
INSERT INTO `sys_t_menu` VALUES ('fc9cba1c-5c08-483a-b2a6-df11713d7c4d', null, '赛事计时', 'timing/init', 'glyphicon glyphicon-list', null, null, '1');

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
-- Records of sys_t_role
-- ----------------------------
INSERT INTO `sys_t_role` VALUES ('277b3350-b289-47c3-a0eb-138d3bd79093', '媒体工作', '媒体工作，媒体活动维护');
INSERT INTO `sys_t_role` VALUES ('4175ec05-41e9-446c-ab7a-5bd72c392002', '统筹协调', '赛事信息维护、全局工作把控');
INSERT INTO `sys_t_role` VALUES ('694cc7f2-12f7-4613-8139-be0a5db90995', '活动执行', '');
INSERT INTO `sys_t_role` VALUES ('759f441e-2a55-4b28-99e9-107122961976', '系统管理', '系统配置管理、部门人员维护');

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
-- Records of sys_t_user
-- ----------------------------
INSERT INTO `sys_t_user` VALUES ('0', 'zhangsan', '张三', '96e79218965eb72c92a549dd5a330112', null, null, null, null, null, null, '2018-04-24 20:46:25', null, '2018-04-24 20:46:25', null, null);
INSERT INTO `sys_t_user` VALUES ('0cf8b30f-a6ca-4fab-be4d-c17ac0ffc17e', 'media', '媒体人', '96e79218965eb72c92a549dd5a330112', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_t_user` VALUES ('6983541c-ae08-4aea-89f3-34e0651c6455', 'marathon', '领导', '96e79218965eb72c92a549dd5a330112', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_t_user` VALUES ('71e50822-2adc-4adf-a621-f5a8671378e2', 'admin', '管理员', '96e79218965eb72c92a549dd5a330112', null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` varchar(36) NOT NULL,
  `role_id` varchar(36) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关联表\r\n';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('0', '694cc7f2-12f7-4613-8139-be0a5db90995');
INSERT INTO `sys_user_role` VALUES ('0cf8b30f-a6ca-4fab-be4d-c17ac0ffc17e', '277b3350-b289-47c3-a0eb-138d3bd79093');
INSERT INTO `sys_user_role` VALUES ('6983541c-ae08-4aea-89f3-34e0651c6455', '4175ec05-41e9-446c-ab7a-5bd72c392002');
INSERT INTO `sys_user_role` VALUES ('71e50822-2adc-4adf-a621-f5a8671378e2', '759f441e-2a55-4b28-99e9-107122961976');
SET FOREIGN_KEY_CHECKS=1;
