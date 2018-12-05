package com.three.memory.domain;

public class ProMedia {
    private Integer id;

    private Integer prodetid;

    private String media;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProdetid() {
        return prodetid;
    }

    public void setProdetid(Integer prodetid) {
        this.prodetid = prodetid;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media == null ? null : media.trim();
    }
}