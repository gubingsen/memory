package com.three.memory.domain;

import java.util.List;

public class ProductInfo {
    private int id;

    private String proname;

    private int price;
    //是否需要运费 1-是 2-否
    private int carriage;
    //设计者
    private String designer;

    private String type1;

    private String type2;

    private String type3;

    private int vprice;

    private String fav;

    private String info;

    private String feedback;

    private List<ProMedia> medias;

    private List<ProEval> evals;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3;
    }

    public int getVprice() {
        return vprice;
    }

    public void setVprice(int vprice) {
        this.vprice = vprice;
    }

    public String getFav() {
        return fav;
    }

    public void setFav(String fav) {
        this.fav = fav;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public List<ProMedia> getMedias() {
        return medias;
    }

    public void setMedias(List<ProMedia> medias) {
        this.medias = medias;
    }

    public List<ProEval> getEvals() {
        return evals;
    }

    public void setEvals(List<ProEval> evals) {
        this.evals = evals;
    }
}
