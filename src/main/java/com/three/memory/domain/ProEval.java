package com.three.memory.domain;

public class ProEval {
    private Integer id;

    private Integer proid;

    private String content;

    private Integer starlve;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStarlve() {
        return starlve;
    }

    public void setStarlve(Integer starlve) {
        this.starlve = starlve;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}