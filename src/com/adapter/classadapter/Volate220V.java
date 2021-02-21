package com.adapter.classadapter;

//被適配的類
public class Volate220V {
  //輸出220v的電壓
  public int output220V(){
      int src = 220;
      System.out.println("電壓="+src + "伏");
      return src;
  }
}
