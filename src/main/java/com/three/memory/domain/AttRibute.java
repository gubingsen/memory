package com.three.memory.domain;

import java.util.Date;

public class AttRibute {
    private Integer id;

    private String attkey;

    private String value;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttkey() {
        return attkey;
    }

    public void setAttkey(String attkey) {
        this.attkey = attkey == null ? null : attkey.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}