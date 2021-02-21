package com.proxy.staticproxy;

/**
 * 靜態代理
 */
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target; // 目標對象，通過接口來聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
    	System.out.println("static proxy starting ...");
        target.teach();
        System.out.println("static proxy end");
    }
}
