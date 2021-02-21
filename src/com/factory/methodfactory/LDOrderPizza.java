package com.factory.methodfactory;


public class LDOrderPizza extends OrderPizza_M {
	@Override
	Pizza createPizza(String orderType) {
		
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}
}
