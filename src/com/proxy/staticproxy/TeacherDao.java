package com.proxy.staticproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println(" 老師授課中 。。。。。");
    }
}
