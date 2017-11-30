package com.example.times.model;

public class TimeUser {
    private int id;

    private String userid;

    private String username;

    private String password;

    private String userps;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserps() {
        return userps;
    }

    public void setUserps(String userps) {
        this.userps = userps == null ? null : userps.trim();
    }
}