package com.three.memory.domain;

public class ProEvalRepl {
    private Integer id;

    private Integer proevalid;

    private String content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}