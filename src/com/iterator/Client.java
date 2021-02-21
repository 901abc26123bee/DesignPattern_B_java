package com.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();
        collegeList.add(new ComputerCollege());
        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
        
        System.out.println("***********************");
        collegeList.add(new InfoCollege());
        outPut.printCollege();
    }
}
