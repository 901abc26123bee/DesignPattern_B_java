package com.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoColleageIterator implements Iterator {
    List<Department> departmentList; // 信息工程學院是以 List 方式存放系
    int index = -1; // 索引

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1)
            return false;
        else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    //空實現remove
    public void remove() {

    }
}