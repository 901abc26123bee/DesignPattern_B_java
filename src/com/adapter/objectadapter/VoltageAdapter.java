package com.adapter.objectadapter;

//適配器類
public class VoltageAdapter implements IVoltage5V {
  private Volate220V volate220V;//關聯關係-聚合

  //通過構造器，傳入一個Volate220V實例
  public VoltageAdapter(Volate220V volate220V) {
      this.volate220V = volate220V;
  }

  @Override
  public int output5V() {
      //獲得到220v電壓
      int dst = 0;
      if (volate220V != null){
          int srcV = volate220V.output220V();//獲取220v電壓
          System.out.println("使用對象適配器，進行適配~");
          dst = srcV / 44;//轉換成5V
          System.out.println("適配完成，輸出的電壓為="+dst);
      }

      return dst;
  }
}
