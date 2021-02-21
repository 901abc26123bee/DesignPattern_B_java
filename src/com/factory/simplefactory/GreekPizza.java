package com.factory.simplefactory;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println(" 希臘披薩，準備中。。。");
    }
}