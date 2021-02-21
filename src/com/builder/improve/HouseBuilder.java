package com.builder.improve;

//抽象的建造者
public abstract class HouseBuilder {
  protected House house = new House();

  //將建造的流程寫好，抽象的方法
  public abstract void buildBasic();
  public abstract void buildWalls();
  public abstract void roofed();

  //建造好房子，將產品返回
  public House buildHouse(){
      return house;
  }
}