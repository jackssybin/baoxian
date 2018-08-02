/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-07-02 10:33:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '22');
INSERT INTO `user` VALUES ('2', '关羽', '22');
INSERT INTO `user` VALUES ('3', '张飞', '21');
INSERT INTO `user` VALUES ('4', '刘备', '32');
INSERT INTO `user` VALUES ('5', '赵云', '25');
INSERT INTO `user` VALUES ('6', '马超', '24');
INSERT INTO `user` VALUES ('7', '黄忠', '21');
INSERT INTO `user` VALUES ('8', '张三', '21');
INSERT INTO `user` VALUES ('9', '李四', '22');
INSERT INTO `user` VALUES ('10', '李四1', '21');
INSERT INTO `user` VALUES ('12', '李四3', '98');
INSERT INTO `user` VALUES ('13', '王五', '21');
INSERT INTO `user` VALUES ('14', '哇啊哈哈', '11');



DROP TABLE IF EXISTS `bx_baoxian`;
CREATE TABLE `bx_baoxian` (
  `id` varchar(32) NOT NULL,
  `deptcode` varchar(20) DEFAULT NULL COMMENT '上报机构id',
  `year` int(255) DEFAULT NULL COMMENT '填报年份',
  `month` int(255) DEFAULT NULL COMMENT '填报季度',
  `deptname` varchar(255) DEFAULT NULL COMMENT '中介机构名称',
  `deptpeoplenow` int(255) DEFAULT NULL COMMENT '机构人数-本季度末',
  `deptpeoplepre` int(255) DEFAULT NULL COMMENT '机构人数-上年同期',
  `certificatepeoplenow` int(255) DEFAULT NULL COMMENT '持证人数-本季度末',
  `certificatepeoplepre` int(255) DEFAULT NULL COMMENT '持证人数-上年同期',
  `premiumnow` decimal(10,3) DEFAULT NULL COMMENT '保费金额-本年累计',
  `premiumpre` decimal(10,3) DEFAULT NULL COMMENT '保费金额-上年同期',
  `turnovernow` decimal(10,3) DEFAULT NULL COMMENT '佣金金额-本年累计',
  `turnoverpre` decimal(10,3) DEFAULT NULL COMMENT '佣金金额-上年同期',
  `profitnow` decimal(10,3) DEFAULT NULL COMMENT '利润金额-本年累计',
  `profitpre` decimal(10,3) DEFAULT NULL COMMENT '利润金额-上年同期',
  `reportplace` varchar(100) DEFAULT NULL COMMENT '报送地点',
  `createman` varchar(100) DEFAULT NULL COMMENT '提交人',
  `auditman` varchar(100) DEFAULT NULL COMMENT '审核人',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `status` varchar(10) DEFAULT NULL COMMENT '状态',
  `createtime` datetime DEFAULT NULL COMMENT '提交时间',
  `updatetime` datetime DEFAULT NULL COMMENT '审核时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;





DROP TABLE IF EXISTS `bx_chanxian`;
CREATE TABLE `bx_chanxian` (
  `id` varchar(32) NOT NULL,
  `bx_id` varchar(32) NOT NULL,
  `arearange` varchar(20)  COMMENT '区域范围',
  `insname` varchar(100) COMMENT '保险公司名称',
  `insurancename` varchar(100) COMMENT '险种名称',
  `premiumnow` decimal(10,3) COMMENT '保费-本期',
  `premiumsurrender` decimal(10,3) COMMENT '退保保费-本期',
  `premiumadd` decimal(10,3) COMMENT '批增保费-本期',
  `premiumminus` decimal(10,3) COMMENT '批减保费-本期',
  `premiumpre` decimal(10,3) COMMENT '保费-累计',
  `commissionnow` decimal(10,3) COMMENT '佣金-本期',
  `commissionsurrender` decimal(10,3) COMMENT '退保佣金-本期',
  `commissionadd` decimal(10,3) COMMENT '批增佣金-本期',
  `commissionminus` decimal(10,3) COMMENT '批减佣金-本期',
  `commissionreinsurance` decimal(10,3) COMMENT '再保佣金-本期',
  `commissionpre` decimal(10,3) COMMENT '佣金-累计',
  `premiumnet` decimal(10,3) COMMENT '本期网销保费',
  `premiumtel` decimal(10,3) COMMENT '本期电销保费',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `bx_shouxian`;
CREATE TABLE `bx_shouxian` (
  `id` varchar(32) NOT NULL,
  `bx_id` varchar(32) NOT NULL,
  `arearange` varchar(20)  COMMENT '区域范围',
  `insname` varchar(100) COMMENT '保险公司名称',
  `insurancename` varchar(100) COMMENT '险种名称',
  `premiumnow` decimal(10,3) COMMENT '本期新单保费',
  `premiumpre` decimal(10,3) COMMENT '累计新单保费',
  `premiumrenewalnow` decimal(10,3) COMMENT '本期续期保费',
  `premiumrenewalpre` decimal(10,3) COMMENT '累计续期保费',
  `commissionnow` decimal(10,3) COMMENT '本期新单佣金',
  `commissionpre` decimal(10,3) COMMENT '累计新单佣金',
  `commissionrenewalnow` decimal(10,3) COMMENT '本期续期佣金',
  `commissionrenewalpre` decimal(10,3) COMMENT '累计续期佣金',
  `premiumnet` decimal(10,3) COMMENT '保费-网销',
  `premiumtel` decimal(10,3) COMMENT '保费-电销',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;