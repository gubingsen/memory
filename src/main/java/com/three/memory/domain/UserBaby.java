package com.three.memory.domain;

import java.util.Date;

public class UserBaby {
    private Integer id;

    private Integer uid;

    private String babymedia;

    private String name;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBabymedia() {
        return babymedia;
    }

    public void setBabymedia(String babymedia) {
        this.babymedia = babymedia == null ? null : babymedia.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}