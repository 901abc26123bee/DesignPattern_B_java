package com.factory.abstractfactory;

//這是工廠子類
public class TW_AbsFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用的是抽象工廠模式~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new TWCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new TWPepperPizza();
		}
		return pizza;
	}
}