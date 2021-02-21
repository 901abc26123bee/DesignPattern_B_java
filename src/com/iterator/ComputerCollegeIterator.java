package com.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    Department[] departments; // 電腦工程學院是以 Array 方式存放系
    int position = 0; // 遍歷的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return !(position>=departments.length || departments[position]==null);
    }

    @Override
    public Object next() {
        Department department = null;
        if(hasNext()){
            department = departments[position];
            position++;
        }
        return department;
    }

    //刪除的方法，默認空實現
    public void remove() {

    }

}
