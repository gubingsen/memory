package com.three.memory.domain;

public class DynEvalRepl {
    private Integer id;

    private Integer dynevalid;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDynevalid() {
        return dynevalid;
    }

    public void setDynevalid(Integer dynevalid) {
        this.dynevalid = dynevalid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}