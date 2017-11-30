package com.example.times.model;

import java.util.Date;

public class Account {
    //用户id
    private String id;
    //用户名
    private String userName;
    //密码
    private String password;
    //电话号码
    private String phoneNum;
    //角色id
    private String roleId;
    //身份证号
    private String certNo;
    //申请状态
    private int status;
    //创建时间
    private Date createTime;
    //上次修改时间
    private Date updateTime;
    //账号会员积分
    private int vipScores;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getVipScores() {
        return vipScores;
    }

    public void setVipScores(int vipScores) {
        this.vipScores = vipScores;
    }
}
