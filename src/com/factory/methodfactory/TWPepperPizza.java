package com.factory.methodfactory;

public class TWPepperPizza  extends Pizza {
	@Override
    public void prepare() {
        super.prepare();
        setName("TW胡椒披薩");
        System.out.println("TW胡椒披薩，準備中。。。");
    }
}
