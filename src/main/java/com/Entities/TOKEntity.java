package com.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TOKMS")
public class TOKEntity {

    @Id
    @Column(name = "TOKCODE", length = 6, nullable = false)
    private String tokcode;

    @Column(name = "TOKNM", length = 20)
    private String toknm;

    @Column(name = "TEL", length = 10)
    private String tel;

    @Column(name = "DAIHYONM", length = 20)
    private String daihyonm;

    @Column(name = "YASUMI", length = 7)
    private String yasumi;

    // ゲッターとセッター
    public String getTokcode() {
        return tokcode;
    }

    public void setTokcode(String tokcode) {
        this.tokcode = tokcode;
    }

    public String getToknm() {
        return toknm;
    }

    public void setToknm(String tornm) {
        this.toknm = tornm;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDaihyonm() {
        return daihyonm;
    }

    public void setDaihyonm(String daihyonm) {
        this.daihyonm = daihyonm;
    }
    
    public String getYasumi() {
        return yasumi;
    }

    public void setYasumi(String yasumi) {
    	 this.yasumi = yasumi;
    }
}
