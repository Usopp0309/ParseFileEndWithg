/*
Navicat MySQL Data Transfer

Source Server         : myaql11
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : hdtdgfile

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-03-02 11:18:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for acline
-- ----------------------------
DROP TABLE IF EXISTS `acline`;
CREATE TABLE `acline` (
  `fileFrom` varchar(255) DEFAULT NULL,
  `voltype` varchar(255) DEFAULT NULL,
  `app` varchar(255) DEFAULT NULL,
  `needBepaint` varchar(255) DEFAULT NULL,
  `isNewPipeLine` varchar(255) DEFAULT NULL,
  `pieExcursion` varchar(255) DEFAULT NULL,
  `cirAnchorType` varchar(255) DEFAULT NULL,
  `switchapp` varchar(255) DEFAULT NULL,
  `tfr` varchar(255) DEFAULT NULL,
  `volt` varchar(255) DEFAULT NULL,
  `groupObjId` varchar(255) DEFAULT NULL,
  `drawGongJiaoPipe` varchar(255) DEFAULT NULL,
  `isCableMode` varchar(255) DEFAULT NULL,
  `keyidDesc` varchar(255) DEFAULT NULL,
  `af` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `domain` varchar(255) DEFAULT NULL,
  `isShowCirBackground` varchar(255) DEFAULT NULL,
  `isPaintStick` varchar(255) DEFAULT NULL,
  `analog_id_2` varchar(255) DEFAULT NULL,
  `FREECIR` varchar(255) DEFAULT NULL,
  `lw` varchar(255) DEFAULT NULL,
  `analog_id` varchar(255) DEFAULT NULL,
  `ls` varchar(255) DEFAULT NULL,
  `keyid2Desc` varchar(255) DEFAULT NULL,
  `fm` varchar(255) DEFAULT NULL,
  `recordApp` varchar(255) DEFAULT NULL,
  `isHideStatus` varchar(255) DEFAULT NULL,
  `issecflag` varchar(255) DEFAULT NULL,
  `fc` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `fill_bounds` varchar(255) DEFAULT NULL,
  `lc` varchar(255) DEFAULT NULL,
  `y` varchar(255) DEFAULT NULL,
  `x` varchar(255) DEFAULT NULL,
  `zoomScaleType` varchar(255) DEFAULT NULL,
  `w` varchar(255) DEFAULT NULL,
  `showGongJiaoPipe` varchar(255) DEFAULT NULL,
  `isPipe` varchar(255) DEFAULT NULL,
  `keyid1Desc` varchar(255) DEFAULT NULL,
  `piePercent` varchar(255) DEFAULT NULL,
  `keyid` varchar(255) DEFAULT NULL,
  `h` varchar(255) DEFAULT NULL,
  `keyid2` varchar(255) DEFAULT NULL,
  `keyid1` varchar(255) DEFAULT NULL,
  `d` varchar(255) DEFAULT NULL,
  `cableType` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bus
-- ----------------------------
DROP TABLE IF EXISTS `bus`;
CREATE TABLE `bus` (
  `fileFrom` varchar(255) DEFAULT NULL,
  `y2` varchar(255) DEFAULT NULL,
  `y1` varchar(255) DEFAULT NULL,
  `fill_bounds` varchar(255) DEFAULT NULL,
  `lw` varchar(255) DEFAULT NULL,
  `groupObjId` varchar(255) DEFAULT NULL,
  `voltype` varchar(255) DEFAULT NULL,
  `ls` varchar(255) DEFAULT NULL,
  `fm` varchar(255) DEFAULT NULL,
  `app` varchar(255) DEFAULT NULL,
  `y` varchar(255) DEFAULT NULL,
  `recordApp` varchar(255) DEFAULT NULL,
  `x` varchar(255) DEFAULT NULL,
  `w` varchar(255) DEFAULT NULL,
  `tfr` varchar(255) DEFAULT NULL,
  `keyid` varchar(255) DEFAULT NULL,
  `fc` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `zoomScaleType` varchar(255) DEFAULT NULL,
  `lc` varchar(255) DEFAULT NULL,
  `keyidDesc` varchar(255) DEFAULT NULL,
  `switchapp` varchar(255) DEFAULT NULL,
  `h` varchar(255) DEFAULT NULL,
  `x2` varchar(255) DEFAULT NULL,
  `x1` varchar(255) DEFAULT NULL,
  `af` varchar(255) DEFAULT NULL,
  `d` varchar(255) DEFAULT NULL,
  `domain` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cbreaker
-- ----------------------------
DROP TABLE IF EXISTS `cbreaker`;
CREATE TABLE `cbreaker` (
  `fileFrom` varchar(255) DEFAULT NULL,
  `p2_CusVars` varchar(255) DEFAULT NULL,
  `fill_bounds` varchar(255) DEFAULT NULL,
  `lw` varchar(255) DEFAULT NULL,
  `groupObjId` varchar(255) DEFAULT NULL,
  `voltype` varchar(255) DEFAULT NULL,
  `index` varchar(255) DEFAULT NULL,
  `ls` varchar(255) DEFAULT NULL,
  `devref` varchar(255) DEFAULT NULL,
  `fm` varchar(255) DEFAULT NULL,
  `app` varchar(255) DEFAULT NULL,
  `y` varchar(255) DEFAULT NULL,
  `recordApp` varchar(255) DEFAULT NULL,
  `x` varchar(255) DEFAULT NULL,
  `w` varchar(255) DEFAULT NULL,
  `tfr` varchar(255) DEFAULT NULL,
  `enantiType` varchar(255) DEFAULT NULL,
  `keyid` varchar(255) DEFAULT NULL,
  `fc` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `zoomScaleType` varchar(255) DEFAULT NULL,
  `lc` varchar(255) DEFAULT NULL,
  `keyidDesc` varchar(255) DEFAULT NULL,
  `switchapp` varchar(255) DEFAULT NULL,
  `h` varchar(255) DEFAULT NULL,
  `p_DyColorFlag` varchar(255) DEFAULT NULL,
  `idinmodel` varchar(255) DEFAULT NULL,
  `af` varchar(255) DEFAULT NULL,
  `centerflag` varchar(255) DEFAULT NULL,
  `domain` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for disconnector
-- ----------------------------
DROP TABLE IF EXISTS `disconnector`;
CREATE TABLE `disconnector` (
  `fileFrom` varchar(255) DEFAULT NULL,
  `p2_CusVars` varchar(255) DEFAULT NULL,
  `fill_bounds` varchar(255) DEFAULT NULL,
  `lw` varchar(255) DEFAULT NULL,
  `groupObjId` varchar(255) DEFAULT NULL,
  `voltype` varchar(255) DEFAULT NULL,
  `index` varchar(255) DEFAULT NULL,
  `ls` varchar(255) DEFAULT NULL,
  `devref` varchar(255) DEFAULT NULL,
  `fm` varchar(255) DEFAULT NULL,
  `app` varchar(255) DEFAULT NULL,
  `y` varchar(255) DEFAULT NULL,
  `recordApp` varchar(255) DEFAULT NULL,
  `x` varchar(255) DEFAULT NULL,
  `w` varchar(255) DEFAULT NULL,
  `tfr` varchar(255) DEFAULT NULL,
  `enantiType` varchar(255) DEFAULT NULL,
  `keyid` varchar(255) DEFAULT NULL,
  `fc` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `zoomScaleType` varchar(255) DEFAULT NULL,
  `lc` varchar(255) DEFAULT NULL,
  `keyidDesc` varchar(255) DEFAULT NULL,
  `switchapp` varchar(255) DEFAULT NULL,
  `h` varchar(255) DEFAULT NULL,
  `p_DyColorFlag` varchar(255) DEFAULT NULL,
  `idinmodel` varchar(255) DEFAULT NULL,
  `af` varchar(255) DEFAULT NULL,
  `centerflag` varchar(255) DEFAULT NULL,
  `domain` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for gt
-- ----------------------------
DROP TABLE IF EXISTS `gt`;
CREATE TABLE `gt` (
  `fileFrom` varchar(255) DEFAULT NULL,
  `p2_CusVars` varchar(255) DEFAULT NULL,
  `fill_bounds` varchar(255) DEFAULT NULL,
  `lw` varchar(255) DEFAULT NULL,
  `groupObjId` varchar(255) DEFAULT NULL,
  `voltype` varchar(255) DEFAULT NULL,
  `index` varchar(255) DEFAULT NULL,
  `ls` varchar(255) DEFAULT NULL,
  `devref` varchar(255) DEFAULT NULL,
  `fm` varchar(255) DEFAULT NULL,
  `app` varchar(255) DEFAULT NULL,
  `y` varchar(255) DEFAULT NULL,
  `recordApp` varchar(255) DEFAULT NULL,
  `x` varchar(255) DEFAULT NULL,
  `w` varchar(255) DEFAULT NULL,
  `tfr` varchar(255) DEFAULT NULL,
  `enantiType` varchar(255) DEFAULT NULL,
  `keyid` varchar(255) DEFAULT NULL,
  `fc` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `zoomScaleType` varchar(255) DEFAULT NULL,
  `lc` varchar(255) DEFAULT NULL,
  `keyidDesc` varchar(255) DEFAULT NULL,
  `switchapp` varchar(255) DEFAULT NULL,
  `h` varchar(255) DEFAULT NULL,
  `p_DyColorFlag` varchar(255) DEFAULT NULL,
  `idinmodel` varchar(255) DEFAULT NULL,
  `af` varchar(255) DEFAULT NULL,
  `centerflag` varchar(255) DEFAULT NULL,
  `domain` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for pdtransformer
-- ----------------------------
DROP TABLE IF EXISTS `pdtransformer`;
CREATE TABLE `pdtransformer` (
  `fileFrom` varchar(255) DEFAULT NULL,
  `p2_CusVars` varchar(255) DEFAULT NULL,
  `fill_bounds` varchar(255) DEFAULT NULL,
  `lw` varchar(255) DEFAULT NULL,
  `groupObjId` varchar(255) DEFAULT NULL,
  `voltype` varchar(255) DEFAULT NULL,
  `index` varchar(255) DEFAULT NULL,
  `ls` varchar(255) DEFAULT NULL,
  `devref` varchar(255) DEFAULT NULL,
  `fm` varchar(255) DEFAULT NULL,
  `app` varchar(255) DEFAULT NULL,
  `y` varchar(255) DEFAULT NULL,
  `recordApp` varchar(255) DEFAULT NULL,
  `x` varchar(255) DEFAULT NULL,
  `w` varchar(255) DEFAULT NULL,
  `tfr` varchar(255) DEFAULT NULL,
  `enantiType` varchar(255) DEFAULT NULL,
  `keyid` varchar(255) DEFAULT NULL,
  `fc` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `zoomScaleType` varchar(255) DEFAULT NULL,
  `lc` varchar(255) DEFAULT NULL,
  `keyidDesc` varchar(255) DEFAULT NULL,
  `switchapp` varchar(255) DEFAULT NULL,
  `h` varchar(255) DEFAULT NULL,
  `p_DyColorFlag` varchar(255) DEFAULT NULL,
  `idinmodel` varchar(255) DEFAULT NULL,
  `af` varchar(255) DEFAULT NULL,
  `centerflag` varchar(255) DEFAULT NULL,
  `domain` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for zf
-- ----------------------------
DROP TABLE IF EXISTS `zf`;
CREATE TABLE `zf` (
  `fileFrom` varchar(255) DEFAULT NULL,
  `fill_bounds` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `lw` varchar(255) DEFAULT NULL,
  `groupObjId` varchar(255) DEFAULT NULL,
  `ls` varchar(255) DEFAULT NULL,
  `voltype` varchar(255) DEFAULT NULL,
  `fm` varchar(255) DEFAULT NULL,
  `app` varchar(255) DEFAULT NULL,
  `y` varchar(255) DEFAULT NULL,
  `recordApp` varchar(255) DEFAULT NULL,
  `x` varchar(255) DEFAULT NULL,
  `w` varchar(255) DEFAULT NULL,
  `tfr` varchar(255) DEFAULT NULL,
  `keyid` varchar(255) DEFAULT NULL,
  `fc` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `zoomScaleType` varchar(255) DEFAULT NULL,
  `lc` varchar(255) DEFAULT NULL,
  `keyidDesc` varchar(255) DEFAULT NULL,
  `switchapp` varchar(255) DEFAULT NULL,
  `h` varchar(255) DEFAULT NULL,
  `af` varchar(255) DEFAULT NULL,
  `idinmodel` varchar(255) DEFAULT NULL,
  `domain` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
