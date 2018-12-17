package com.three.memory.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 用户宝宝
 */
public class UserBaby {
    private Integer id;

    private Integer uid;

    private String babymedia;

    private String name;

    private String time;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}