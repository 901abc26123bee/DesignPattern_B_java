package com.adapter.classadapter;

public class Client {
    public static void main(String[] args){
        System.out.println("=========類適配器模式========");
        //VoltageAdapter voltageAdapter = new VoltageAdapter();
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}