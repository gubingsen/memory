package com.three.memory.domain;

public class ProEvalMedia {
    private Integer id;

    private Integer proevalid;

    private String media;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProevalid() {
        return proevalid;
    }

    public void setProevalid(Integer proevalid) {
        this.proevalid = proevalid;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media == null ? null : media.trim();
    }
}