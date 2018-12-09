/*
 Navicat Premium Data Transfer

 Source Server         : test_root
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : cateyes

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 09/12/2018 21:59:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for movie
-- ----------------------------
DROP TABLE IF EXISTS `movie`;
CREATE TABLE `movie`  (
  `id` int(11) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT COMMENT ' key',
  `movieName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '电影名',
  `hallName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '电影院名字',
  `movieTime` datetime(6) DEFAULT NULL COMMENT '电影时间',
  `movieMessage` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '电影介绍',
  `moviePrice` decimal(10, 2) DEFAULT NULL COMMENT '电影单价',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of movie
-- ----------------------------
INSERT INTO `movie` VALUES (00000000001, '出远门儿', '放映厅1', '2018-12-05 20:52:25.000000', '123', 40.00);
INSERT INTO `movie` VALUES (00000000002, '进击吧铲屎官', '放映厅2', '2018-12-04 21:18:55.000000', '321', 25.00);
INSERT INTO `movie` VALUES (00000000003, '出发吧铲屎官', '放映厅1', '2018-12-05 21:19:18.000000', '789132', 50.00);
INSERT INTO `movie` VALUES (00000000004, '出远门儿2', 'IMAX', '2018-12-06 21:19:58.000000', '789', 50.00);
INSERT INTO `movie` VALUES (00000000005, '进击吧铲屎官', '放映厅1', '2018-12-02 21:20:21.000000', '321', 25.00);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int(11) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT COMMENT 'key',
  `movieId` int(2) UNSIGNED ZEROFILL DEFAULT NULL COMMENT '电影ID',
  `userId` int(2) UNSIGNED ZEROFILL DEFAULT NULL COMMENT '用户ID',
  `line` int(2) UNSIGNED DEFAULT NULL COMMENT '座位列',
  `rows` int(2) UNSIGNED DEFAULT NULL COMMENT '座位行',
  `price` decimal(10, 2) UNSIGNED DEFAULT NULL COMMENT '价格',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (00000000002, 01, 01, 2, 2, 50.00, '待取票');
INSERT INTO `orders` VALUES (00000000003, 02, 02, 2, 2, 30.00, '已出票');
INSERT INTO `orders` VALUES (00000000004, 01, 02, 3, 4, 50.00, '123');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT COMMENT 'key',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (00000000001, 'moye@jiugui.com', '123456');
INSERT INTO `user` VALUES (00000000002, 'jiugui@jiugui.com', '123456');
INSERT INTO `user` VALUES (00000000003, 'sijia@jiugui.com', '123456');
INSERT INTO `user` VALUES (00000000004, 'dading@jiugui.com', '123456');
INSERT INTO `user` VALUES (00000000005, 'xiaoding@jiugui.com', '123456');
INSERT INTO `user` VALUES (00000000006, 'gucci@baicaiwang.com', '321654');
INSERT INTO `user` VALUES (00000000007, 'lucky@leohome.com', '111111');
INSERT INTO `user` VALUES (00000000012, 'nemo@leohome.com', '654321');

-- ----------------------------
-- Table structure for usermessage
-- ----------------------------
DROP TABLE IF EXISTS `usermessage`;
CREATE TABLE `usermessage`  (
  `id` int(11) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT COMMENT 'key',
  `userid` int(11) UNSIGNED ZEROFILL NOT NULL COMMENT '用户ID',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '姓名',
  `age` int(2) UNSIGNED ZEROFILL DEFAULT NULL COMMENT '年龄',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '性别',
  `phonenum` int(50) UNSIGNED DEFAULT NULL COMMENT '电话号码',
  PRIMARY KEY (`id`, `userid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of usermessage
-- ----------------------------
INSERT INTO `usermessage` VALUES (00000000001, 00000000001, '墨爷', 06, '女', 123654);
INSERT INTO `usermessage` VALUES (00000000002, 00000000002, '酒鬼', 04, '男', 987654322);
INSERT INTO `usermessage` VALUES (00000000003, 00000000003, '撕家', 03, '女', 987654323);
INSERT INTO `usermessage` VALUES (00000000004, 00000000004, '大腚', 02, '男', 987654324);
INSERT INTO `usermessage` VALUES (00000000005, 00000000006, 'gucci', 05, '女', 987654326);
INSERT INTO `usermessage` VALUES (00000000010, 00000000012, 'NEMO', 02, '女', 321654);

SET FOREIGN_KEY_CHECKS = 1;
