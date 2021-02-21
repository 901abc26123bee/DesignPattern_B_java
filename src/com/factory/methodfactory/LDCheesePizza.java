package com.factory.methodfactory;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        setName("倫敦奶酪披薩");
        System.out.println("倫敦奶酪披薩，準備中。 。 。");
    }
}
