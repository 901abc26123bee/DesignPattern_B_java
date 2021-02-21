package com.bridge;

//直立式手機類，繼承抽像類Phone
public class UpRightPhone extends Phone {
  //構造器
  public UpRightPhone(Brand mBrand) {
      super(mBrand);
  }

  public void open(){
      super.open();
      System.out.println("直立式手機");
  }

  public void close(){
      super.close();
      System.out.println("直立式手機");
  }

  public void call(){
      super.call();
      System.out.println("直立式手機");
  }
}
