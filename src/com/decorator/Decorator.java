package com.decorator;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        //組合
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        //drink.getDes() 輸出被封裝者的信息
        //return des+" " + getPrice() + " &&" + drink.getDes();  same as
        return super.des+" " + super.getPrice() + " &&" + drink.getDes();
    }
}