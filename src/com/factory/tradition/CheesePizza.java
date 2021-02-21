package com.factory.tradition;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println(" 奶酪披薩，準備中。。。");
    }
}