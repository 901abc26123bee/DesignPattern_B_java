package com.principle;

public class DependenceInversion1 {
    public static void main(String args[]){
        Person1 person = new Person1();
        person.receive(new Email1());
    }
}

class Email1{
    public String getInfo(){
        return "電子郵件信息：hello, world";
    }
}

/**
 * 完成Person接收消息的功能
 * 方式1分析：
 * 1.簡單，比較容易想到
 * 2.如果我們獲取的對像是微信、短信、等等，則新增類，同時Person也要增加相應的接收方法
 * 3.解決思路：引入一個抽象的接口IRecive,表示接受者，這樣Person類與接口IReceive發生依賴
 * 以為Email、微信等等屬於接收的範圍，他們各自實現IReciver接口就OK，這樣我們就符合依賴倒轉原則
 *
 * */
class Person1{
    public void receive(Email1 email){
        System.out.println(email.getInfo());
    }
}