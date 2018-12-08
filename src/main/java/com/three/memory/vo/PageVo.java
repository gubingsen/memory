package com.three.memory.vo;


import java.util.List;

public class PageVo<T> {
    Integer code;
    String msg;
    Integer count;
    String src;
    List<T> data;
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * 分页数据返回
     *
     * @param data  查询好的分页数据集合
     * @param count 统计总条目数
     * @param code 状态码
     * @param msg 提示信息
     * @return vo类
     */
    public static <T> PageVo<T> createPage(int code,String msg,List<T> data, int count) {
        // 新建自定义类
        PageVo<T> pageVo = new PageVo<>();
        // 设置响应码
        pageVo.setCode(code);
        // 设置响应状态
        pageVo.setMsg(msg);
        // 设置总条目
        pageVo.setCount(count);
        // 添加数据
        pageVo.setData(data);
        // 返回
        return pageVo;

    }

    /**
     * 用于单体数据返回
     * @param t 泛型单体数据
     * @param code 状态码
     * @param msg 提示信息
     * @param <T> 泛型
     * @return vo类
     */
    public static <T> PageVo<T> create(int code,String msg,T t) {
        // 新建自定义类
        PageVo<T> pageVo = new PageVo<>();
        // 设置响应码
        pageVo.setCode(code);
        // 设置响应状态
        pageVo.setMsg(msg);
        // 添加数据
        pageVo.setT(t);
        // 返回
        return pageVo;

    }

    /**
     * 用于失败的无数据返回
     * @param code 状态码
     * @param msg 提示信息
     * @return vo类
     */
    public static <T> PageVo<T> Error(int code,String msg) {
        // 新建自定义类
        PageVo<T> pageVo = new PageVo<>();
        // 设置响应码
        pageVo.setCode(code);
        // 设置响应状态
        pageVo.setMsg(msg);

        return pageVo;
    }

    /**
     * 用于成功的无数据返回，例如新增，删除
     * @param code 状态码
     * @param msg 提示信息
     * @return vo类
     */
    public static <T> PageVo<T> Ok(int code,String msg) {
        // 新建自定义类
        PageVo<T> pageVo = new PageVo<>();
        // 设置响应码
        pageVo.setCode(code);
        // 设置响应状态
        pageVo.setMsg(msg);

        return pageVo;
    }

}
