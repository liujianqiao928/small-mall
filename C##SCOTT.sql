/*
 Navicat Premium Data Transfer

 Source Server         : mall
 Source Server Type    : Oracle
 Source Server Version : 120100
 Source Host           : localhost:1521
 Source Schema         : C##SCOTT

 Target Server Type    : Oracle
 Target Server Version : 120100
 File Encoding         : 65001

 Date: 06/01/2022 13:54:29
*/


-- ----------------------------
-- Table structure for A
-- ----------------------------
DROP TABLE "C##SCOTT"."A";
CREATE TABLE "C##SCOTT"."A" (
  "id" NUMBER VISIBLE NOT NULL
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of A
-- ----------------------------

-- ----------------------------
-- Table structure for AUSER
-- ----------------------------
DROP TABLE "C##SCOTT"."AUSER";
CREATE TABLE "C##SCOTT"."AUSER" (
  "ID" NVARCHAR2(255) VISIBLE NOT NULL,
  "ANAME" VARCHAR2(255 BYTE) VISIBLE,
  "AEMAIL" VARCHAR2(255 BYTE) VISIBLE,
  "APASSWORD" VARCHAR2(255 BYTE) VISIBLE,
  "APHONE" NUMBER(11,0) VISIBLE,
  "AIDCARD" VARCHAR2(18 BYTE) VISIBLE,
  "AGSZZ" VARCHAR2(50 BYTE) VISIBLE,
  "ALOGO" VARCHAR2(255 BYTE) VISIBLE,
  "ASTATUS" NVARCHAR2(1) VISIBLE,
  "AMONEY" VARCHAR2(50 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of AUSER
-- ----------------------------
INSERT INTO "C##SCOTT"."AUSER" VALUES ('1', '小U商城', '2055281269@qq.com', 'admin', '18943912549', '220281200000001400', 'T25552222', NULL, '1', '255.0');

-- ----------------------------
-- Table structure for CPFL
-- ----------------------------
DROP TABLE "C##SCOTT"."CPFL";
CREATE TABLE "C##SCOTT"."CPFL" (
  "CPID" VARCHAR2(255 BYTE) VISIBLE NOT NULL,
  "CPNAME" VARCHAR2(255 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of CPFL
-- ----------------------------

-- ----------------------------
-- Table structure for LIKESHOP
-- ----------------------------
DROP TABLE "C##SCOTT"."LIKESHOP";
CREATE TABLE "C##SCOTT"."LIKESHOP" (
  "ID" NVARCHAR2(255) VISIBLE NOT NULL,
  "TITLE" VARCHAR2(255 BYTE) VISIBLE,
  "LOGO" VARCHAR2(255 BYTE) VISIBLE,
  "ISZIYING" NUMBER(1,0) VISIBLE,
  "PRICE" NVARCHAR2(50) VISIBLE,
  "ISBUTIE" NUMBER(1,0) VISIBLE,
  "JUAN" VARCHAR2(255 BYTE) VISIBLE,
  "BUTIETEXT" VARCHAR2(255 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of LIKESHOP
-- ----------------------------
INSERT INTO "C##SCOTT"."LIKESHOP" VALUES ('1', ' 美的(Midea)豆浆机DJ12B-Easy101 早安豆浆快速制浆立体环绕', 'images/like1.jpg', '1', '109', '1', '领券39-3', '每300-30');
INSERT INTO "C##SCOTT"."LIKESHOP" VALUES ('2', '【不好吃包退整切牛排系列】暖男厨房 澳洲进口原肉整切牛排套餐眼肉上脑牛扒厚切儿童牛排组合1300g（送牛筋丸）', 'images/like5.jpg', '1', '199', '0', '领券39-3', NULL);
INSERT INTO "C##SCOTT"."LIKESHOP" VALUES ('33', '美的(Midea)电压力锅', 'images/like2.jpg', '0', '399', '0', NULL, NULL);
INSERT INTO "C##SCOTT"."LIKESHOP" VALUES ('4', '      【干皮救星】CLINIQUE 倩碧 保湿润肤乳 黄油 无油款 乳液 125ml/瓶 保持弹力', 'images/like3.jpg', NULL, '179', NULL, '领券39-3', NULL);
INSERT INTO "C##SCOTT"."LIKESHOP" VALUES ('5', '      【干皮救星】CLINIQUE 倩碧 保湿润肤乳 黄油 无油款 乳液 125ml/瓶 保持弹力', 'images/like3.jpg', NULL, '179', NULL, '领券39-3', NULL);
INSERT INTO "C##SCOTT"."LIKESHOP" VALUES ('6', '      【干皮救星】CLINIQUE 倩碧 保湿润肤乳 黄油 无油款 乳液 125ml/瓶 保持弹力', 'images/like3.jpg', NULL, '179', NULL, '领券39-3', NULL);

-- ----------------------------
-- Table structure for ONE
-- ----------------------------
DROP TABLE "C##SCOTT"."ONE";
CREATE TABLE "C##SCOTT"."ONE" (
  "OID" VARCHAR2(255 BYTE) VISIBLE NOT NULL,
  "ONAME" VARCHAR2(255 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of ONE
-- ----------------------------
INSERT INTO "C##SCOTT"."ONE" VALUES ('1', '电器');
INSERT INTO "C##SCOTT"."ONE" VALUES ('2', '服装');
INSERT INTO "C##SCOTT"."ONE" VALUES ('3', '阅读');
INSERT INTO "C##SCOTT"."ONE" VALUES ('4', '酒类');

-- ----------------------------
-- Table structure for ORDERS
-- ----------------------------
DROP TABLE "C##SCOTT"."ORDERS";
CREATE TABLE "C##SCOTT"."ORDERS" (
  "ID" VARCHAR2(255 BYTE) VISIBLE NOT NULL,
  "ORDERID" VARCHAR2(50 BYTE) VISIBLE,
  "ORDERMONEY" VARCHAR2(50 BYTE) VISIBLE,
  "CREATE" VARCHAR2(20 BYTE) VISIBLE,
  "DOWNORDER" VARCHAR2(20 BYTE) VISIBLE,
  "SHOPID" VARCHAR2(255 BYTE) VISIBLE,
  "AUSERID" VARCHAR2(255 BYTE) VISIBLE,
  "TUSERID" VARCHAR2(255 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of ORDERS
-- ----------------------------
INSERT INTO "C##SCOTT"."ORDERS" VALUES ('353f23c9-093b-464b-bb1a-af74ad498ac1', 'T583924258', '18.8', '2022-01-01 19:10:54', '2022-01-01 19:10:54', '2', '1', '123');
INSERT INTO "C##SCOTT"."ORDERS" VALUES ('4d25b64d-e6d1-42c7-8a72-37238afc8199', 'T466466372', '199', '2022-01-02 22:26:17', '2022-01-02 22:26:17', '11', '1', '123');
INSERT INTO "C##SCOTT"."ORDERS" VALUES ('4d25b64d-e6d1-42c7-8a72-', 'T466466372', '199', '2022-01-02 22:26:17', '2022-01-02 22:26:17', '11', '1', '123');
INSERT INTO "C##SCOTT"."ORDERS" VALUES ('4762d35e-ee73-41e9-98bb-07e5c58c342f', 'T319350007', '18.8', '2022-01-05 14:57:37', '2022-01-05 14:57:37', '2', '1', '123');
INSERT INTO "C##SCOTT"."ORDERS" VALUES ('6e6421f4-06df-4527-b9cb-26526c3e50f6', 'T835589839', '9.2', '2022-01-05 18:15:36', '2022-01-05 18:15:36', '1', '1', '123');
INSERT INTO "C##SCOTT"."ORDERS" VALUES ('d38d2e90-b86b-4cbc-8fbd-96e964028e85', 'T502019265', '9.2', '2022-01-06 10:23:25', '2022-01-06 10:23:25', '1', '1', '123');

-- ----------------------------
-- Table structure for OTHERIMG
-- ----------------------------
DROP TABLE "C##SCOTT"."OTHERIMG";
CREATE TABLE "C##SCOTT"."OTHERIMG" (
  "ID" VARCHAR2(20 BYTE) VISIBLE NOT NULL,
  "IMG1" VARCHAR2(255 BYTE) VISIBLE,
  "ING2" VARCHAR2(255 BYTE) VISIBLE,
  "IMG3" VARCHAR2(255 BYTE) VISIBLE,
  "IMG4" VARCHAR2(255 BYTE) VISIBLE,
  "IMG5" VARCHAR2(255 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of OTHERIMG
-- ----------------------------

-- ----------------------------
-- Table structure for PERMTERS
-- ----------------------------
DROP TABLE "C##SCOTT"."PERMTERS";
CREATE TABLE "C##SCOTT"."PERMTERS" (
  "ID" VARCHAR2(50 BYTE) VISIBLE NOT NULL,
  "SPZL" VARCHAR2(255 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of PERMTERS
-- ----------------------------

-- ----------------------------
-- Table structure for SHOP
-- ----------------------------
DROP TABLE "C##SCOTT"."SHOP";
CREATE TABLE "C##SCOTT"."SHOP" (
  "SHOPID" VARCHAR2(255 BYTE) VISIBLE NOT NULL,
  "SHOPTITLE" VARCHAR2(255 BYTE) VISIBLE,
  "SIMPLEDESC" VARCHAR2(255 BYTE) VISIBLE,
  "SHOPKEY" VARCHAR2(255 BYTE) VISIBLE,
  "SHOPFL" VARCHAR2(255 BYTE) VISIBLE,
  "SHOPTYPE" VARCHAR2(255 BYTE) VISIBLE,
  "SHOPYPRICE" VARCHAR2(20 BYTE) VISIBLE,
  "SHOPXPRICE" VARCHAR2(20 BYTE) VISIBLE,
  "SHOPCOUNT" NUMBER(20,0) VISIBLE,
  "SHOPGG" VARCHAR2(20 BYTE) VISIBLE,
  "ISUPJIA" NUMBER(1,0) VISIBLE DEFAULT 1,
  "ISCOMM" NUMBER(1,0) VISIBLE,
  "SHOPIMG" VARCHAR2(255 BYTE) VISIBLE,
  "SHOPDESC" VARCHAR2(255 BYTE) VISIBLE,
  "ONEFL" VARCHAR2(255 BYTE) VISIBLE,
  "TWOFL" VARCHAR2(255 BYTE) VISIBLE,
  "THREEFL" VARCHAR2(255 BYTE) VISIBLE,
  "AUSERID" VARCHAR2(255 BYTE) VISIBLE,
  "SELLCOUNT" NUMBER(20,0) VISIBLE,
  "CREATE" VARCHAR2(255 BYTE) VISIBLE,
  "COMMCOUNT" VARCHAR2(255 BYTE) VISIBLE,
  "OTHERIMG" VARCHAR2(255 BYTE) VISIBLE,
  "PERTMERS" VARCHAR2(255 BYTE) VISIBLE,
  "ISZIYING" NUMBER(1,0) VISIBLE DEFAULT 0,
  "SHOPBAOZHUANG" VARCHAR2(10 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of SHOP
-- ----------------------------
INSERT INTO "C##SCOTT"."SHOP" VALUES ('1', '谷斑本色手帕纸30包3层加厚面巾纸小包装便携式餐巾纸卫生纸手纸10包*3条整箱装纸巾小包', 'hai', '天天特价', '1', '1', '29.9', '9.2', '28', '大', '1', '1', 'images/sale1.jpg', NULL, '1', '1', NULL, '1', '50', NULL, '3.3万+', NULL, NULL, '1', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('2', '蓝汰4斤装深层洁净洗衣液', NULL, '天天特价', '1', '1', '29.9', '18.8', '49', '大', '1', '1', 'images/sale2.jpg', NULL, '1', '1', NULL, '1', '50', NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('3', '灰尘去无踪', '今日特价4.5折起', '人气好货', '2', '2', '30', '11', '10', '大', '1', '1', 'images/rank-list2.jpg', NULL, '1', '2', NULL, '1', '40', NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('4', '灰尘去无踪', '今日特价4.5折起', '人气好货', '2', '2', '30', '11', '10', '大', '1', '1', 'images/rank-list2.jpg', NULL, '1', '2', NULL, '1', '40', NULL, '3.3万+', NULL, NULL, '1', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('5', '灰尘去无踪', '今日特价4.5折起', '人气好货', '2', '2', '30', '11', '10', '大', '1', '1', 'images/rank-list2.jpg', NULL, '1', '1', NULL, '1', '40', NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('6', '灰尘去无踪', '今日特价4.5折起', '人气好货', '2', '2', '30', '11', '10', '大', '1', '1', 'images/rank-list2.jpg', NULL, '1', '1', NULL, '1', '40', NULL, '3.3万+', NULL, NULL, '1', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('7', '清爽畅饮啤酒', '666人都说好', '人气好货', '2', '2', '40', '11', '10', '大', '1', '1', 'images/rank-list3.jpg', NULL, '4', '3', NULL, '1', '30', NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('8', '清爽畅饮啤酒', '666人都说好', '人气好货', '2', '2', '40', '11', '10', '大', '1', '1', 'images/rank-list3.jpg', NULL, '4', '3', NULL, '1', '30', NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('9', '清爽畅饮啤酒', '666人都说好', '人气好货', '2', '2', '40', '11', '10', '大', '1', '1', 'images/rank-list3.jpg', NULL, '4', '3', NULL, '1', '30', NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('10', '清爽畅饮啤酒', '666人都说好', '人气好货', '2', '2', '40', '11', '10', '大', '1', '1', 'images/find2.jpg', NULL, '4', '3', NULL, '1', '30', NULL, '3.3万+', NULL, NULL, '1', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('11', '小熊养身壶', NULL, '电器,九阳', '1', '6', '299', '199', '98', 'XL', '1', '1', 'images/find2.jpg', NULL, '1', '1', NULL, '1', NULL, NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('12', '切碎机', NULL, '电器,九阳', '1', '6', '299', '199', '100', 'XL', '1', '1', 'images/find2.jpg', NULL, '1', '1', NULL, '1', NULL, NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('13', '空气炸锅', NULL, '电器,九阳', '1', '6', '299', '199', '100', 'XL', '1', '1', 'images/find2.jpg', NULL, '1', '1', NULL, '1', NULL, NULL, '3.3万+', NULL, NULL, '1', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('14', '小熊养身壶', NULL, '电器,九阳', '1', '6', '299', '199', '100', 'XL', '1', '1', 'images/find2.jpg', NULL, '1', '1', NULL, '1', NULL, NULL, '3.3万+', NULL, NULL, '1', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('15', '小熊养身壶', NULL, '电器,九阳', '1', '6', '299', '199', '100', 'XL', '1', '1', 'images/find2.jpg', NULL, '1', '1', NULL, '1', NULL, NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('16', '热风', '领券199-20', '服装', NULL, '7', '523', '200', '10', 'X', '1', '1', 'images/type01.png', NULL, '2', '1', NULL, '1', NULL, NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('17', '威克多', '低至五折', '服装', NULL, '7', '523', '200', '10', 'X', '1', '1', 'images/type02.jpg', NULL, '2', '2', NULL, '1', NULL, NULL, '3.3万+', NULL, NULL, '1', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('18', '抢666元券', '分期免息再赢免单', '金融', NULL, '10', '6666', '666', '10', 'X', '1', '1', 'images/type03.png', NULL, '3', '2', NULL, '1', NULL, NULL, '3.3万+', NULL, NULL, '0', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('19', '看客图书', '更好的精神食粮', '阅读', NULL, '3', '66', '33', '10', 'X', '1', '1', 'images/type03.png', NULL, '3', '3', NULL, '1', NULL, NULL, '3.3万+', NULL, NULL, '1', NULL);
INSERT INTO "C##SCOTT"."SHOP" VALUES ('cd7c061666814a759ad9f835bdfd0ad0', 'a', 'a', 'a', '1', '3794', '111', '11', '1', 'xxx', '0', '0', 'D:\img\cd7c061666814a759ad9f835bdfd0ad0.png', 'aaa', '1', '1', '1', '1', '0', '2022-01-05 13:41:12', '999', '1', '1', '1', '盒装');

-- ----------------------------
-- Table structure for SHOPCAR
-- ----------------------------
DROP TABLE "C##SCOTT"."SHOPCAR";
CREATE TABLE "C##SCOTT"."SHOPCAR" (
  "CARID" VARCHAR2(255 BYTE) VISIBLE NOT NULL,
  "SHOPIDS" VARCHAR2(255 BYTE) VISIBLE,
  "SHOPCOUNT" NUMBER(20,0) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of SHOPCAR
-- ----------------------------
INSERT INTO "C##SCOTT"."SHOPCAR" VALUES ('2', '1', '10');
INSERT INTO "C##SCOTT"."SHOPCAR" VALUES ('1', '1,2,3,11,16', '6');

-- ----------------------------
-- Table structure for SHOPPHB
-- ----------------------------
DROP TABLE "C##SCOTT"."SHOPPHB";
CREATE TABLE "C##SCOTT"."SHOPPHB" (
  "ID" VARCHAR2(10 BYTE) VISIBLE NOT NULL,
  "PHBTITLE" VARCHAR2(255 BYTE) VISIBLE,
  "PHBIMAGE" VARCHAR2(255 BYTE) VISIBLE,
  "PHBPRICE" VARCHAR2(20 BYTE) VISIBLE,
  "PHBDESC" VARCHAR2(50 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of SHOPPHB
-- ----------------------------
INSERT INTO "C##SCOTT"."SHOPPHB" VALUES ('1', '丰凯园实业 宁夏特产中宁红枸杞子茶 特级500g罐装', 'images/rank-list1.jpg', '48', '食品销量排行NO.1');
INSERT INTO "C##SCOTT"."SHOPPHB" VALUES ('2', '丰凯园实业 宁夏特产中宁红枸杞子茶 特级500g罐装', 'images/rank-list1.jpg', '48', '食品销量排行NO.1');
INSERT INTO "C##SCOTT"."SHOPPHB" VALUES ('3', '丰凯园实业 宁夏特产中宁红枸杞子茶 特级500g罐装', 'images/rank-list1.jpg', '48', '食品销量排行NO.1');

-- ----------------------------
-- Table structure for SHOPTYPE
-- ----------------------------
DROP TABLE "C##SCOTT"."SHOPTYPE";
CREATE TABLE "C##SCOTT"."SHOPTYPE" (
  "FLID" VARCHAR2(255 BYTE) VISIBLE NOT NULL,
  "FLNAME" VARCHAR2(255 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of SHOPTYPE
-- ----------------------------
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('1', '天天特价');
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('2', '人气好货');
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('3', '红孩子');
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('4', '小U超市');
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('5', '电器城');
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('6', '生活家电');
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('7', '时尚服饰');
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('8', '小U国际');
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('9', '小UQutlets');
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('10', '金融');
INSERT INTO "C##SCOTT"."SHOPTYPE" VALUES ('3794', '1');

-- ----------------------------
-- Table structure for THREE
-- ----------------------------
DROP TABLE "C##SCOTT"."THREE";
CREATE TABLE "C##SCOTT"."THREE" (
  "TID" VARCHAR2(255 BYTE) VISIBLE NOT NULL,
  "THNAME" VARCHAR2(255 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of THREE
-- ----------------------------

-- ----------------------------
-- Table structure for TUSER
-- ----------------------------
DROP TABLE "C##SCOTT"."TUSER";
CREATE TABLE "C##SCOTT"."TUSER" (
  "ID" VARCHAR2(255 BYTE) VISIBLE NOT NULL,
  "USERNAME" VARCHAR2(255 BYTE) VISIBLE,
  "USEREMAIL" VARCHAR2(255 BYTE) VISIBLE,
  "USERPASSWORD" VARCHAR2(255 BYTE) VISIBLE,
  "USERLOGO" VARCHAR2(255 BYTE) VISIBLE,
  "ISVIP" NUMBER(1,0) VISIBLE,
  "USERCITY" VARCHAR2(255 BYTE) VISIBLE,
  "USERMONEY" NVARCHAR2(255) VISIBLE,
  "USERSTATUS" NUMBER(1,0) VISIBLE,
  "SHOPCARID" VARCHAR2(255 BYTE) VISIBLE,
  "SHOPCOUNT" NUMBER(20,0) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of TUSER
-- ----------------------------
INSERT INTO "C##SCOTT"."TUSER" VALUES ('123', '小U商城', '2055281269@qq.com', '21232f297a57a5a743894a0e4a801fc3', '1', '1', '吉林省蛟河市', '9745.0', '1', '1', '4');
INSERT INTO "C##SCOTT"."TUSER" VALUES ('d6559487-303a-4df0-9457-75098099a504', '小米', '2492112242@qq.com', 'ae9187902d0936438399c2543a6e3ed3', '暂时没有', '0', '吉林', '0', '1', NULL, '0');

-- ----------------------------
-- Table structure for TWO
-- ----------------------------
DROP TABLE "C##SCOTT"."TWO";
CREATE TABLE "C##SCOTT"."TWO" (
  "TID" VARCHAR2(255 BYTE) VISIBLE NOT NULL,
  "TWNAME" VARCHAR2(255 BYTE) VISIBLE
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of TWO
-- ----------------------------
INSERT INTO "C##SCOTT"."TWO" VALUES ('1', '九阳');
INSERT INTO "C##SCOTT"."TWO" VALUES ('2', '运动户外');
INSERT INTO "C##SCOTT"."TWO" VALUES ('3', '手机');

-- ----------------------------
-- View structure for SHOPLIKEVIEW
-- ----------------------------
CREATE OR REPLACE VIEW "C##SCOTT"."SHOPLIKEVIEW" AS SELECT
	SHOP.SHOPTITLE, 
	SHOPTYPE.FLNAME, 
	THREE.THNAME, 
	TWO.TWNAME, 
	ONE.ONAME, 
	SHOP.SHOPID, 
	SHOP.SIMPLEDESC, 
	SHOP.SHOPXPRICE, 
	SHOP.COMMCOUNT
FROM
	SHOP
	LEFT JOIN
	SHOPTYPE
	ON 
		SHOP.SHOPTYPE = SHOPTYPE.FLID
	LEFT JOIN
	ONE
	ON 
		SHOP.ONEFL = ONE.OID
	LEFT JOIN
	TWO
	ON 
		SHOP.TWOFL = TWO.TID
	LEFT JOIN
	THREE
	ON 
		SHOP.THREEFL = THREE.TID;

-- ----------------------------
-- View structure for SHOPMANGERVIEW
-- ----------------------------
CREATE OR REPLACE VIEW "C##SCOTT"."SHOPMANGERVIEW" AS SELECT
	SHOP.SHOPID, 
	SHOP.SHOPTITLE, 
	SHOP.SHOPXPRICE, 
	SHOP.ISUPJIA, 
	SHOPTYPE.FLNAME, 
	TWO.TWNAME, 
	ONE.ONAME
FROM
	SHOP
	LEFT JOIN
	ONE
	ON 
		SHOP.ONEFL = ONE.OID
	LEFT JOIN
	TWO
	ON 
		SHOP.TWOFL = TWO.TID
	LEFT JOIN
	SHOPTYPE
	ON 
		SHOP.SHOPTYPE = SHOPTYPE.FLID;

-- ----------------------------
-- Primary Key structure for table A
-- ----------------------------
ALTER TABLE "C##SCOTT"."A" ADD CONSTRAINT "SYS_C009865" PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table AUSER
-- ----------------------------
ALTER TABLE "C##SCOTT"."AUSER" ADD CONSTRAINT "SYS_C009852" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table CPFL
-- ----------------------------
ALTER TABLE "C##SCOTT"."CPFL" ADD CONSTRAINT "SYS_C009856" PRIMARY KEY ("CPID");

-- ----------------------------
-- Primary Key structure for table LIKESHOP
-- ----------------------------
ALTER TABLE "C##SCOTT"."LIKESHOP" ADD CONSTRAINT "SYS_C009853" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table ONE
-- ----------------------------
ALTER TABLE "C##SCOTT"."ONE" ADD CONSTRAINT "SYS_C009858" PRIMARY KEY ("OID");

-- ----------------------------
-- Primary Key structure for table ORDERS
-- ----------------------------
ALTER TABLE "C##SCOTT"."ORDERS" ADD CONSTRAINT "SYS_C009861" PRIMARY KEY ("ID");

-- ----------------------------
-- Triggers structure for table ORDERS
-- ----------------------------
CREATE TRIGGER "C##SCOTT"."UPDATECOUNT" AFTER INSERT ON "C##SCOTT"."ORDERS" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW 
BEGIN
  UPDATE SHOP SET SHOPCOUNT = SHOPCOUNT - 1 WHERE SHOPID = :new.SHOPID;
END;
/

-- ----------------------------
-- Primary Key structure for table OTHERIMG
-- ----------------------------
ALTER TABLE "C##SCOTT"."OTHERIMG" ADD CONSTRAINT "SYS_C009863" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table PERMTERS
-- ----------------------------
ALTER TABLE "C##SCOTT"."PERMTERS" ADD CONSTRAINT "SYS_C009864" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table SHOP
-- ----------------------------
ALTER TABLE "C##SCOTT"."SHOP" ADD CONSTRAINT "SYS_C009854" PRIMARY KEY ("SHOPID");

-- ----------------------------
-- Indexes structure for table SHOP
-- ----------------------------
CREATE INDEX "C##SCOTT"."SID"
  ON "C##SCOTT"."SHOP" ("SHOPTITLE" ASC)
  LOGGING
  TABLESPACE "USERS"
  VISIBLE
PCTFREE 10
INITRANS 2
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
  FLASH_CACHE DEFAULT
)
   USABLE;

-- ----------------------------
-- Primary Key structure for table SHOPCAR
-- ----------------------------
ALTER TABLE "C##SCOTT"."SHOPCAR" ADD CONSTRAINT "BIN$kSmlpbYaQU6YtG91yIocUw==$2" PRIMARY KEY ("CARID");

-- ----------------------------
-- Triggers structure for table SHOPCAR
-- ----------------------------
CREATE TRIGGER "C##SCOTT"."UPDATESHOPCOUNT" BEFORE INSERT ON "C##SCOTT"."SHOPCAR" REFERENCING OLD AS "OLD" NEW AS "NEW" DISABLE 
BEGIN
	NULL
	
END;
/

-- ----------------------------
-- Primary Key structure for table SHOPPHB
-- ----------------------------
ALTER TABLE "C##SCOTT"."SHOPPHB" ADD CONSTRAINT "SYS_C009862" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table SHOPTYPE
-- ----------------------------
ALTER TABLE "C##SCOTT"."SHOPTYPE" ADD CONSTRAINT "SYS_C009857" PRIMARY KEY ("FLID");

-- ----------------------------
-- Primary Key structure for table THREE
-- ----------------------------
ALTER TABLE "C##SCOTT"."THREE" ADD CONSTRAINT "SYS_C009860" PRIMARY KEY ("TID");

-- ----------------------------
-- Primary Key structure for table TUSER
-- ----------------------------
ALTER TABLE "C##SCOTT"."TUSER" ADD CONSTRAINT "SYS_C009851" PRIMARY KEY ("ID");

-- ----------------------------
-- Primary Key structure for table TWO
-- ----------------------------
ALTER TABLE "C##SCOTT"."TWO" ADD CONSTRAINT "SYS_C009859" PRIMARY KEY ("TID");
