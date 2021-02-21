package com.interpreter;

import java.util.HashMap;
//抽象表達式，通過 HashMap 鍵值對，可以獲取變量的值
public abstract class Expression {
	// a+b-c
	// 解釋公視和數值， key：就是公式（表達式） 參數[a, b, c], value：就是具體的值
	// HashMap {a=10 b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}