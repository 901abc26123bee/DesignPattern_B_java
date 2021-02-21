package com.singleton;

/**
 * 懶漢式（線程不安全）
 *
 * 優缺點說明：
 * 1.起到了Lazy Loading的效果，但是只能在單線程下使用
 * 2.如果在多線程下，一個線程進入了if(instance == null)判斷語句塊，還未來得及往下執行，另一個
 * 線程也通過了這個判斷語句，這時候便會產產生多個實例。所以在多線程環境下不可使用這種方法。
 * 3.結論：在實際開發中，不要使用這種方法
 * */
public class SingletonTest03 {
    public static void main(String args[]){
        System.out.println("懶漢式 1 ， 線程不安全~");
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

class Singleton3{
    private static Singleton3 instance;

    private Singleton3(){};

    /**
     * 提供一個靜態的公共方法，當使用到該方法時，才去創建instance
     * */
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }

}
