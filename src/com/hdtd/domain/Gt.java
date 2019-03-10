package com.hdtd.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Gt
 * ¸ËËþ
 */

public class Gt extends BasicPojo{
	

//	@Column(name="fileFrom")
//	private String fileFrom;
	
	@Column(name="p2_CusVars")
	private String  p2_CusVars ;
	
	@Column(name="fill_bounds")
	private String  fill_bounds ;
	
	@Column(name="lw")
	private String  lw ;
	
	@Column(name="groupObjId")
	private String  groupObjId ;
	
	@Column(name="voltype")
	private String  voltype ;
	
	@Transient
	@Column(name="index")	//²»×ª»»
	private String  index ;
	
	@Column(name="ls")
	private String  ls ;
	
	@Column(name="devref")
	private String  devref ;
	
	@Column(name="fm")
	private String  fm ;
	
	@Column(name="app")
	private String  app ;
	
	@Column(name="y")
	private String  y ;
	
	@Column(name="recordApp")
	private String  recordApp ;
	
	@Column(name="x")
	private String  x ;
	
	@Column(name="w")
	private String  w ;
	
	@Column(name="tfr")
	private String  tfr ;
	
	@Column(name="enantiType")
	private String  enantiType ;
	
	@Column(name="keyid")
	private String  keyid ;
	
	@Column(name="fc")
	private String  fc ;
	
	@Column(name="id")
	private String  id ;
	
	@Column(name="zoomScaleType")
	private String  zoomScaleType ;
	
	@Column(name="lc")
	private String  lc ;
	
	@Column(name="keyidDesc")
	private String  keyidDesc ;
	
	@Column(name="switchapp")
	private String  switchapp ;
	
	@Column(name="h")
	private String  h ;
	
	@Column(name="p_DyColorFlag")
	private String  p_DyColorFlag ;
	
	@Column(name="idinmodel")
	private String  idinmodel ;
	
	@Column(name="af")
	private String  af;
	
	@Column(name="centerflag")
	private String  centerflag;
	
	@Column(name="domain")
	private String  domain;
	
	
	
	
//	public String getFileFrom() {
//		return fileFrom;
//	}
//	public void setFileFrom(String fileFrom) {
//		this.fileFrom = fileFrom;
//	}
	
	public String getP2_CusVars() {
		return p2_CusVars;
	}
	public void setP2_CusVars(String p2_CusVars) {
		this.p2_CusVars = p2_CusVars;
	}
	public String getFill_bounds() {
		return fill_bounds;
	}
	public void setFill_bounds(String fill_bounds) {
		this.fill_bounds = fill_bounds;
	}
	public String getLw() {
		return lw;
	}
	public void setLw(String lw) {
		this.lw = lw;
	}
	public String getGroupObjId() {
		return groupObjId;
	}
	public void setGroupObjId(String groupObjId) {
		this.groupObjId = groupObjId;
	}
	public String getVoltype() {
		return voltype;
	}
	public void setVoltype(String voltype) {
		this.voltype = voltype;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getLs() {
		return ls;
	}
	public void setLs(String ls) {
		this.ls = ls;
	}
	public String getDevref() {
		return devref;
	}
	public void setDevref(String devref) {
		this.devref = devref;
	}
	public String getFm() {
		return fm;
	}
	public void setFm(String fm) {
		this.fm = fm;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getRecordApp() {
		return recordApp;
	}
	public void setRecordApp(String recordApp) {
		this.recordApp = recordApp;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getW() {
		return w;
	}
	public void setW(String w) {
		this.w = w;
	}
	public String getTfr() {
		return tfr;
	}
	public void setTfr(String tfr) {
		this.tfr = tfr;
	}
	public String getEnantiType() {
		return enantiType;
	}
	public void setEnantiType(String enantiType) {
		this.enantiType = enantiType;
	}
	public String getKeyid() {
		return keyid;
	}
	public void setKeyid(String keyid) {
		this.keyid = keyid;
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
	public String getZoomScaleType() {
		return zoomScaleType;
	}
	public void setZoomScaleType(String zoomScaleType) {
		this.zoomScaleType = zoomScaleType;
	}
	public String getLc() {
		return lc;
	}
	public void setLc(String lc) {
		this.lc = lc;
	}
	public String getKeyidDesc() {
		return keyidDesc;
	}
	public void setKeyidDesc(String keyidDesc) {
		this.keyidDesc = keyidDesc;
	}
	public String getSwitchapp() {
		return switchapp;
	}
	public void setSwitchapp(String switchapp) {
		this.switchapp = switchapp;
	}
	public String getH() {
		return h;
	}
	public void setH(String h) {
		this.h = h;
	}
	public String getP_DyColorFlag() {
		return p_DyColorFlag;
	}
	public void setP_DyColorFlag(String p_DyColorFlag) {
		this.p_DyColorFlag = p_DyColorFlag;
	}
	public String getIdinmodel() {
		return idinmodel;
	}
	public void setIdinmodel(String idinmodel) {
		this.idinmodel = idinmodel;
	}
	public String getAf() {
		return af;
	}
	public void setAf(String af) {
		this.af = af;
	}
	public String getCenterflag() {
		return centerflag;
	}
	public void setCenterflag(String centerflag) {
		this.centerflag = centerflag;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Gt [fileFrom=" + super.getFileFrom() + ", p2_CusVars=" + p2_CusVars + ", fill_bounds=" + fill_bounds + ", lw=" + lw + ", groupObjId="
				+ groupObjId + ", voltype=" + voltype + ", index=" + index + ", ls=" + ls + ", devref=" + devref
				+ ", fm=" + fm + ", app=" + app + ", y=" + y + ", recordApp=" + recordApp + ", x=" + x + ", w=" + w
				+ ", tfr=" + tfr + ", enantiType=" + enantiType + ", keyid=" + keyid + ", fc=" + fc + ", id=" + id
				+ ", zoomScaleType=" + zoomScaleType + ", lc=" + lc + ", keyidDesc=" + keyidDesc + ", switchapp="
				+ switchapp + ", h=" + h + ", p_DyColorFlag=" + p_DyColorFlag + ", idinmodel=" + idinmodel + ", af="
				+ af + ", centerflag=" + centerflag + ", domain=" + domain + "]";
	}
	
	
	
	
	
	
	
}
