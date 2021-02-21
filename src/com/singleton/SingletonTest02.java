package com.singleton;

/**
 * 餓漢式（靜態代碼塊）
 *
 * 步驟如下：
 * 1.構造器私有化（防止new）
 * 2.類的內部創建對象
 * 3.向外暴露一個靜態的公共方法。
 *
 * 優缺點說明：
 * 1.優點：這種寫法比較簡單，就是在類加載的時候就完成實例化。避免了線程同步問題。
 * 2.缺點：在類裝載的時候完成實例化，沒有達到Lazy Loading的效果。如果從始至終從未使用過這個實例，
 * 則會造成內存的浪費。
 * 3.這種方式基於classloader機制避免了多線程同步的問題，不過，instance在類裝載時就實例化，在單例
 * 模式中大多數都是調用getInstance方法，但是導致類裝載的原因很多，因此不能確定有其它的方式（或其它的
 * 靜態方法）導致類加載，這時候初始化instance就沒有達到lazy loading的效果。
 * 4.結論：這種單例模式可用，可能造成內存浪費
 * */
public class SingletonTest02 {
    public static void main(String args[]){
        //測試
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode =" + singleton1.hashCode());
        System.out.println("singleton2.hashCode =" + singleton2.hashCode());
    }
}


class Singleton2{
    //1.構造器私有化，外部不能new
    private Singleton2(){
    }

    //2.創建內部類實例
    private static Singleton2 instance;
    static {
        //在靜態代碼塊中，創建單例對象
        instance = new Singleton2();
    }
    //3.提供一個公有的靜態方法，返回實例對象
    public static Singleton2 getInstance(){
        return instance;
    }
}