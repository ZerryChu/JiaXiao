/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50624
 Source Host           : localhost
 Source Database       : jiaxiao

 Target Server Type    : MySQL
 Target Server Version : 50624
 File Encoding         : utf-8

 Date: 04/24/2016 11:01:57 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `admin_inf`
-- ----------------------------
DROP TABLE IF EXISTS `admin_inf`;
CREATE TABLE `admin_inf` (
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `admin_inf`
-- ----------------------------
BEGIN;
INSERT INTO `admin_inf` VALUES ('zerry', '486584b6be3fea55fcca034fb485f693e142'), ('lucy', '1111');
COMMIT;

-- ----------------------------
--  Table structure for `car_inf`
-- ----------------------------
DROP TABLE IF EXISTS `car_inf`;
CREATE TABLE `car_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `car_number` varchar(255) DEFAULT NULL,
  `car_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `car_inf`
-- ----------------------------
BEGIN;
INSERT INTO `car_inf` VALUES ('1', '粤A 19999', '皇冠'), ('2', '黑A 12222', '奥迪A4'), ('3', '黑A 1333B', '马自达3');
COMMIT;

-- ----------------------------
--  Table structure for `coach_inf`
-- ----------------------------
DROP TABLE IF EXISTS `coach_inf`;
CREATE TABLE `coach_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `coach_inf`
-- ----------------------------
BEGIN;
INSERT INTO `coach_inf` VALUES ('1', '张大大', '1'), ('2', '李大大', '2'), ('3', '林大大', '3');
COMMIT;

-- ----------------------------
--  Table structure for `exception_log_inf`
-- ----------------------------
DROP TABLE IF EXISTS `exception_log_inf`;
CREATE TABLE `exception_log_inf` (
  `exception` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `method_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `exception_log_inf`
-- ----------------------------
BEGIN;
INSERT INTO `exception_log_inf` VALUES ('java.lang.NullPointerException', '2016-04-16 18:14:30', 'login'), ('java.lang.NullPointerException', '2016-04-18 00:04:50', 'showInfoByStuId'), ('java.lang.NullPointerException', '2016-04-18 00:04:53', 'showInfoByStuId'), ('java.lang.NullPointerException', '2016-04-18 00:08:22', 'showInfoByStuId'), ('java.lang.IndexOutOfBoundsException: Index: 1, Size: 1', '2016-04-18 00:08:53', 'showInfoByStuId'), ('java.lang.NullPointerException', '2016-04-18 00:10:05', 'showInfoByStuId'), ('java.lang.IndexOutOfBoundsException: Index: 0, Size: 0', '2016-04-18 00:17:08', 'showInfoByStuId'), ('java.lang.IndexOutOfBoundsException: Index: 0, Size: 0', '2016-04-18 00:19:58', 'showInfoByStuId'), ('java.lang.IndexOutOfBoundsException: Index: 0, Size: 0', '2016-04-18 00:20:47', 'showInfoByStuId'), ('javax.servlet.ServletException: java.lang.StackOverflowError', '2016-04-18 01:18:36', 'showTest'), ('org.apache.jasper.JasperException: javax.servlet.ServletException: java.lang.StackOverflowError', '2016-04-18 01:19:07', 'showTest'), ('ognl.MethodFailedException: Method \"showTest\" failed for object group.zerry.jiaxiao.action.OrderTestAction@1ae4f30b [java.lang.Error: Unresolved compilation problem: \n	The method getState_id() is undefined for the type Student\n]', '2016-04-18 11:46:24', 'showTest'), ('ognl.MethodFailedException: Method \"showTest\" failed for object group.zerry.jiaxiao.action.OrderTestAction@779f48cc [java.lang.Error: Unresolved compilation problem: \n	The method getState_id() is undefined for the type Student\n]', '2016-04-18 11:50:46', 'showTest'), ('ognl.MethodFailedException: Method \"showTest\" failed for object group.zerry.jiaxiao.action.OrderTestAction@5d4a26eb [java.lang.Error: Unresolved compilation problem: \n	The method getState_id() is undefined for the type Student\n]', '2016-04-18 11:54:00', 'showTest'), ('ognl.MethodFailedException: Method \"showTest\" failed for object group.zerry.jiaxiao.action.OrderTestAction@2af75a9f [java.lang.Error: Unresolved compilation problem: \n	The method getState_id() is undefined for the type Student\n]', '2016-04-18 13:16:03', 'showTest'), ('ognl.MethodFailedException: Method \"showTest\" failed for object group.zerry.jiaxiao.action.OrderTestAction@2992a8b0 [java.lang.Error: Unresolved compilation problem: \n	The method getState_id() is undefined for the type Student\n]', '2016-04-18 13:17:45', 'showTest'), ('ognl.MethodFailedException: Method \"showTest\" failed for object group.zerry.jiaxiao.action.OrderTestAction@2edaae55 [java.lang.Error: Unresolved compilation problem: \n	The method getState_id() is undefined for the type Student\n]', '2016-04-18 13:19:05', 'showTest'), ('ognl.MethodFailedException: Method \"showStudentById\" failed for object group.zerry.jiaxiao.action.StudentAction@28084da5 [java.lang.Error: Unresolved compilation problem: \n	The method getState_id() is undefined for the type Student\n]', '2016-04-18 13:19:22', 'showStudentById'), ('java.lang.NullPointerException', '2016-04-18 13:29:05', 'showTest'), ('java.lang.NullPointerException', '2016-04-18 13:52:08', 'showTest'), ('java.lang.NullPointerException', '2016-04-18 14:06:17', 'showTest'), ('java.lang.NullPointerException', '2016-04-18 15:50:27', 'login'), ('java.lang.NullPointerException', '2016-04-18 20:59:59', 'login'), ('java.lang.NullPointerException', '2016-04-18 21:00:00', 'login'), ('No result defined for action group.zerry.jiaxiao.action.OrderCarAction and result delete_success - action - file:/Users/zhuzirui/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/jiaxiao/WEB-INF/classes/struts.xml:60:17', '2016-04-20 01:03:53', 'deleteOrder'), (null, '2016-04-21 21:14:29', 'login');
COMMIT;

-- ----------------------------
--  Table structure for `msg_inf`
-- ----------------------------
DROP TABLE IF EXISTS `msg_inf`;
CREATE TABLE `msg_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) NOT NULL,
  `msg` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `solved` int(11) DEFAULT NULL,
  `reply` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `msg_inf`
-- ----------------------------
BEGIN;
INSERT INTO `msg_inf` VALUES ('1', '1', '谢谢驾校，很棒！', '2016-04-22 12:29:15', '1', '谢谢您'), ('2', '2', '谢谢驾校，很棒！', '2016-04-29 21:51:02', '1', '谢谢您的支持！'), ('3', '3', '谢谢驾校，很棒！', '2016-04-22 21:51:18', '0', ''), ('4', '4', '管理还有待提升，另外，希望能提高某些教练的素质！', '2016-04-23 22:33:52', '0', ''), ('5', '1', 'dsdad', '2016-04-23 22:43:31', '0', '');
COMMIT;

-- ----------------------------
--  Table structure for `order_car_inf`
-- ----------------------------
DROP TABLE IF EXISTS `order_car_inf`;
CREATE TABLE `order_car_inf` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) NOT NULL,
  `car_id` int(11) NOT NULL,
  `coach_id` int(11) NOT NULL,
  `start_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `order_car_inf`
-- ----------------------------
BEGIN;
INSERT INTO `order_car_inf` VALUES ('2', '2', '1', '1', '2015-03-05'), ('3', '2', '2', '1', '2016-05-29'), ('6', '8', '2', '3', '2015-03-05'), ('9', '1', '1', '2', '2016-03-30'), ('10', '1', '2', '1', '2016-03-30');
COMMIT;

-- ----------------------------
--  Table structure for `order_test_inf`
-- ----------------------------
DROP TABLE IF EXISTS `order_test_inf`;
CREATE TABLE `order_test_inf` (
  `stu_id` int(11) NOT NULL,
  `test_id` int(11) NOT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `order_test_inf`
-- ----------------------------
BEGIN;
INSERT INTO `order_test_inf` VALUES ('1', '1', '70');
COMMIT;

-- ----------------------------
--  Table structure for `stu_inf`
-- ----------------------------
DROP TABLE IF EXISTS `stu_inf`;
CREATE TABLE `stu_inf` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `stu_inf`
-- ----------------------------
BEGIN;
INSERT INTO `stu_inf` VALUES ('1', '刘强', '2016-03-10 18:13:30', null, '科目2'), ('2', '李四', '2016-03-29 21:20:07', null, '科目1'), ('3', '黄子怡', '2016-04-18 15:56:00', null, '科目1'), ('4', '佟瑶', '2016-04-23 22:37:08', null, '科目1'), ('6', '王磊', '2016-04-16 10:10:02', null, '科目1'), ('8', '刘刘', '2016-04-15 11:09:22', null, '科目1');
COMMIT;

-- ----------------------------
--  Table structure for `test_inf`
-- ----------------------------
DROP TABLE IF EXISTS `test_inf`;
CREATE TABLE `test_inf` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `state` varchar(255) DEFAULT NULL,
  `start_time` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `test_inf`
-- ----------------------------
BEGIN;
INSERT INTO `test_inf` VALUES ('1', '科目1', '2016-05-29'), ('2', '科目2', '2016-05-31'), ('3', '科目3', '2016-04-05'), ('4', '科目4', '2016-04-22'), ('5', '科目1', '2016-04-21'), ('6', '科目1', '2016-04-05');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
