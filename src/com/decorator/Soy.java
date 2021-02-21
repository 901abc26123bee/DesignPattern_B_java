package com.decorator;

public class Soy extends Decorator {

    public Soy(Drink drink) {
        super(drink);
      setDes("豆漿");
      setPrice(1.5f);
    }
}