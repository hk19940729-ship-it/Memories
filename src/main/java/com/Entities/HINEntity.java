package com.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HINMS")
public class HINEntity {
	@Id
	@Column(name = "HINCODE")
	private String hinCode;

	@Column(name = "HINNAME")
	private String hinName;

	@Column(name = "HINNAME2")
	private String hinName2;
	
	@Column(name = "HINKBN")
	private String hinKbn;

	@Column(name = "TNI")
	private String tni;

	@Column(name = "TANKA")
	private Double tanka;

	@Column(name = "RT")
	private Double rt;

	
	@Column(name = "SYOHIKIGENDAYS")
	private Double syohiKigenDays;

	@Column(name = "COLORCODE")
	private String colorCode;		
	
	
	
	public String getHinCode() {
	    return hinCode;
	}

	public void setHinCode(String hinCode) {
	    this.hinCode = hinCode;
	}

	public String getHinName() {
	    return hinName;
	}

	public void setHinName2(String hinName2) {
	    this.hinName2 = hinName2;
	}

	public String getHinName2() {
	    return hinName2;
	}

	public void setHinName(String hinName) {
	    this.hinName = hinName;
	}

	public String getHinKbn() {
	    return hinKbn;
	}

	public void setHinKbn(String hinKbn) {
	    this.hinKbn = hinKbn;
	}

	public String getTni() {
	    return tni;
	}

	public void setTni(String tni) {
	    this.tni = tni;
	}
	
	public Double getTanka() {
	    return tanka;
	}

	public void setTanka(Double tanka) {
	    this.tanka = tanka;
	}

	public Double getRt() {
	    return rt;
	}

	public void setRt(Double rt) {
	    this.rt = rt;
	}

	public Double getSyohiKigenDays() {
	    return syohiKigenDays;
	}

	public void setSyohiKigenDays(Double syohiKigenDays) {
	    this.syohiKigenDays = syohiKigenDays;
	}

	public String getColorCode() {
	    return colorCode;
	}

	public void setColorCode(String colorCode) {
	    this.colorCode = colorCode;
	}
	
	
}