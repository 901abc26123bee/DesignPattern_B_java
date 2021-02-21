package com.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege() {
    	//  使用 java 內建 Iterator 
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("=== "+college.getName() +"=====" );
            printDepartment(college.createIterator()); //得到對應迭代器
        }
    }

    private void printDepartment(Iterator iterator) {
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }


}
