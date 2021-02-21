package com.proxy.dynamic;

public class Client {

    public static void main(String[] args) {
    	// 1. 創建被代理對象（目標對象）
    	TeacherDao target = new TeacherDao();
    	// 2. 創建代理對象，同時將 被代理對象 傳給代理對象，可以強轉成 ITeacherDao
        Object proxyInstance = new ProxyFactory(target).getProxyInstance();
        ITeacherDao instance = (ITeacherDao) proxyInstance;
        
        // instance --> com.proxy.dynamic.TeacherDao@27716f4
        System.out.println(instance); 
        // Class --> class com.sun.proxy.$Proxy0 內存中動態生成的代理對象
        System.out.println("proxyInstance=" + proxyInstance.getClass()); 

        // 通過代理對象，調用目標對象方法
        // 兩次調用方法， 也就意味著兩次使用了invoke 反射。
        instance.teach();
        instance.sayHello("tom");
    }
}