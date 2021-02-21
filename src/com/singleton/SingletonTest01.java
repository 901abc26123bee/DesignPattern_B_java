package com.singleton;

/**
 * 餓漢式（靜態常量）
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
public class SingletonTest01 {
    public static void main(String args[]){
        //測試
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2); // true
        System.out.println("singleton1.hashCode =" + singleton1.hashCode()); // singleton1.hashCode =225534817
        System.out.println("singleton2.hashCode =" + singleton2.hashCode()); // singleton1.hashCode =225534817
    }
}


class Singleton{
    //1.構造器私有化，外部能new
    private Singleton(){
    }

    //2.本類內部創建對象實例
    private static final Singleton instance = new Singleton();

    //3.提供一個公有的靜態方法，返回實例對象
    public static Singleton getInstance(){
        return instance;
    }
}
