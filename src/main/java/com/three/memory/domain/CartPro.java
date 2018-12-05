package com.three.memory.domain;

public class CartPro {
    private Integer id;

    private Integer cartid;

    private Integer prodetid;

    private Integer num;

    private String type1;

    private String type2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getProdetid() {
        return prodetid;
    }

    public void setProdetid(Integer prodetid) {
        this.prodetid = prodetid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1 == null ? null : type1.trim();
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2 == null ? null : type2.trim();
    }
}