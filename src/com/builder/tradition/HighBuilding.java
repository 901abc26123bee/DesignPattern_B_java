package com.builder.tradition;

//修建高樓
public class HighBuilding extends AbstractHouse {
  @Override
  public void buildBasic() {
  System.out.println("修建高樓打地基");
  }

  @Override
  public void buildWalls() {
      System.out.println("修建高樓砌牆");

  }

  @Override
  public void roofed() {
      System.out.println("修建高樓封頂");
  }
}