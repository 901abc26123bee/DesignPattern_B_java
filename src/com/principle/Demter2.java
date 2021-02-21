package com.principle;

import java.util.ArrayList;
import java.util.List;

/**
 * 應用實例改進：
 * 1) 前面設計的問題在於SchoolManager中，CollegeEmployee類並不是SchoolManager類的直接朋友(分析)
 * 2) 按照迪米特法則，應該避免類中出現這樣非直接朋友關係的耦合
 * 3) 對代碼按照迪米特法則進行改進.(看老師演示)
 * 4) 代碼演示
 */
public class Demter2 {
    public static void main(String[] args) {
//創建了一個 SchoolManager 對象
        SchoolManager schoolManager = new SchoolManager();
        //輸出學院的員工 id 和 學校總部的員工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//學校總部員工類
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//學院的員工類
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//管理學院員工的管理類
class CollegeManager {
    //返回學院的所有員工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) { //這裡我們增加了 10 個員工到 list
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("學院員工 id= " + i);
            list.add(emp);
        }
        return list;
    }

    //輸出學院員工的信息
    public void printEmployee() {
//獲取到學院員工
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("------------學院員工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}


//學校管理類
//分析 SchoolManager 類的直接朋友類有哪些 Employee、CollegeManager
// CollegeEmployee 不是 直接朋友 而是一個陌生類，這樣違背了 迪米特法則
class SchoolManager {
    //返回學校總部的員工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) { //這裡我們增加了5個員工到 list
            Employee emp = new Employee();
            emp.setId("學校總部員工 id= " + i);
            list.add(emp);
        }
        return list;
    }

    //該方法完成輸出學校總部和學院員工信息(id)
    void printAllEmployee(CollegeManager sub) {
//分析問題
//1. 將輸出學院的員工方法，封裝到 CollegeManager
        sub.printEmployee();
//獲取到學校總部員工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------學校總部員工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
