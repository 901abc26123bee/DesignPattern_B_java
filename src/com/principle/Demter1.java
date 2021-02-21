package com.principle;

import java.util.ArrayList;
import java.util.List;

public class Demter1 {
	public static void main(String[] args) {
		//創建了一個 SchoolManager 對象
		SchoolManager1 schoolManager1 = new SchoolManager1();
		// 輸出學院的員工 id 和 學校總部的員工信息
		schoolManager1.printAllEmployee(new CollegeManager1());
	}
}

//學校總部員工類
class Employee1 {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//學院的員工類
class CollegeEmployee1 {
	private String id;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}

//管理學院員工的管理類
class CollegeManager1 {
	// 返回學院的所有員工
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) { // 這裡我們增加了 10 個員工到 list
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("學院員工 id= " + i);
			list.add(emp);
		}
		return list;
	}
}

//學校管理類
//分析 SchoolManager 類的直接朋友類有哪些 Employee、CollegeManager
// CollegeEmployee 不是 直接朋友 而是一個陌生類，這樣違背了 迪米特法則
class SchoolManager1 {
	// 返回學校總部的員工
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 0; i < 5; i++) { // 這裡我們增加了5個員工到 list
			Employee emp = new Employee();
			emp.setId("學校總部員工 id= " + i);
			list.add(emp);
		}
		return list;
	}

	// 該方法完成輸出學校總部和學院員工信息(id)
	void printAllEmployee(CollegeManager1 sub) {
	//分析問題
	//1. 這裡的 CollegeEmployee 不是 SchoolManager 的直接朋友
	//2. CollegeEmployee 是以局部變量方式出現在 SchoolManager
	//3. 違反了 迪米特法則
	//獲取到學院員工
		List<CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("------------學院員工------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
//獲取到學校總部員工
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------學校總部員工------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
