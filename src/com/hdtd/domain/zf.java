package com.hdtd.domain;

import javax.persistence.Column;

/**
 * zf
 *
 */
public class zf extends BasicPojo{
	
	private String  fill_bounds ;
	
	
	private String  type ;
	
	private String  lw ;
	
	@Column(name="groupObjId")
	private String  groupObjId ;
	
	private String  ls ;
	
	private String  voltype ;
	
	private String  fm ;
	
	private String  app ;
	
	private String  y ;
	
	@Column(name="recordApp")
	private String  recordApp ;
	
	private String  x ;
	
	private String  w ;
	
	private String  tfr ;
	
	private String  keyid ;
	
	private String  fc ;
	
	private String  id ;
	
	@Column(name="zoomScaleType")
	private String  zoomScaleType ;
	
	private String  lc ;
	
	@Column(name="keyidDesc")
	private String  keyidDesc ;
	
	private String  switchapp ;
	
	private String  h ;
	
	private String  af ;
	
	private String  idinmodel ;
	
	private String  domain ;
	
	
	public String getFill_bounds() {
		return fill_bounds;
	}
	public void setFill_bounds(String fill_bounds) {
		this.fill_bounds = fill_bounds;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public String getLs() {
		return ls;
	}
	public void setLs(String ls) {
		this.ls = ls;
	}
	public String getVoltype() {
		return voltype;
	}
	public void setVoltype(String voltype) {
		this.voltype = voltype;
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
	public String getAf() {
		return af;
	}
	public void setAf(String af) {
		this.af = af;
	}
	public String getIdinmodel() {
		return idinmodel;
	}
	public void setIdinmodel(String idinmodel) {
		this.idinmodel = idinmodel;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "zf [fill_bounds=" + fill_bounds + ", type=" + type + ", lw=" + lw + ", groupObjId=" + groupObjId
				+ ", ls=" + ls + ", voltype=" + voltype + ", fm=" + fm + ", app=" + app + ", y=" + y + ", recordApp="
				+ recordApp + ", x=" + x + ", w=" + w + ", tfr=" + tfr + ", keyid=" + keyid + ", fc=" + fc + ", id="
				+ id + ", zoomScaleType=" + zoomScaleType + ", lc=" + lc + ", keyidDesc=" + keyidDesc + ", switchapp="
				+ switchapp + ", h=" + h + ", af=" + af + ", idinmodel=" + idinmodel + ", domain=" + domain + "]";
	}
	
	
	
}
