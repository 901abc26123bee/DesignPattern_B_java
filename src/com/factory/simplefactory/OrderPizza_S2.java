package com.factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 靜態工廠模式
public class OrderPizza_S2 { 
	
    Pizza pizza = null;
    String orderType = "";// 用戶輸入的
    //構造器
    public OrderPizza_S2(){
    	do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType); // 靜態方法
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
