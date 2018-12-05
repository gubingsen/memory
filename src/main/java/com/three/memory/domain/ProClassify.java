package com.three.memory.domain;

public class ProClassify {
    private Integer id;

    private Integer prodetid;

    private String name;

    private Integer grouping;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGrouping() {
        return grouping;
    }

    public void setGrouping(Integer grouping) {
        this.grouping = grouping;
    }
}