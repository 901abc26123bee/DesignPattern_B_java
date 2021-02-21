package com.singleton;

/**
 * 懶漢式（線程安全，同步代碼塊）
 *
 * 本意想改進 Singleton4懶漢式（線程安全，同步方法）效率太低的問題，但這種同步並不能起到多線程同步作用，
 * 問題和Singleton3一樣，一個線程進入了if(instance == null)判斷語句塊，還未來得及往下執行，另一個
 * 線程也通過了這個判斷語句，這時候便會產產生多個實例。
 * 
 * 開發中，不推薦使用這種方法
 * */
public class SingletonTest05 {
    public static void main(String args[]){
        System.out.println("懶漢式 3 ，線程安全，同步代碼塊~");
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton5{
    private static Singleton5 instance;

    private Singleton5(){};

    /**
     * 提供一個靜態的公共方法
     * */
    public static Singleton5 getInstance(){
        if(instance == null){
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }

}