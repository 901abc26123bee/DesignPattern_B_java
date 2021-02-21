package com.factory.methodfactory;

public class Pizza {

    private String name = "";

    public void setName(String name){
        this.name = name;
    }

    public void prepare(){

    }

    public void bake(){
     System.out.println(name + " 燒烤中。。。");
    }

    public void cut(){
        System.out.println(name + " 切割。。。");
    }

    public void box(){
        System.out.println(name + " 打包。。。");
    }
}