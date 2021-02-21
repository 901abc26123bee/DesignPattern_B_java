package com.factory.methodfactory;

public class TWOrderPizza extends OrderPizza_M {
	@Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new TWCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new TWPepperPizza();
        }
        return pizza;
    }
}
