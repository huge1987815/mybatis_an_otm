package com.huge.entity;

/**
 * Description:变量描述
 * Author:胡正林823865618@qq.com)
 * Date:2019/6/27-15:07
 */
public class Account {
    private int aid;
    private int uid;
    private double money;
    private User user;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account(int aid, int uid, double money, User user) {
        this.aid = aid;
        this.uid = uid;
        this.money = money;
        this.user = user;
    }

    public Account() {
    }

    public Account(int uid, double money, User user) {
        this.uid = uid;
        this.money = money;
        this.user = user;
    }

    public Account(int aid, int uid, double money) {
        this.aid = aid;
        this.uid = uid;
        this.money = money;
    }

    public Account(int uid, double money) {
        this.uid = uid;
        this.money = money;
    }

    public Account(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}
