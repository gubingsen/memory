package com.three.memory.domain;

public class FoodCollect {
    private Integer id;

    private Integer fodid;

    private Integer usrid;

    private String coltime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFodid() {
        return fodid;
    }

    public void setFodid(Integer fodid) {
        this.fodid = fodid;
    }

    public Integer getUsrid() {
        return usrid;
    }

    public void setUsrid(Integer usrid) {
        this.usrid = usrid;
    }

    public String getColtime() {
        return coltime;
    }

    public void setColtime(String coltime) {
        this.coltime = coltime == null ? null : coltime.trim();
    }

    public FoodCollect() {
    }

    public FoodCollect(Integer fodid, Integer usrid, String coltime) {
        this.fodid = fodid;
        this.usrid = usrid;
        this.coltime = coltime;
    }
}