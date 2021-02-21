package com.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
    	// 1. 創建被代理對象（目標對象）
    	// 2. 創建代理對象，同時將 被代理對象 傳給代理對象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
    	// 3. 通過代理對象，調用被代理對象方法
    	// 即，執行的是代理對象的方法，代理對象再去調用 被代理對象（目標對象）的方法
        teacherDaoProxy.teach();
    }
}
