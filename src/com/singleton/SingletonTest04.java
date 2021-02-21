package com.singleton;

/**
 * 懶漢式（線程安全，同步方法）
 *
 * 優缺點說明：
 * 1.解決了線程安全問題
 * 2.效率太低了，每個線程在想獲得類的實例的時候，執行getInstance()方法都要進行同步。而其實這個方法只執行一次
 * 實例化代碼就夠了，後面的想獲得該類實例，直接return就行了。方法進行同步效率太低。
 * 3.結論：在實際開發中，不推薦使用這種方法
 * */
public class SingletonTest04 {
    public static void main(String args[]){
        System.out.println("懶漢式 2 ， 線程安全，同步方法~");
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton4{
    private static Singleton4 instance;

    private Singleton4(){};

    /**
     * 提供一個靜態的公共方法，加入同步處理的代碼，解決線程安全問題
     * */
    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }

}
