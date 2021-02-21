package com.factory.tradition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 傳統的方式的優缺點：
 * 1.優點比較好理解，簡單易操作
 * 2.缺點是違反了設計模式的OCP原則，即對擴展開放，對修改關閉，。即當我們給類增加新功能的時候，
 * 盡量不修改代碼，或者盡可能少修改代碼
 * 3.比如我們這時要新增加一個Pizza的種類，需要修改OrderPizza代碼
 * 4.改進的思路分析：
 * 分析：修改代碼可以接受，但是如果我們在其他的地方也有創建Pizza的代碼，就意味著也需要修改，
 * 而創建Pizza的代碼，往往有多處。
 * 思路：把創建Pizza對象分裝到一個類中，這樣我們有新的Pizza種類時，只需要修改該類就可以，其它
 * 有創建到Pizza對象的代碼不需要修改 -》 簡單工廠模式
 *
 *
 * */
public class OrderPizza {
    //構造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType = "";//訂購披薩的類型
        do {
            orderType = getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希臘披薩");
            }else if(orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披薩");
            }else if(orderType.equals("pepper")){
                pizza = new PepperPizza();
                pizza.setName("胡椒披薩");
            }else{
                break;
            }
            //輸出pizza製作過程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);

    }


    //寫一個方法，可以獲取客戶希望訂購的披薩種類
    private String getType(){
        try {
            BufferedReader strin =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 種類：");
            String str = strin.readLine();
            return str;
        }catch ( IOException e){
            e.printStackTrace();
            return "";
        }
    }
}

