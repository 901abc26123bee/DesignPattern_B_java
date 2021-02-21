package com.factory.methodfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  把對象的實例化推遲到子類
 * */

public abstract class OrderPizza_M {
    //定義一個抽象方法，createPizza , 讓各個工廠子類自己實現
    abstract Pizza createPizza(String orderType);

    // 構造器
    public OrderPizza_M() {
        Pizza pizza = null;
        String orderType;
        // 訂購披薩的類型
        do {
            orderType = getType();
            pizza = createPizza(orderType); //抽象方法，由工廠子類完成 //輸出 pizza 製作過程
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("訂購失敗。。");
                break;
            }

        } while (true);
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