package com.hdtd.domain;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * ACLine
 * À¡Ïß¶Î
 * 46×Ö¶Î
 */
@Table(name="ACLine")
public class ACLine extends BasicPojo{
	@Column(name="voltype")
	private String  voltype ;
	private String  app ;
	
	@Column(name="needBepaint")
	private String  needBepaint ;
	
	@Column(name="isNewPipeLine")
	private String  isNewPipeLine ;
	
	@Column(name="pieExcursion")
	private String  pieExcursion ;
	
	
	@Column(name="cirAnchorType")
	private String  cirAnchorType ;
	private String  switchapp ;
	private String  tfr ;
	private String  volt ;
	
	@Column(name="groupObjId")
	private String  groupObjId ;
	
	
	@Column(name="drawGongJiaoPipe")
	private String  drawGongJiaoPipe ;
	
	@Column(name="isCableMode")
	private String  isCableMode ;
	
	@Column(name="keyidDesc")
	private String  keyidDesc ;
	private String  af ;
	private String  name ;
	
	private String  domain ;
	
	@Column(name="isShowCirBackground")
	private String  isShowCirBackground ;
	
	@Column(name="isPaintStick")
	private String  isPaintStick ;
	private String  analog_id_2 ;
	
	@Column(name="FREECIR")
	private String  FREECIR ;
	
	private String  lw ;
	private String  analog_id ;
	private String  ls ;
	
	@Column(name="keyid2Desc")
	private String  keyid2Desc ;
	private String  fm ;
	
	
	@Column(name="recordApp")
	private String  recordApp ;
	
	@Column(name="isHideStatus")
	private String  isHideStatus ;
	private String  issecflag ;
	private String  fc ;
	private String  id ;
	
	private String  fill_bounds ;
	private String  lc ;
	private String  y ;
	private String  x ;
	
	@Column(name="zoomScaleType")
	private String  zoomScaleType ;
	
	private String  w ;
	
	@Column(name="showGongJiaoPipe")
	private String  showGongJiaoPipe ;
	
	@Column(name="isPipe")
	private String  isPipe ;
	
	@Column(name="keyid1Desc")
	private String  keyid1Desc ;
	
	@Column(name="piePercent")
	private String  piePercent ;
	
	private String  keyid ;
	private String  h ;
	private String  keyid2 ;
	private String  keyid1 ;
	private String  d ;
	
