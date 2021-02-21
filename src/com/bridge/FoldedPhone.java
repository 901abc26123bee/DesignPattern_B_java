package com.bridge;

//折疊式手機類，繼承抽像類Phone
public class FoldedPhone extends Phone {
  //構造器
  public FoldedPhone(Brand mBrand) {
      super(mBrand);
  }

  public void open(){
      super.open();
      System.out.println("折疊式手機");
  }

  public void close(){
      super.close();
      System.out.println("折疊式手機");
  }

  public void call(){
      super.call();
      System.out.println("折疊式手機");
  }
}