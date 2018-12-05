package com.three.memory.domain;

public class DynEval {
    private Integer id;

    private Integer dynid;

    private String content;

    private Integer num;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}