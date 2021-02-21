package com.proxy.cglib;

public class TeacherDao {
    public String teach() {
        System.out.println(" 老師授課中 ， 我是cglib代理，不需要實現接口 ");
        return "hello";
    }
}