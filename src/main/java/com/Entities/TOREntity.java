package com.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TORMS")
public class TOREntity {

    @Id
    @Column(name = "TORCODE", length = 6, nullable = false)
    private String torCode;

    @Column(name = "TORNM", length = 20)
    private String torNm;
    
    @Column(name = "Address", length = 60)
    private String addrress;

    @Column(name = "TEL", length = 10)
    private String tel;

    @Column(name = "DAIHYONM", length = 20)
    private String daihyoNm;

    @Column(name = "YASUMI", length = 7)
    private String yasumi;



    // ゲッターとセッター
    public String getTorCode() {
        return torCode;
    }

    public void setTorCode(String torCode) {
        this.torCode = torCode;
    }

    public String getTorNm() {
        return torNm;
    }

    public void setTorNm(String torNm) {
        this.torNm = torNm;
    }
    
    public String getAddrressNm() {
        return addrress;
    }

    public void setAddrressNm(String addrress) {
        this.addrress = addrress;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDaihyoNm() {
        return daihyoNm;
    }

    public void setDaihyoNm(String daihyoNm) {
        this.daihyoNm = daihyoNm;
    }

    public String getYasumi() {
        return yasumi;
    }

    public void setYasumi(String yasumi) {
    	 this.yasumi = yasumi;
    }

}
