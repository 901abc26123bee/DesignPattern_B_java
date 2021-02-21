package com.iterator;

import java.util.Iterator;

public interface College {
    String getName();
    void addDepartment(String name, String desc);
    Iterator createIterator(); // 返回一個迭代器,遍歷
}