package com.singleton;

/**
 * 靜態內部類
 *
 * 優缺點說明：
 * 1.這種方式採用了類裝載的機制來保證初始化實例時只有一個線程。
 * 2.靜態內部類方式在Singleton類被裝載時並不會立即實例化，而是在需要實例化時，調用getInstance方法，
 * 才會裝載SingletonInstance類，從而完成Singleton的實例化
 * 3.類的靜態屬性只會在第一次加載類的時候初始化，所以在這裡，JVM幫助我們保證了線程的安全線，在類進行
 * 初始化時，別的線程是無法進入的。
 * 4.優點：避免了線程不安全，利用靜態內部類特點實現延遲加載，效率高
 * 5.結論：推薦使用
 * */
public class SingletonTest07 {
    public static void main(String args[]){
        System.out.println("使用靜態內部類完成單例模式");
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton7{
    private Singleton7(){};

    // 寫一個靜態內部類，該類中有一個靜態屬性 Singleton7
    // 靜態內部類方式在 Singleton7 類被裝載時並不會立即實例化，
    // 而是在需要實例化時，調用getInstance方法，才會裝載 SingletonInstance 類，從而完成 Singleton7 的實例化
    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    //提供一個靜態的公共方法，直接返回SingletonInstance.INSTANCE
    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}

