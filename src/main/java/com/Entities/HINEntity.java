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
	    private String HINCODE;
		@Column(name = "HINNAME")
	    private String HINNAME;
		@Column(name = "HINKBN")
	    private String HINKBN;
		@Column(name = "TNI")
	    private String TNI;

	    public String getHINCODE() {
	        return HINCODE;
	    }

	    public void setHINCODE(String HINCODE) {
	        this.HINCODE = HINCODE;
	    }

	    public String getHINNAME() {
	        return HINNAME;
	    }

	    public void setHINNAME(String HINNAME) {
	        this.HINNAME = HINNAME;
	    }

	    public String getHINKBN() {
	        return HINKBN;
	    }

	    public void setHINKBN(String HINKBN) {
	        this.HINKBN = HINKBN;
	    }

	    public String getTNI() {
	        return TNI;
	    }

	    public void setTNI(String TNI) {
	        this.TNI = TNI;
	    }
}