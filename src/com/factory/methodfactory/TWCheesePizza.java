package com.factory.methodfactory;

public class TWCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        setName("TW奶酪披薩");
        System.out.println("TW奶酪披薩，準備中。。。");
    }
}
