package com.lxx.service;

public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("添加了一个用户！");
    }

    public void delete() {
        System.out.println("删除了一个用户！");
    }

    public void update() {
        System.out.println("更改了一个用户！");
    }

    public void query() {
        System.out.println("查询了一个用户！");
    }
}