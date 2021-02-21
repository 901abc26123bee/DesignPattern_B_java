package com.factory.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza_Abs {
	AbsFactory factory;

	// 構造器
	public OrderPizza_Abs(AbsFactory factory) {
		setFactory(factory);
	}

	private void setFactory(AbsFactory factory) {
		Pizza pizza = null;
		String orderType = "";// 用戶輸入
		this.factory = factory;
		do {
			orderType = getType();
			// factory可能是北京的工廠子類，也可能是倫敦的工廠子類
			pizza = factory.createPizza(orderType);
			if (pizza != null) {
				// 訂購成功
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				// 訂購失敗
				System.out.println("訂購失敗！");
				break;
			}
		} while (true);

	}

	// 寫一個方法，可以獲取客戶希望訂購的披薩種類
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 種類：");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
