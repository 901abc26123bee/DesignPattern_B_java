package com.bridge;

public class Client {
    public static void main(String[] args){
        //獲取折疊式手機（樣式+品牌）

        Phone phone1 = new FoldedPhone(new Xiaomi());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("==========================");
        Phone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
        System.out.println("==========================");

        Phone phone3 = new UpRightPhone(new Xiaomi());
        phone3.open();
        phone3.call();
        phone3.close();
        System.out.println("==========================");
        Phone phone4 = new UpRightPhone(new Vivo());
        phone4.open();
        phone4.call();
        phone4.close();
    }
}