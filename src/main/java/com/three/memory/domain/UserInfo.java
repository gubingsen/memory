package com.three.memory.domain;

import java.util.List;

public class UserInfo {
    private Integer id;

    private String username;

    private String headurl;

    private String nickname;

    private String content;

    private String media;

    private String timegap;

    private String isvip;

    private int num;

    private List<UserBaby> babies;

    private int cid;

    private String cname;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getTimegap() {
        return timegap;
    }

    public void setTimegap(String timegap) {
        this.timegap = timegap;
    }

    public String getIsvip() {
        return isvip;
    }

    public void setIsvip(String isvip) {
        this.isvip = isvip;
    }

    public List<UserBaby> getBabies() {
        return babies;
    }

    public void setBabies(List<UserBaby> babies) {
        this.babies = babies;
    }
}
