package com.three.memory.domain;

public class FoodDetail {
    private Integer id;
    private Integer fodid;
    private String img;
    private String fodinfo;
    private String gesinfo;
    private String lyiinfo;
    private String lacinfo;
    private String bybyinfo;
    private int gestation;
    private int lyingin;
    private int lactation;
    private String bybytime;

    public int getGestation() {
        return gestation;
    }

    public void setGestation(int gestation) {
        this.gestation = gestation;
    }

    public int getLyingin() {
        return lyingin;
    }

    public void setLyingin(int lyingin) {
        this.lyingin = lyingin;
    }

    public int getLactation() {
        return lactation;
    }

    public void setLactation(int lactation) {
        this.lactation = lactation;
    }

    public String getBybytime() {
        return bybytime;
    }

    public void setBybytime(String bybytime) {
        this.bybytime = bybytime;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

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

    public String getFodinfo() {
        return fodinfo;
    }

    public void setFodinfo(String fodinfo) {
        this.fodinfo = fodinfo == null ? null : fodinfo.trim();
    }

    public String getGesinfo() {
        return gesinfo;
    }

    public void setGesinfo(String gesinfo) {
        this.gesinfo = gesinfo == null ? null : gesinfo.trim();
    }

    public String getLyiinfo() {
        return lyiinfo;
    }

    public void setLyiinfo(String lyiinfo) {
        this.lyiinfo = lyiinfo == null ? null : lyiinfo.trim();
    }

    public String getLacinfo() {
        return lacinfo;
    }

    public void setLacinfo(String lacinfo) {
        this.lacinfo = lacinfo == null ? null : lacinfo.trim();
    }

    public String getBybyinfo() {
        return bybyinfo;
    }

    public void setBybyinfo(String bybyinfo) {
        this.bybyinfo = bybyinfo == null ? null : bybyinfo.trim();
    }
}