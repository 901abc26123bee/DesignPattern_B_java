package com.builder.improve;

public class HighBuilding2 extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 高樓的打地基 100 米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高樓的砌牆 20cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 高樓的透明屋頂 ");
    }
}
