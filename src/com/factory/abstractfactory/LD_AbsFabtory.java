package com.factory.abstractfactory;

//這是工廠子類
public class LD_AbsFabtory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用的是抽象工廠模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
