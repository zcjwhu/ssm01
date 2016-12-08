package com.ajin.vo;


public class UserVo {
    private String username;
    private String password;
    private String repeatpwd;

    public String getRepeatpwd() {
        return repeatpwd;
    }

    public void setRepeatpwd(String repeatpwd) {
        this.repeatpwd = repeatpwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}