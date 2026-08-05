package com.M0004;

import lombok.Data;

@Data
public class M0004Cell {
	private String day;
	private double hiKeiSu;
	private double hiJiSu;
	private double yojiSai;
	
	
	public void apply( double hiKeiSu, double hiJiSu) {
		this.hiKeiSu = hiKeiSu;
		this.hiJiSu = hiJiSu;
		this.yojiSai = this.hiKeiSu - this.hiJiSu;
	}
	
}


