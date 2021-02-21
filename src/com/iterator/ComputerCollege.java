package com.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    int numOfDepartment = 0;// 保存當前數組的對像個數

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java專業", " Java專業 ");
        addDepartment("PHP專業", " PHP專業 ");
        addDepartment("大數據專業", " 大數據專業 ");
    }

    @Override
    public String getName() {
        return "ComputerCollege 計算機學院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        if (numOfDepartment >= departments.length)
            return;
        departments[numOfDepartment] = new Department(name, desc);
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
