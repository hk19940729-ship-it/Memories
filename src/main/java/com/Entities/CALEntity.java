package com.Entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CALMS")
public class CALEntity {

    @Id
    @Column(name = "DAY", nullable = false)
    private Date day;

    @Column(name = "WEEKDAY", length = 1)
    private String yobi;

    @Column(name = "HOLIDAY", length = 1)
    private String yasumi;

    // ゲッターとセッター
    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getWEEKDAY() {
        return yobi;
    }

    public void setWEEKDAY(String yobi) {
        this.yobi = yobi;
    }

    public String getHOLIDAY() {
        return yasumi;
    }

    public void setHOLIDAY(String yasumi) {
        this.yasumi = yasumi;
    }

}
