package com.M0001.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import com.Entities.HINEntity;

@Entity
public class M0001 {
		@Id
	    private String hinCode;
	    private String hinName;
	    public String hinName2;
	    public String hinKbn;
	    private String tani;
	    private Double tanka;
	    private Double readTime;
	    private String colorCode;
	    private Double syohikigenDays;
	    private Boolean isNew = false;
	    

	    public String getHinCode() {
	        return hinCode;
	    }
	    public void setHinCode(String hincode) {
	        this.hinCode = hincode;
	    }

	    public String getHinName() {
	        return hinName;
	    }
	    public void setHinName(String hinname) {
	        this.hinName = hinname;
	    }
	    
	    public String getHinName2() {
	        return hinName2;
	    }
	    public void setHinNme2(String hinname2) {
	        this.hinName2 = hinname2;
	    }
	    
	    // Getter and Setter for hINbn
	    public String getHINbn() {
	        return hinKbn;
	    }

	    public void setHINbn(String hINbn) {
	        this.hinKbn = hINbn;
	    }

	    // Getter and Setter for tani
	    public String getTani() {
	        return tani;
	    }

	    public void setTani(String tani) {
	        this.tani = tani;
	    }

	    // Getter and Setter for tanka
	    public Double getTanka() {
	        return tanka;
	    }

	    public void setTanka(Double tanka) {
	        this.tanka = tanka;
	    }

	    // Getter and Setter for readTime
	    public Double getReadTime() {
	        return readTime;
	    }

	    public void setReadTime(Double readTime) {
	        this.readTime = readTime;
	    }

	    // Getter and Setter for colorCode
	    public String getColorCode() {
	        return colorCode;
	    }

	    public void setColorCode(String colorCode) {
	        this.colorCode = colorCode;
	    }

	    // Getter and Setter for syohikigenDays
	    public Double getSyohikigenDays() {
	        return syohikigenDays;
	    }

	    public void setSyohikigenDays(Double syohikigenDays) {
	        this.syohikigenDays = syohikigenDays;
	    }
	    
	
		public Boolean getIsNew() {
			return isNew;
		}
		public void setIsNew(Boolean isNew) {
			this.isNew = isNew;
		}
	    
		public void ApplyEdit(HINEntity hinenyity,Boolean isNew) {
			if (isNew) {
			    this.hinCode = hinenyity.getHinCode();
			    this.isNew = true;
			}
			    this.hinName = hinenyity.getHinName();
			    this.hinName2 = hinenyity.getHinName2();
			    this.hinKbn = hinenyity.getHinKbn();
			    this.tani = hinenyity.getTni();
			    this.tanka = hinenyity.getTanka();
			    this.readTime = hinenyity.getRt();
			    this.colorCode = hinenyity.getColorCode();
			    this.syohikigenDays = hinenyity.getSyohiKigenDays();
			  
		}
		
		public HINEntity toHINEntity() {
		    HINEntity entity = new HINEntity();
		    entity.setHinCode(this.hinCode);
		    entity.setHinName(this.hinName);
		    entity.setHinName2(this.hinName2);
		    entity.setHinKbn(this.hinKbn);
		    entity.setTni(this.tani);
		    entity.setTanka(this.tanka);
		    entity.setRt(this.readTime);
		    entity.setColorCode(this.colorCode);
		    entity.setSyohiKigenDays(this.syohikigenDays);
		    return entity;
		}

	
}


