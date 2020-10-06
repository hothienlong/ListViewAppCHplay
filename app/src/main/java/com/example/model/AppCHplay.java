package com.example.model;

public class AppCHplay {
    private int id;
    private int appImg;//lưu trữ trực tiếp R.draw.image (ko cần getResource)
    //gán vào kiểu int, lấy ảnh kiểu image=getResource
    private String appName;
    private String appCompany;
    private double rating;

    public AppCHplay(int id, int appImg, String appName, String appCompany, double rating) {
        this.id = id;
        this.appImg = appImg;
        this.appName = appName;
        this.appCompany = appCompany;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAppImg() {
        return appImg;
    }

    public void setAppImg(int appImg) {
        this.appImg = appImg;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppCompany() {
        return appCompany;
    }

    public void setAppCompany(String appCompany) {
        this.appCompany = appCompany;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
