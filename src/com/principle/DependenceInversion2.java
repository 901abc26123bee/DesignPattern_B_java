package com.principle;

import org.junit.jupiter.api.Test;

public class DependenceInversion2 {
	@Test
	public void test() {
		Person person = new Person();
		person.receive(new Email());
		
		TypeTV1 tv = new TypeTV1();
		Controller1 controller1 = new Controller1();
		controller1.open(tv);
		
		TypeTV2 tv2 = new TypeTV2();
		Controller2 controller2 = new Controller2(tv2);
		controller2.open();
		
		TypeTV3 tv3 = new TypeTV3();
		Controller3 controller3 = new Controller3();
		controller3.setTV(tv3);
		controller3.open();
	}
}

//class Email implements IReceiver{
//	public String getInfo() {
//		return "Email message";
//	}
//}
//class Person{
//	public void receive(Email email) {
//		System.out.println(email.getInfo());
//	}
//}

// Dependency_Reverce 改量後--> 依賴接口而非對象
interface IReceiver{
	public String getInfo();
}

class Email implements IReceiver{
	public String getInfo() {
		return "Email message";
	}
}

class Person{
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}

// 1. 通過接口傳遞依賴
interface IOpenAndClose_1{
	public void open(ITV_1 tv);
}
interface ITV_1{
	public void play();
}

class TypeTV1 implements ITV_1{
	@Override
	public void play() {
		System.out.println("open TypeTV1");
	}
}
class Controller1 implements IOpenAndClose_1{
	public void open(ITV_1 tv) {
		tv.play();
	}
}


// 2. 通過構造器傳遞依賴
interface IOpenAndClose_2{
	public void open();
}
interface ITV_2{
	public void play();
}

class TypeTV2 implements ITV_2{
	@Override
	public void play() {
		System.out.println("open TypeTV2");
	}
}
class Controller2 implements IOpenAndClose_2{
	public ITV_2 tv;
	
	public Controller2(ITV_2 tv) {
		this.tv = tv;
	}
	public void open() {
		tv.play();
	}
}


// 3. 通過setter方法傳遞依賴
interface IOpenAndClose_3{
	public void open();
}
interface ITV_3{
	public void play();
}


class TypeTV3 implements ITV_3{
	@Override
	public void play() {
		System.out.println("open TypeTV3");
	}
}
class Controller3 implements IOpenAndClose_3{
	public ITV_3 tv;
	
	public void setTV(ITV_3 tv) {
		this.tv = tv;
	}
	public void open() {
		tv.play();
	}
}

