DROP DATABASE IF EXISTS ssmFjs0R;

CREATE DATABASE ssmFjs0R default character set utf8mb4 collate utf8mb4_general_ci;

USE ssmFjs0R;

DROP TABLE IF EXISTS `yuangong`;

CREATE TABLE `yuangong` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`gonghao` varchar(200) NOT NULL UNIQUE   COMMENT '工号',
	`mima` varchar(200) NOT NULL   COMMENT '密码',
	`xingming` varchar(200)    COMMENT '姓名',
	`xingbie` varchar(200)    COMMENT '性别',
	`quyu` varchar(200)    COMMENT '区域',
	`bumen` varchar(200)    COMMENT '部门',
	`touxiang` varchar(200)    COMMENT '头像',
	`shenfenzheng` varchar(200)    COMMENT '身份证',
	`dianhua` varchar(200)    COMMENT '电话',
	`zhanghao` varchar(200)    COMMENT '账号',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工';

INSERT INTO yuangong(gonghao,mima,xingming,xingbie,quyu,bumen,touxiang,shenfenzheng,dianhua,zhanghao) VALUES('员工1','123456','姓名1','男','区域1','部门1','yuangong_touxiang1','440300199101010001','020-89819991','账号1');
INSERT INTO yuangong(gonghao,mima,xingming,xingbie,quyu,bumen,touxiang,shenfenzheng,dianhua,zhanghao) VALUES('员工2','123456','姓名2','男','区域2','部门2','yuangong_touxiang2','440300199202020002','020-89819992','账号2');
INSERT INTO yuangong(gonghao,mima,xingming,xingbie,quyu,bumen,touxiang,shenfenzheng,dianhua,zhanghao) VALUES('员工3','123456','姓名3','男','区域3','部门3','yuangong_touxiang3','440300199303030003','020-89819993','账号3');


DROP TABLE IF EXISTS `quyuguanlirenyuan`;

CREATE TABLE `quyuguanlirenyuan` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`zhanghao` varchar(200) NOT NULL UNIQUE   COMMENT '账号',
	`mima` varchar(200) NOT NULL   COMMENT '密码',
	`xingming` varchar(200)    COMMENT '姓名',
	`xingbie` varchar(200)    COMMENT '性别',
	`bumen` varchar(200)    COMMENT '部门',
	`fuzequyu` varchar(200)    COMMENT '负责区域',
	`touxiang` varchar(200)    COMMENT '头像',
	`shenfenzheng` varchar(200)    COMMENT '身份证',
	`shouji` varchar(200)    COMMENT '手机',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='区域管理人员';

INSERT INTO quyuguanlirenyuan(zhanghao,mima,xingming,xingbie,bumen,fuzequyu,touxiang,shenfenzheng,shouji) VALUES('区域管理人员1','123456','姓名1','男','部门1','负责区域1','quyuguanlirenyuan_touxiang1','440300199101010001','020-89819991');
INSERT INTO quyuguanlirenyuan(zhanghao,mima,xingming,xingbie,bumen,fuzequyu,touxiang,shenfenzheng,shouji) VALUES('区域管理人员2','123456','姓名2','男','部门2','负责区域2','quyuguanlirenyuan_touxiang2','440300199202020002','020-89819992');
INSERT INTO quyuguanlirenyuan(zhanghao,mima,xingming,xingbie,bumen,fuzequyu,touxiang,shenfenzheng,shouji) VALUES('区域管理人员3','123456','姓名3','男','部门3','负责区域3','quyuguanlirenyuan_touxiang3','440300199303030003','020-89819993');


DROP TABLE IF EXISTS `bumenxinxi`;

CREATE TABLE `bumenxinxi` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`bumen` varchar(200) NOT NULL   COMMENT '部门',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门信息';

INSERT INTO bumenxinxi(bumen) VALUES('部门1');
INSERT INTO bumenxinxi(bumen) VALUES('部门2');
INSERT INTO bumenxinxi(bumen) VALUES('部门3');


DROP TABLE IF EXISTS `zhibeixinxi`;

