package com.singleton;

/**
 * 懶漢式（線程安全，雙重檢查）
 *
 * 優缺點說明：
 * 1.Double-Check概念是多線程開發中常使用到的，如代碼所示，我們進行了兩次if(instance == null)
 * 檢查，這樣就可以保證線程安全了。
 * 2.這樣，實例化代碼只用執行一次，後面再次訪問時，判斷if(instance == null),直接return實例化對象，
 * 也避免反復進行方法同步
 * 3.線程安全，延遲加載，效率較高
 * 4.結論：在實際開發中，推薦使用這種單例設計模式
 * */
public class SingletonTest06 {
    public static void main(String args[]){
        System.out.println("懶漢式 4 ，線程安全，雙重檢查~");
        Singleton6 instance1 = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton6{
	// 使用 volatile 可確保 Visibility – 共享資料的值被某執行緒更改時，其他執行緒可及時看見
    private static volatile Singleton6 instance;

    private Singleton6(){};

    /**
     * 提供一個靜態的公共方法，加入雙重檢查代碼，解決線程安全問題，同時解決懶加載問題
     * 同時保證了效率，推薦使用
     * */
    public static Singleton6 getInstance(){
        if(instance == null){ // 之後的批同步線程
            synchronized (Singleton6.class){
                if (instance == null){ // 第一批同步線程
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }

}
