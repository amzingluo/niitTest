package com.niit.po;

public class Login {
    private String countid;

    private String password;

    public String getCountid() {
        return countid;
    }

    public void setCountid(String countid) {
        this.countid = countid == null ? null : countid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}