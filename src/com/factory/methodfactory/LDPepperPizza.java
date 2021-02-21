package com.factory.methodfactory;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        setName("倫敦胡椒披薩");
        System.out.println("倫敦胡椒披薩，準備中。。。");
    }
}
