package com.factory.simplefactory;

public class TestSimpleFactory {
    public static  void main(String[] args){
    	// 簡單工廠模式
//        SimpleFactory simpleFactory = new SimpleFactory();
//        new OrderPizza_S(simpleFactory); 
        
        // 靜態工廠模式
        new OrderPizza_S2(); 
    }
}