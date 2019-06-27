package com.huge.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:变量描述
 * Author:胡正林823865618@qq.com)
 * Date:2019/6/22-18:03
 */
public class User {
    private int uid;
    private String uname;
    private String upassword;
    private String sex;
    private Date birthdate;
    private String address;
    private List<Account> account= new ArrayList<Account>();

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public User(int uid, String uname, String upassword, String sex, Date birthdate, String address, List<Account> account) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.sex = sex;
        this.birthdate = birthdate;
        this.address = address;
        this.account = account;
    }

    public User() {
    }

    public User(String uname, String upassword, String sex, Date birthdate, String address, List<Account> account) {
        this.uname = uname;
        this.upassword = upassword;
        this.sex = sex;
        this.birthdate = birthdate;
        this.address = address;
        this.account = account;
    }

    public User(int uid, String uname, String upassword, String sex, Date birthdate, String address) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.sex = sex;
        this.birthdate = birthdate;
        this.address = address;
    }

    public User(String uname, String upassword, String sex, Date birthdate, String address) {
        this.uname = uname;
        this.upassword = upassword;
        this.sex = sex;
        this.birthdate = birthdate;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", sex='" + sex + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", account=" + account +
                '}';
    }
}
