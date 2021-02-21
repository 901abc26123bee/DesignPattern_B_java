package com.builder.tradition;

public class Client_Builder {
    public static void main(String[] args){
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        System.out.println("---------------------");
        HighBuilding highBuildHouse = new HighBuilding();
        highBuildHouse.build();

    }
}