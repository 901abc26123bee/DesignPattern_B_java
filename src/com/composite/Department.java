package com.composite;

public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }
    
    // add , remove 就不用寫了，因為他是葉子節點
    
    @Override
    protected void print() {
        System.out.println(getName());
    }
}