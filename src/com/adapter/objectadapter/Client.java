package com.adapter.objectadapter;

public class Client {
    public static void main(String[] args){
        System.out.println("=========對象適配器模式========");
        // VoltageAdapter voltageAdapter = new VoltageAdapter(new Volate220V());
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Volate220V()));
    }
}