CREATE TABLE `zhibeixinxi` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`mingcheng` varchar(200) NOT NULL   COMMENT '名称',
	`tupian` varchar(200)    COMMENT '图片',
	`quyu` varchar(200)    COMMENT '区域',
	`wendu` varchar(200)    COMMENT '温度',
	`shidu` varchar(200)    COMMENT '湿度',
	`gongzuoqingkuang` longtext    COMMENT '工作情况',
	`bianhuaqingkuang` longtext    COMMENT '变化情况',
	`dengjiriqi` date    COMMENT '登记日期',
	`gonghao` varchar(200)    COMMENT '工号',
	`xingming` varchar(200)    COMMENT '姓名',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='植被信息';

INSERT INTO zhibeixinxi(mingcheng,tupian,quyu,wendu,shidu,gongzuoqingkuang,bianhuaqingkuang,dengjiriqi,gonghao,xingming) VALUES('名称1','zhibeixinxi_tupian1','区域1','温度1','湿度1','工作情况1','变化情况1',CURRENT_TIMESTAMP,'工号1','姓名1');
INSERT INTO zhibeixinxi(mingcheng,tupian,quyu,wendu,shidu,gongzuoqingkuang,bianhuaqingkuang,dengjiriqi,gonghao,xingming) VALUES('名称2','zhibeixinxi_tupian2','区域2','温度2','湿度2','工作情况2','变化情况2',CURRENT_TIMESTAMP,'工号2','姓名2');
INSERT INTO zhibeixinxi(mingcheng,tupian,quyu,wendu,shidu,gongzuoqingkuang,bianhuaqingkuang,dengjiriqi,gonghao,xingming) VALUES('名称3','zhibeixinxi_tupian3','区域3','温度3','湿度3','工作情况3','变化情况3',CURRENT_TIMESTAMP,'工号3','姓名3');


DROP TABLE IF EXISTS `yuanlinrenwu`;

CREATE TABLE `yuanlinrenwu` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`biaoti` varchar(200) NOT NULL   COMMENT '标题',
	`zhanghao` varchar(200)    COMMENT '账号',
	`quyu` varchar(200)    COMMENT '区域',
	`wanchengqingkuang` longtext    COMMENT '完成情况',
	`shifouwancheng` varchar(200)    COMMENT '是否完成',
	`wanchengshijian` datetime    COMMENT '完成时间',
	`gonghao` varchar(200)    COMMENT '工号',
	`xingming` varchar(200)    COMMENT '姓名',
	`sfsh` varchar(200)   default '否' COMMENT '是否审核',
	`shhf` longtext    COMMENT '审核回复',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='园林任务';

INSERT INTO yuanlinrenwu(biaoti,zhanghao,quyu,wanchengqingkuang,shifouwancheng,wanchengshijian,gonghao,xingming,sfsh,shhf) VALUES('标题1','账号1','区域1','完成情况1','是',CURRENT_TIMESTAMP,'工号1','姓名1','否','');
INSERT INTO yuanlinrenwu(biaoti,zhanghao,quyu,wanchengqingkuang,shifouwancheng,wanchengshijian,gonghao,xingming,sfsh,shhf) VALUES('标题2','账号2','区域2','完成情况2','是',CURRENT_TIMESTAMP,'工号2','姓名2','否','');
INSERT INTO yuanlinrenwu(biaoti,zhanghao,quyu,wanchengqingkuang,shifouwancheng,wanchengshijian,gonghao,xingming,sfsh,shhf) VALUES('标题3','账号3','区域3','完成情况3','是',CURRENT_TIMESTAMP,'工号3','姓名3','否','');


DROP TABLE IF EXISTS `yuanlinbaogao`;

CREATE TABLE `yuanlinbaogao` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`biaoti` varchar(200) NOT NULL   COMMENT '标题',
	`quyu` varchar(200)    COMMENT '区域',
	`baogaoneirong` longtext    COMMENT '报告内容',
	`gaishanyijian` longtext    COMMENT '改善意见',
	`riqi` date    COMMENT '日期',
	`gonghao` varchar(200)    COMMENT '工号',
	`xingming` varchar(200)    COMMENT '姓名',
	`sfsh` varchar(200)   default '否' COMMENT '是否审核',
	`shhf` longtext    COMMENT '审核回复',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='园林报告';

