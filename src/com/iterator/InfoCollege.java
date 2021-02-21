package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class InfoCollege implements College {
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全專業", " 信息安全專業 ");
        addDepartment("網絡安全專業", " 網絡安全專業 ");
        addDepartment("服務器安全專業", " 服務器安全專業 ");
    }

    @Override
    public String getName() {
        return "InfoCollege 信息工程學院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }
}