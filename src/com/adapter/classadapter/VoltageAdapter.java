package com.adapter.classadapter;

//適配器類
public class VoltageAdapter extends Volate220V implements IVoltage5V {
  @Override
  public int output5V() {
      //獲得到220v電壓
      int srcV = output220V();
      int dstV = srcV / 44;//轉換成5V
      return dstV;
  }
}