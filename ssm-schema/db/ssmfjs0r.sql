/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ssmfjs0r

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2020-10-23 10:48:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `bumenxinxi`
-- ----------------------------
DROP TABLE IF EXISTS `bumenxinxi`;
CREATE TABLE `bumenxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `bumen` varchar(200) NOT NULL COMMENT '部门',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1603367853271 DEFAULT CHARSET=utf8 COMMENT='部门信息';

-- ----------------------------
-- Records of bumenxinxi
-- ----------------------------
INSERT INTO `bumenxinxi` VALUES ('1', '2020-10-22 19:20:31', '园林组织部');
INSERT INTO `bumenxinxi` VALUES ('2', '2020-10-22 19:20:31', '园林策划部');
INSERT INTO `bumenxinxi` VALUES ('3', '2020-10-22 19:20:31', '园林艺术部');
INSERT INTO `bumenxinxi` VALUES ('1603367853270', '2020-10-22 19:57:32', '园林修剪部');

-- ----------------------------
-- Table structure for `config`
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES ('1', 'picture1', 'http://localhost:8080/ssmFjs0R/upload/1603367606700.jpg');
INSERT INTO `config` VALUES ('2', 'picture2', 'http://localhost:8080/ssmFjs0R/upload/1603367615441.jpg');
INSERT INTO `config` VALUES ('3', 'picture3', 'http://localhost:8080/ssmFjs0R/upload/1603367626269.jpg');
INSERT INTO `config` VALUES ('4', 'picture4', 'http://localhost:8080/ssmFjs0R/upload/1603367636007.jpg');
INSERT INTO `config` VALUES ('5', 'picture5', 'http://localhost:8080/ssmFjs0R/upload/1603367646980.jpg');
INSERT INTO `config` VALUES ('6', 'homepage', 'http://localhost:8080/ssmFjs0R/upload/1603367654677.jpg');

-- ----------------------------
-- Table structure for `quyuguanlirenyuan`
-- ----------------------------
DROP TABLE IF EXISTS `quyuguanlirenyuan`;
CREATE TABLE `quyuguanlirenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `fuzequyu` varchar(200) DEFAULT NULL COMMENT '负责区域',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1603367917978 DEFAULT CHARSET=utf8 COMMENT='区域管理人员';

-- ----------------------------
-- Records of quyuguanlirenyuan
-- ----------------------------
INSERT INTO `quyuguanlirenyuan` VALUES ('1', '2020-10-22 19:20:31', '001', '001', '王凡', '男', '园林策划部', 'A区', 'http://localhost:8080/ssmFjs0R/upload/1603366439633.png', '440300199101010001', '15214121412');
INSERT INTO `quyuguanlirenyuan` VALUES ('2', '2020-10-22 19:20:31', '002', '001', '李倩', '女', '园林艺术部', 'B区', 'http://localhost:8080/ssmFjs0R/upload/1603366474878.png', '440300199202020002', '15219819992');
INSERT INTO `quyuguanlirenyuan` VALUES ('1603367917977', '2020-10-22 19:58:37', '003', '001', '王凡', '男', '园林修剪部', 'C区', 'http://localhost:8080/ssmFjs0R/upload/1603367909377.png', '441214121412141214', '15214121412');

