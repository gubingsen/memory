package com.three.memory.domain;

import java.util.Date;

public class ProDuct {
    private Integer id;

    private String proname;

    private Date createtime;

    private Integer price;

    private Integer typid;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTypid() {
        return typid;
    }

    public void setTypid(Integer typid) {
        this.typid = typid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}