package com.singleton;

/**
* 枚舉類型
*
* 優缺點說明：
* 1. 這借助JDK1.5中添加的枚舉類來實現單例模式。不僅能避免多線程同步問題，
* 而且還能防止反序列化重新創建新的對象。
* 2.這種方式是Effective Java作者Josh Bloch提倡的方式。
* 3.結論：推薦使用
* */
public class SingletonTest08 {
   public static void main(String args[]){
       System.out.println("使用枚舉");
       Singleton8 instance1 = Singleton8.INSTANCE;
       Singleton8 instance2 = Singleton8.INSTANCE;
       System.out.println(instance1 == instance2);
       System.out.println("instance1.hashCode = " + instance1.hashCode());
       System.out.println("instance2.hashCode = " + instance2.hashCode());

       instance1.sayOk();
   }
}

//使用枚舉，可以實現單例，推薦使用
enum Singleton8{
   INSTANCE;//屬性
   public void sayOk(){
       System.out.println("ok~");
   }
}