-- ----------------------------
-- Table structure for `renwufabu`
-- ----------------------------
DROP TABLE IF EXISTS `renwufabu`;
CREATE TABLE `renwufabu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `quyu` varchar(200) DEFAULT NULL COMMENT '区域',
  `gongzuoyaoqiu` longtext COMMENT '工作要求',
  `renwuriqi` date DEFAULT NULL COMMENT '任务日期',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1603368032671 DEFAULT CHARSET=utf8 COMMENT='任务发布';

-- ----------------------------
-- Records of renwufabu
-- ----------------------------
INSERT INTO `renwufabu` VALUES ('1', '2020-10-22 19:20:31', '标题1', '工号1', '姓名1', '区域1', '工作要求1', '2020-10-22', '账号1');
INSERT INTO `renwufabu` VALUES ('2', '2020-10-22 19:20:31', '标题2', '工号2', '姓名2', '区域2', '工作要求2', '2020-10-22', '账号2');
INSERT INTO `renwufabu` VALUES ('3', '2020-10-22 19:20:31', '标题3', '工号3', '姓名3', '区域3', '工作要求3', '2020-10-22', '账号3');
INSERT INTO `renwufabu` VALUES ('1603366528693', '2020-10-22 19:35:28', '12', '2', '姓名2', 'B区', '121221', '2020-10-01', '002');
INSERT INTO `renwufabu` VALUES ('1603368032670', '2020-10-22 20:00:32', '今日任务', '4', '刘倩', 'C区', '对百合进行浇水施肥，修剪任务', '2020-10-01', '003');

-- ----------------------------
-- Table structure for `token`
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='token表';

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES ('1', '1', 'abo', 'users', '管理员', 'kke1b3maemsvuptjep1afrivrgtmwqe9', '2020-10-22 19:29:56', '2020-10-22 21:08:57');
INSERT INTO `token` VALUES ('2', '1', '001', 'quyuguanlirenyuan', '区域管理人员', 'stnvecb4jym6h58gy60n301ad4d6074u', '2020-10-22 19:30:36', '2020-10-22 20:30:36');
INSERT INTO `token` VALUES ('3', '2', '002', 'quyuguanlirenyuan', '区域管理人员', 'd3wuicgq4hoznlsajfc8mgfmruu702v3', '2020-10-22 19:35:10', '2020-10-22 20:36:18');
INSERT INTO `token` VALUES ('4', '2', '2', 'yuangong', '员工', 'ze9gkzr0jvuus461k4kkld2bidb24qka', '2020-10-22 19:35:38', '2020-10-22 20:55:35');
INSERT INTO `token` VALUES ('5', '1', '1', 'yuangong', '员工', 'pfeskgb5oqjn1ir4aezp9t7k8l68m717', '2020-10-22 19:54:52', '2020-10-22 21:08:36');
INSERT INTO `token` VALUES ('6', '1603367917977', '003', 'quyuguanlirenyuan', '区域管理人员', 'tyyqfjrt21xkmwoicicg0kj561rcy5dk', '2020-10-22 19:59:00', '2020-10-22 21:05:16');
INSERT INTO `token` VALUES ('7', '1603367982389', '4', 'yuangong', '员工', '7utf4ekt26fy7bd5zlrz21fusel0u7gm', '2020-10-22 20:00:45', '2020-10-22 21:00:45');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'abo', 'abo', '管理员', '2020-10-22 19:20:31');

-- ----------------------------
-- Table structure for `yuangong`
-- ----------------------------
DROP TABLE IF EXISTS `yuangong`;
CREATE TABLE `yuangong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `gonghao` varchar(200) NOT NULL COMMENT '工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `quyu` varchar(200) DEFAULT NULL COMMENT '区域',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gonghao` (`gonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1603367982390 DEFAULT CHARSET=utf8 COMMENT='员工';

-- ----------------------------
-- Records of yuangong
-- ----------------------------
INSERT INTO `yuangong` VALUES ('1', '2020-10-22 19:20:31', '1', '1', '李民', '男', 'A区', '园林组织部', 'http://localhost:8080/ssmFjs0R/upload/1603366283576.png', '440300199101010001', '15214121412', '001');
INSERT INTO `yuangong` VALUES ('2', '2020-10-22 19:20:31', '2', '2', '李燕', '女', 'B区', '园林艺术部', 'http://localhost:8080/ssmFjs0R/upload/1603366358844.png', '440300199202020002', '15289819992', '002');
INSERT INTO `yuangong` VALUES ('3', '2020-10-22 19:20:31', '3', '3', '王林', '男', 'A区', '园林策划部', 'http://localhost:8080/ssmFjs0R/upload/1603366402771.png', '440300199303030003', '15289819993', '001');
INSERT INTO `yuangong` VALUES ('1603367982389', '2020-10-22 19:59:42', '4', '4', '刘倩', '女', 'C区', '园林修剪部', 'http://localhost:8080/ssmFjs0R/upload/1603367966285.png', '441214121412121411', '15214121412', '003');

