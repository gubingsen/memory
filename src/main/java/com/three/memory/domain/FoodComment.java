package com.three.memory.domain;

public class FoodComment {
    private Integer id;

    private Integer fodid;

    private Integer usrid;

    private String comment;

    private String comtime;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getComtime() {
        return comtime;
    }

    public void setComtime(String comtime) {
        this.comtime = comtime == null ? null : comtime.trim();
    }

    public FoodComment() {
    }

    public FoodComment(Integer fodid, Integer usrid, String comment, String comtime) {
        this.fodid = fodid;
        this.usrid = usrid;
        this.comment = comment;
        this.comtime = comtime;
    }
}