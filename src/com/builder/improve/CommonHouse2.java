package com.builder.improve;

public class CommonHouse2 extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基 5 米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌牆 10cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子屋頂 ");
    }
}