-- ----------------------------
-- Table structure for `yuanlinbaogao`
-- ----------------------------
DROP TABLE IF EXISTS `yuanlinbaogao`;
CREATE TABLE `yuanlinbaogao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `quyu` varchar(200) DEFAULT NULL COMMENT '区域',
  `baogaoneirong` longtext COMMENT '报告内容',
  `gaishanyijian` longtext COMMENT '改善意见',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1603368271491 DEFAULT CHARSET=utf8 COMMENT='园林报告';

-- ----------------------------
-- Records of yuanlinbaogao
-- ----------------------------
INSERT INTO `yuanlinbaogao` VALUES ('1', '2020-10-22 19:20:31', '标题1', '区域1', '报告内容1', '改善意见1', '2020-10-22', '工号1', '姓名1', '否', '');
INSERT INTO `yuanlinbaogao` VALUES ('2', '2020-10-22 19:20:31', '标题2', '区域2', '报告内容2', '改善意见2', '2020-10-22', '工号2', '姓名2', '否', '');
INSERT INTO `yuanlinbaogao` VALUES ('3', '2020-10-22 19:20:31', '标题3', '区域3', '报告内容3', '改善意见3', '2020-10-22', '工号3', '姓名3', '否', '');
INSERT INTO `yuanlinbaogao` VALUES ('1603366571019', '2020-10-22 19:36:11', '121', 'B区', '1121', '12', '2020-10-02', '2', '姓名2', '是', '完成');
INSERT INTO `yuanlinbaogao` VALUES ('1603368271490', '2020-10-22 20:04:30', '百合花任务', 'C区', '对花儿一切照料都已经完成，花儿都开的很好', '发现有一篇花儿有点干枯的现象，建议多加点水', '2020-10-01', '4', '刘倩', '是', '已经完成');

-- ----------------------------
-- Table structure for `yuanlinrenwu`
-- ----------------------------
DROP TABLE IF EXISTS `yuanlinrenwu`;
CREATE TABLE `yuanlinrenwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `quyu` varchar(200) DEFAULT NULL COMMENT '区域',
  `wanchengqingkuang` longtext COMMENT '完成情况',
  `shifouwancheng` varchar(200) DEFAULT NULL COMMENT '是否完成',
  `wanchengshijian` datetime DEFAULT NULL COMMENT '完成时间',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1603368215854 DEFAULT CHARSET=utf8 COMMENT='园林任务';

-- ----------------------------
-- Records of yuanlinrenwu
-- ----------------------------
INSERT INTO `yuanlinrenwu` VALUES ('1', '2020-10-22 19:20:31', '标题1', '账号1', '区域1', '完成情况1', '是', '2020-10-22 19:20:31', '工号1', '姓名1', '否', '');
INSERT INTO `yuanlinrenwu` VALUES ('2', '2020-10-22 19:20:31', '标题2', '账号2', '区域2', '完成情况2', '是', '2020-10-22 19:20:31', '工号2', '姓名2', '否', '');
INSERT INTO `yuanlinrenwu` VALUES ('3', '2020-10-22 19:20:31', '标题3', '账号3', '区域3', '完成情况3', '是', '2020-10-22 19:20:31', '工号3', '姓名3', '否', '');
INSERT INTO `yuanlinrenwu` VALUES ('1603366558134', '2020-10-22 19:35:57', '12', '002', 'B区', '12121', '是', '2020-10-01 00:01:00', '2', '姓名2', '是', '1121');
INSERT INTO `yuanlinrenwu` VALUES ('1603368215853', '2020-10-22 20:03:35', '今日任务', '003', 'C区', '已经百合花进行修剪浇水施肥', '是', '2020-10-01 04:02:00', '4', '刘倩', '是', '已经完成');

-- ----------------------------
-- Table structure for `zhibeixinxi`
-- ----------------------------
DROP TABLE IF EXISTS `zhibeixinxi`;
CREATE TABLE `zhibeixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `quyu` varchar(200) DEFAULT NULL COMMENT '区域',
  `wendu` varchar(200) DEFAULT NULL COMMENT '温度',
  `shidu` varchar(200) DEFAULT NULL COMMENT '湿度',
  `gongzuoqingkuang` longtext COMMENT '工作情况',
  `bianhuaqingkuang` longtext COMMENT '变化情况',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1603368180097 DEFAULT CHARSET=utf8 COMMENT='植被信息';

-- ----------------------------
-- Records of zhibeixinxi
-- ----------------------------
INSERT INTO `zhibeixinxi` VALUES ('1', '2020-10-22 19:20:31', '百合', 'http://localhost:8080/ssmFjs0R/upload/1603367373153.jpg', 'A区', '35', '25', '给花浇水施肥，一切正常', '<p>昨天开始到今天就开始打花了</p>', '2020-10-01', '1', '李民');
INSERT INTO `zhibeixinxi` VALUES ('2', '2020-10-22 19:20:31', '白桦', 'http://localhost:8080/ssmFjs0R/upload/1603367460709.jpg', 'B区', '30', '26', '12', '<p>12</p>', '2020-10-01', '2', '李燕子');
INSERT INTO `zhibeixinxi` VALUES ('3', '2020-10-22 19:20:31', '长春花', 'http://localhost:8080/ssmFjs0R/upload/1603368551563.jpg', 'A区', '26', '25', '121', '<p>121</p>', '2020-10-01', '1', '李民');
INSERT INTO `zhibeixinxi` VALUES ('1603368180096', '2020-10-22 20:03:00', '映山红', 'http://localhost:8080/ssmFjs0R/upload/1603368114688.jpg', 'C区', '32', '25', '已经对银山红进行浇水修剪', '<p>昨天花儿还很鲜艳，今天又点枯萎了</p>', '2020-10-01', '4', '刘倩');