INSERT INTO yuanlinbaogao(biaoti,quyu,baogaoneirong,gaishanyijian,riqi,gonghao,xingming,sfsh,shhf) VALUES('标题1','区域1','报告内容1','改善意见1',CURRENT_TIMESTAMP,'工号1','姓名1','否','');
INSERT INTO yuanlinbaogao(biaoti,quyu,baogaoneirong,gaishanyijian,riqi,gonghao,xingming,sfsh,shhf) VALUES('标题2','区域2','报告内容2','改善意见2',CURRENT_TIMESTAMP,'工号2','姓名2','否','');
INSERT INTO yuanlinbaogao(biaoti,quyu,baogaoneirong,gaishanyijian,riqi,gonghao,xingming,sfsh,shhf) VALUES('标题3','区域3','报告内容3','改善意见3',CURRENT_TIMESTAMP,'工号3','姓名3','否','');


DROP TABLE IF EXISTS `renwufabu`;

CREATE TABLE `renwufabu` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`biaoti` varchar(200) NOT NULL   COMMENT '标题',
	`gonghao` varchar(200)    COMMENT '工号',
	`xingming` varchar(200)    COMMENT '姓名',
	`quyu` varchar(200)    COMMENT '区域',
	`gongzuoyaoqiu` longtext    COMMENT '工作要求',
	`renwuriqi` date    COMMENT '任务日期',
	`zhanghao` varchar(200)    COMMENT '账号',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='任务发布';

INSERT INTO renwufabu(biaoti,gonghao,xingming,quyu,gongzuoyaoqiu,renwuriqi,zhanghao) VALUES('标题1','工号1','姓名1','区域1','工作要求1',CURRENT_TIMESTAMP,'账号1');
INSERT INTO renwufabu(biaoti,gonghao,xingming,quyu,gongzuoyaoqiu,renwuriqi,zhanghao) VALUES('标题2','工号2','姓名2','区域2','工作要求2',CURRENT_TIMESTAMP,'账号2');
INSERT INTO renwufabu(biaoti,gonghao,xingming,quyu,gongzuoyaoqiu,renwuriqi,zhanghao) VALUES('标题3','工号3','姓名3','区域3','工作要求3',CURRENT_TIMESTAMP,'账号3');



DROP TABLE IF EXISTS `config`;

CREATE TABLE `config`(
	`id` bigint NOT NULL AUTO_INCREMENT,
	`name` varchar(100) NOT NULL COMMENT '配置参数名称',
	`value` varchar(100) COMMENT '配置参数值',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配置文件';

insert into config(id,name) values(1,'picture1');
insert into config(id,name) values(2,'picture2');
insert into config(id,name) values(3,'picture3');
insert into config(id,name) values(4,'picture4');
insert into config(id,name) values(5,'picture5');
insert into config(id,name) values(6,'homepage');


DROP TABLE IF EXISTS `users`;

CREATE TABLE `users`(
	`id` bigint NOT NULL AUTO_INCREMENT,
	`username` varchar(100) NOT NULL COMMENT '用户名',
	`password` varchar(100) NOT NULL COMMENT '密码',
	`role` varchar(100) default '管理员' COMMENT '角色',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '新增时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

insert into users(id,username, password) values(1,'abo','abo');

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token`(
	`id` bigint NOT NULL AUTO_INCREMENT,
	`userid` bigint NOT NULL COMMENT '用户id',
	`username` varchar(100) NOT NULL COMMENT '用户名',
	`tablename` varchar(100) COMMENT '表名',
	`role` varchar(100) COMMENT '角色',
	`token` varchar(200) NOT NULL COMMENT '密码',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '新增时间',
	`expiratedtime` timestamp COMMENT '过期时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';

