package com.three.memory.domain;

public class DynMedia {
    private Integer id;

    private Integer dynid;

    private String media;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDynid() {
        return dynid;
    }

    public void setDynid(Integer dynid) {
        this.dynid = dynid;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media == null ? null : media.trim();
    }
}