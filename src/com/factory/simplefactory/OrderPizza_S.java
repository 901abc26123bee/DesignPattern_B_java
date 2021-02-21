package com.factory.simplefactory;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
//簡單工廠模式
public class OrderPizza_S { 


    //定義一個簡單工廠對象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    //構造器
    public OrderPizza_S(SimpleFactory factory){
        setFactory(factory);
     }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";// 用戶輸入的
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            //輸出Pizza
            if (pizza != null){//訂購成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("訂購披薩失敗 ");
                break;
            }
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

