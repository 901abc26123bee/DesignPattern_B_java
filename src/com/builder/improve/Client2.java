package com.builder.improve;


public class Client2 {
    public static void main(String[] args){
        //普通房子
        CommonHouse2 commonHouse = new CommonHouse2();

        //準備創建房子的指揮者
        HouseDirector houseDirector = new HouseDirector(commonHouse);


        //完成蓋房子，返回產品（普通房子）
        House house = houseDirector.constructHouse();

        System.out.println("----------------------");

        //蓋高樓
        HighBuilding2 highBuilding = new HighBuilding2();
        //重置建造者
        houseDirector.setHouseBuilder(highBuilding);
        //完成蓋房子，返回產品（高樓）
        houseDirector.constructHouse();
    }
}
