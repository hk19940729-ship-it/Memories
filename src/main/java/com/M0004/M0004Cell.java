package com.M0004;

import lombok.Data;

@Data
public class M0004Cell {
	private String day;
	private double hiKeiSu;
	private double hiJiSu;
	private double yojiSai;
	
	
	public void apply(String day ,double hiKeiSu, double hiJiSu) {
		this.day = day;
		this.hiKeiSu = hiKeiSu;
		this.hiJiSu = hiJiSu;
		this.yojiSai = this.hiKeiSu - this.hiJiSu;
	}
	
}


