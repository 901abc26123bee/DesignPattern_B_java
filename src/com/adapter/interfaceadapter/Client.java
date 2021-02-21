package com.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		AbsAdapter absAdapter = new AbsAdapter() {
			// 只需要去覆蓋我們需要使用的接口方法
			@Override
			public void m1() {
				System.out.println("use m1 method only");
			}
		};
		absAdapter.m1();
	}
}
