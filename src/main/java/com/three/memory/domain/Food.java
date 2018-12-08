package com.three.memory.domain;

public class Food {
    private Integer id;

    private Integer ftyid;

    private String foodname;

    private String img;

    private String suitable;

    private String effect;

    private Integer gestation;

    private Integer lyingin;

    private Integer lactation;

    private String bybytime;

    public String getSuitable() {
        return suitable;
    }

    public void setSuitable(String suitable) {
        this.suitable = suitable;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFtyid() {
        return ftyid;
    }

    public void setFtyid(Integer ftyid) {
        this.ftyid = ftyid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getGestation() {
        return gestation;
    }

    public void setGestation(Integer gestation) {
        this.gestation = gestation;
    }

    public Integer getLyingin() {
        return lyingin;
    }

    public void setLyingin(Integer lyingin) {
        this.lyingin = lyingin;
    }

    public Integer getLactation() {
        return lactation;
    }

    public void setLactation(Integer lactation) {
        this.lactation = lactation;
    }

    public String getBybytime() {
        return bybytime;
    }

    public void setBybytime(String bybytime) {
        this.bybytime = bybytime == null ? null : bybytime.trim();
    }
}