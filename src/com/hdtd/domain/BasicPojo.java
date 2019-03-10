package com.hdtd.domain;

import javax.persistence.Column;

public class BasicPojo {
	
	@Column(name="fileFrom")
	private String fileFrom;

	public String getFileFrom() {
		return fileFrom;
	}

	public void setFileFrom(String fileFrom) {
		this.fileFrom = fileFrom;
	}
	
	
}
