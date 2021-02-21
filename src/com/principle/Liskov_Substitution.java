package com.principle;

import org.junit.Test;


public class Liskov_Substitution {
	@Test
	public void test() {		
		E e = new E();
		System.out.println("11-3= "+e.func1(11, 3));
		
		F f = new F();
		System.out.println("11+3= "+f.func1(11, 3));
		System.out.println("11-3= "+f.func3(11, 3));
	}
}

class Base{
	
}

class E extends Base{
	public int func1(int num1, int num2) {
		return num1-num2;
	}
}

class F extends Base{
	private E e = new E();// 組合
	// 重寫了Ａ類方法，錯誤示範
	public int func1(int a, int b) {
		return a+b;
	}
	public int func2(int a, int b) {
		return func1(a, b)+9;
	}

	public int func3(int a, int b) {
		return this.e.func1(a, b);
	}
}