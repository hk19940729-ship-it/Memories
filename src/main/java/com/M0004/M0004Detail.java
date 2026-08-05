package com.M0004;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class M0004Detail {
	private String hincode;
	private double genZaiko;
	private double shohiYotei;
	private double zaikoYotei;
	private double nenKeiSu;
	private double nenJisSu;
	private double syuKeiSu;
	private double syuJisSu;
	private List<M0004Cell> cellList = new ArrayList<>();//Newが必要
	
	
	public void apply(String hincode, double genzaiko, double shohiYotei,  double zaikoYotei, double nenKeisu, double nenJisSu, double syuKeisu, double syuJisu) {
		this.hincode = hincode;
		this.genZaiko = genzaiko;
		//this.shohiYotei = shohiYotei; 消費予定数　保留
		//this.zaikoYotei = zaikoYotei; 在庫予定数　保留
		this.nenKeiSu = nenKeisu;
		this.nenJisSu = nenJisSu;
		this.syuKeiSu  = syuKeisu;
		this.syuJisSu = syuJisu;
	};
	
	public void addcell(M0004Cell cell) {
		this.cellList.add(cell);
	};
	
}