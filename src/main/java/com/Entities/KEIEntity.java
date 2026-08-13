package com.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_KEI")
public class KEIEntity {

    @Id
    @Column(name = "KEINO", length = 10, nullable = false)
    private String keino;

    @Column(name = "YMD")
    private String ymd;

    @Column(name = "HINCODE", length = 6)
    private String hincode;

    @Column(name = "KIBONOKI")
    private String kibonoki;

    @Column(name = "YKEISU")
    private Double ykeisu;

    @Column(name = "WKEISU")
    private Double wkeisu;

    @Column(name = "KEISU")
    private Double keisu;

    @Column(name = "YJISSU")
    private Double yjissu;

    @Column(name = "WJISSU")
    private Double wjissu;

    @Column(name = "JISSU")
    private Double jissu;

    // Getter / Setter
    public String getKeino() {
        return keino;
    }

    public void setKeino(String keino) {
        this.keino = keino;
    }

    public String getYmd() {
        return ymd;
    }

    public void setYmd(String ymd) {
        this.ymd = ymd;
    }

    public String getHincode() {
        return hincode;
    }

    public void setHincode(String hincode) {
        this.hincode = hincode;
    }

    public String getKibonoki() {
        return kibonoki;
    }

    public void setKibonoki(String kibonoki) {
        this.kibonoki = kibonoki;
    }

    public Double getYkeisu() {
        return ykeisu;
    }

    public void setYkeisu(Double ykeisu) {
        this.ykeisu = ykeisu;
    }

    public Double getWkeisu() {
        return wkeisu;
    }

    public void setWkeisu(Double wkeisu) {
        this.wkeisu = wkeisu;
    }

    public Double getKeisu() {
        return keisu;
    }

    public void setKeisu(Double keisu) {
        this.keisu = keisu;
    }

    public Double getYjissu() {
        return yjissu;
    }

    public void setYjissu(Double yjissu) {
        this.yjissu = yjissu;
    }

    public Double getWjissu() {
        return wjissu;
    }

    public void setWjissu(Double wjissu) {
        this.wjissu = wjissu;
    }

    public Double getJissu() {
        return jissu;
    }

    public void setJissu(Double jissu) {
        this.jissu = jissu;
    }
}
