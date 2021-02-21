package com.decorator;

//具體的Decorator，這裡就是調味品
public class Chocolate extends Decorator {

  public Chocolate(Drink drink) {
      super(drink);
      setDes("巧克力");
      setPrice(3.0f);//調味品的價格
  }
}