	@Column(name="cableType")
	private String  cableType ;
	
	
	public String getVoltype() {
		return voltype;
	}
	public void setVoltype(String voltype) {
		this.voltype = voltype;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public String getNeedBepaint() {
		return needBepaint;
	}
	public void setNeedBepaint(String needBepaint) {
		this.needBepaint = needBepaint;
	}
	public String getIsNewPipeLine() {
		return isNewPipeLine;
	}
	public void setIsNewPipeLine(String isNewPipeLine) {
		this.isNewPipeLine = isNewPipeLine;
	}
	public String getPieExcursion() {
		return pieExcursion;
	}
	public void setPieExcursion(String pieExcursion) {
		this.pieExcursion = pieExcursion;
	}
	public String getCirAnchorType() {
		return cirAnchorType;
	}
	public void setCirAnchorType(String cirAnchorType) {
		this.cirAnchorType = cirAnchorType;
	}
	public String getSwitchapp() {
		return switchapp;
	}
	public void setSwitchapp(String switchapp) {
		this.switchapp = switchapp;
	}
	public String getTfr() {
		return tfr;
	}
	public void setTfr(String tfr) {
		this.tfr = tfr;
	}
	public String getVolt() {
		return volt;
	}
	public void setVolt(String volt) {
		this.volt = volt;
	}
	public String getGroupObjId() {
		return groupObjId;
	}
	public void setGroupObjId(String groupObjId) {
		this.groupObjId = groupObjId;
	}
	public String getDrawGongJiaoPipe() {
		return drawGongJiaoPipe;
	}
	public void setDrawGongJiaoPipe(String drawGongJiaoPipe) {
		this.drawGongJiaoPipe = drawGongJiaoPipe;
	}
	public String getIsCableMode() {
		return isCableMode;
	}
	public void setIsCableMode(String isCableMode) {
		this.isCableMode = isCableMode;
	}
	public String getKeyidDesc() {
		return keyidDesc;
	}
	public void setKeyidDesc(String keyidDesc) {
		this.keyidDesc = keyidDesc;
	}
	public String getAf() {
		return af;
	}
	public void setAf(String af) {
		this.af = af;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getIsShowCirBackground() {
		return isShowCirBackground;
	}
	public void setIsShowCirBackground(String isShowCirBackground) {
		this.isShowCirBackground = isShowCirBackground;
	}
	public String getIsPaintStick() {
		return isPaintStick;
	}
	public void setIsPaintStick(String isPaintStick) {
		this.isPaintStick = isPaintStick;
	}
	public String getAnalog_id_2() {
		return analog_id_2;
	}
	public void setAnalog_id_2(String analog_id_2) {
		this.analog_id_2 = analog_id_2;
	}
	public String getFREECIR() {
		return FREECIR;
	}
	public void setFREECIR(String fREECIR) {
		FREECIR = fREECIR;
	}
	public String getLw() {
		return lw;
	}
	public void setLw(String lw) {
		this.lw = lw;
	}
	public String getAnalog_id() {
		return analog_id;
	}
	public void setAnalog_id(String analog_id) {
		this.analog_id = analog_id;
	}
	public String getLs() {
		return ls;
	}
	public void setLs(String ls) {
		this.ls = ls;
	}
	public String getKeyid2Desc() {
		return keyid2Desc;
	}
	public void setKeyid2Desc(String keyid2Desc) {
		this.keyid2Desc = keyid2Desc;
	}
	public String getFm() {
		return fm;
	}
	public void setFm(String fm) {
		this.fm = fm;
	}
	public String getRecordApp() {
		return recordApp;
	}
	public void setRecordApp(String recordApp) {
		this.recordApp = recordApp;
	}
	public String getIsHideStatus() {
		return isHideStatus;
	}
	public void setIsHideStatus(String isHideStatus) {
		this.isHideStatus = isHideStatus;
	}
	public String getIssecflag() {
		return issecflag;
	}
	public void setIssecflag(String issecflag) {
		this.issecflag = issecflag;
	}
	public String getFc() {
		return fc;
	}
	public void setFc(String fc) {
		this.fc = fc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFill_bounds() {
		return fill_bounds;
	}
	public void setFill_bounds(String fill_bounds) {
		this.fill_bounds = fill_bounds;
	}
	public String getLc() {
		return lc;
	}
	public void setLc(String lc) {
		this.lc = lc;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getZoomScaleType() {
		return zoomScaleType;
	}
	public void setZoomScaleType(String zoomScaleType) {
		this.zoomScaleType = zoomScaleType;
	}
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	public String getShowGongJiaoPipe() {
		return showGongJiaoPipe;
	}
	public void setShowGongJiaoPipe(String showGongJiaoPipe) {
		this.showGongJiaoPipe = showGongJiaoPipe;
	}
	public String getIsPipe() {
		return isPipe;
	}
	public void setIsPipe(String isPipe) {
		this.isPipe = isPipe;
	}
	public String getKeyid1Desc() {
		return keyid1Desc;
	}
	public void setKeyid1Desc(String keyid1Desc) {
		this.keyid1Desc = keyid1Desc;
	}
	public String getPiePercent() {
		return piePercent;
	}
	public void setPiePercent(String piePercent) {
		this.piePercent = piePercent;
	}
	public String getKeyid() {
		return keyid;
	}
	public void setKeyid(String keyid) {
		this.keyid = keyid;
	}
	public String getH() {
		return h;
	}
	public void setH(String h) {
		this.h = h;
	}
	public String getKeyid2() {
		return keyid2;
	}
	public void setKeyid2(String keyid2) {
		this.keyid2 = keyid2;
	}
	public String getKeyid1() {
		return keyid1;
	}
	public void setKeyid1(String keyid1) {
		this.keyid1 = keyid1;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public String getCableType() {
		return cableType;
	}
	public void setCableType(String cableType) {
		this.cableType = cableType;
	}
	@Override
	public String toString() {
		return "ACLine [voltype=" + voltype + ", app=" + app + ", needBepaint=" + needBepaint + ", isNewPipeLine="
				+ isNewPipeLine + ", pieExcursion=" + pieExcursion + ", cirAnchorType=" + cirAnchorType + ", switchapp="
				+ switchapp + ", tfr=" + tfr + ", volt=" + volt + ", groupObjId=" + groupObjId + ", drawGongJiaoPipe="
				+ drawGongJiaoPipe + ", isCableMode=" + isCableMode + ", keyidDesc=" + keyidDesc + ", af=" + af
				+ ", name=" + name + ", domain=" + domain + ", isShowCirBackground=" + isShowCirBackground
				+ ", isPaintStick=" + isPaintStick + ", analog_id_2=" + analog_id_2 + ", FREECIR=" + FREECIR + ", lw="
				+ lw + ", analog_id=" + analog_id + ", ls=" + ls + ", keyid2Desc=" + keyid2Desc + ", fm=" + fm
				+ ", recordApp=" + recordApp + ", isHideStatus=" + isHideStatus + ", issecflag=" + issecflag + ", fc="
				+ fc + ", id=" + id + ", fill_bounds=" + fill_bounds + ", lc=" + lc + ", y=" + y + ", x=" + x
				+ ", zoomScaleType=" + zoomScaleType + ", w=" + w + ", showGongJiaoPipe=" + showGongJiaoPipe
				+ ", isPipe=" + isPipe + ", keyid1Desc=" + keyid1Desc + ", piePercent=" + piePercent + ", keyid="
				+ keyid + ", h=" + h + ", keyid2=" + keyid2 + ", keyid1=" + keyid1 + ", d=" + d + ", cableType="
				+ cableType + "]";
	}
	
	
	
}
