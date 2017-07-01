package com.sunshine.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Guo.WangHeng on 2017/6/30.
 */
public class UserInfo {

    private Integer id;
    private String username;
    private String password;
    private String telephone;
    private String status;
    private String crtime;


    
    public UserInfo() {
    }


    public void setId(Integer id) {
        this.id = id;
    }

    @NotBlank(message = "请填写手机号")
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {

        return telephone;
    }

    public UserInfo(Integer id, String username, String password, String telephone, String status, String crtime) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.status = status;
        this.crtime = crtime;
    }

    @NotBlank(message = "用户名不能为空")
    public void setUsername(String username) {

        this.username = username;
    }

    @NotBlank(message = "密码不能为空")
    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCrtime(String crtime) {
        this.crtime = crtime;
    }

    public Integer getId() {

        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public String getCrtime() {
        return crtime;
    }


}
