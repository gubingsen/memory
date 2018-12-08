package com.three.memory.vo;

import java.io.Serializable;
import java.util.List;

public class ResultBean<T> implements Serializable {
    //响应码
    private int code;
    //响应信息
    private String msg;
    //返回的数据
    private Object data;
    //用户令牌
    private Object token;
    //总页数
    private int pages;
    //总条数
    private int count;
    //当前页码
    private int pageNum;
    //每页显示的数量
    private int pageSize;
    //数据源
    private List<T> list;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Object getToken() {
        return token;
    }

    public void setToken(Object token) {
        this.token = token;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
