package com.factory.simplefactory;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println(" 胡椒披薩，準備中。。。");
    }
}
