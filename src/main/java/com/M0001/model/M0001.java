package com.M0001.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class M0001 {
		@Id
	    private String HINCODE;
	    private String HINNAME;
	    public String HINNAME2;
	    public String HINKBN;
	    public String TNI;
	    public double TANKA;
	    public double RT;
	    public int SYOHIKIGENDAYS;
	    public String COLORCODE;
	    

	    public String getHINCODE() {
	        return HINCODE;
	    }

	    public void setHINCODE(String hincode) {
	        this.HINCODE = hincode;
	    }

	    public String getHINNAME() {
	        return HINNAME;
	    }

	    public void setHINNAME(String hinname) {
	        this.HINNAME = hinname;
	    }

		public void addAttribute(String string, M0001 m0001) {
			// TODO 自動生成されたメソッド・スタブ
			
		}
	
}


