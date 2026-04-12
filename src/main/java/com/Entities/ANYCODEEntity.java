package com.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ANYCODEMS")
public class ANYCODEEntity {

    @Id
    @Column(name = "CODEKBN")
    private String codeKbn;

    @Column(name = "CODENM")
    private String codeNm;

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "ITEM1")
    private String item1;

    @Column(name = "ITEMNM1")
    private String itemNm1;

    @Column(name = "ITEM2")
    private String item2;

    @Column(name = "ITEM2NM")
    private String item2Nm;

    @Column(name = "ITEM3")
    private String item3;

    @Column(name = "ITEM3NM")
    private String item3Nm;

    @Column(name = "ITEM4")
    private String item4;

    @Column(name = "ITEM4NM")
    private String item4Nm;

    @Column(name = "ITEM5")
    private String item5;

    @Column(name = "ITEM5NM")
    private String item5Nm;

    @Column(name = "ITEM6")
    private String item6;

    @Column(name = "ITEM6NM")
    private String item6Nm;

    @Column(name = "ITEM7")
    private String item7;

    @Column(name = "ITEM7NM")
    private String item7Nm;

    @Column(name = "ITEM8")
    private String item8;

    @Column(name = "ITEM8NM")
    private String item8Nm;

    @Column(name = "ITEM9")
    private String item9;

    @Column(name = "ITEM9NM")
    private String item9Nm;

    @Column(name = "ITEM10")
    private String item10;

    @Column(name = "ITEM10NM")
    private String item10Nm;

    @Column(name = "NUMITEM1")
    private Integer numItem1;

    @Column(name = "NUMITEM1NM")
    private String numItem1Nm;

    @Column(name = "NUMITEM2")
    private Integer numItem2;

    @Column(name = "NUMITEM2NM")
    private String numItem2Nm;

    @Column(name = "NUMITEM3")
    private Integer numItem3;

    @Column(name = "NUMITEM3NM")
    private String numItem3Nm;

    @Column(name = "NUMITEM4")
    private Integer numItem4;

    @Column(name = "NUMITEM4NM")
    private String numItem4Nm;

    @Column(name = "NUMITEM5")
    private Integer numItem5;

    @Column(name = "NUMITEM5NM")
    private String numItem5Nm;

    @Column(name = "NUMITEM6")
    private Integer numItem6;

    @Column(name = "NUMITEM6NM")
    private String numItem6Nm;

    @Column(name = "NUMITEM7")
    private Integer numItem7;

    @Column(name = "NUMITEM7NM")
    private String numItem7Nm;

    @Column(name = "NUMITEM8")
    private Integer numItem8;

    @Column(name = "NUMITEM8NM")
    private String numItem8Nm;

    @Column(name = "NUMITEM9")
    private Integer numItem9;

    @Column(name = "NUMITEM9NM")
    private String numItem9Nm;

    @Column(name = "NUMITEM10")
    private Integer numItem10;

    @Column(name = "NUMITEM10NM")
    private String numItem10Nm;
    // getter / setter は必要に応じて追加してね
}
