package com.shenlan.entity;

/**
 * 画师.
 *
 * @author Marting.Lee
 * 2020/9/28
 */
public class Painter {
    private String user_account;
    private String painting_style;
    private String category;
    private String painting_circle;
    private int authentication;//是否认证

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getPainting_style() {
        return painting_style;
    }

    public void setPainting_style(String painting_style) {
        this.painting_style = painting_style;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPainting_circle() {
        return painting_circle;
    }

    public void setPainting_circle(String painting_circle) {
        this.painting_circle = painting_circle;
    }

    public int getAuthentication() {
        return authentication;
    }

    public void setAuthentication(int authentication) {
        this.authentication = authentication;
    }
}
