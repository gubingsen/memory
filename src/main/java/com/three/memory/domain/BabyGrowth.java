package com.three.memory.domain;

import java.util.Date;

public class BabyGrowth {
    private Integer id;

    private Integer babyid;

    private Integer heights;

    private Integer heads;

    private Integer weights;

    private String content;

    private String createtime;

    private Integer intage;

    private String strage;

    public Integer getIntage() {
        return intage;
    }

    public void setIntage(Integer intage) {
        this.intage = intage;
    }

    public String getStrage() {
        return strage;
    }

    public void setStrage(String strage) {
        this.strage = strage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBabyid() {
        return babyid;
    }

    public void setBabyid(Integer babyid) {
        this.babyid = babyid;
    }

    public Integer getHeights() {
        return heights;
    }

    public void setHeights(Integer heights) {
        this.heights = heights;
    }

    public Integer getHeads() {
        return heads;
    }

    public void setHeads(Integer heads) {
        this.heads = heads;
    }

    public Integer getWeights() {
        return weights;
    }

    public void setWeights(Integer weights) {
        this.weights = weights;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}