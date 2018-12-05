package com.three.memory.domain;

import java.util.Date;

public class BabyGrowth {
    private Integer id;

    private Integer babyid;

    private Integer heights;

    private Integer heads;

    private Integer weights;

    private String content;

    private Date createtime;

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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}