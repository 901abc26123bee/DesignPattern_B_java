package com.decorator;

public class CoffeeBar {
    public static void main(String[] args){
        //裝飾者模式下的訂單：2份巧克力+1份牛奶的LongBlack

        //1.點一份LongBlack
        Drink drink = new LongBlack();
        System.out.println("費用=" + drink.cost());
        System.out.println("描述="+ drink.getDes());

        //2.加一份牛奶
        drink = new Milk(drink);
        System.out.println("加入一份牛奶 費用= " + drink.cost());
        System.out.println(" 加入一份牛奶 描述= "+ drink.getDes());

        //3.加一份巧克力
        drink = new Chocolate(drink);
        System.out.println("加入一份巧克力 費用= " + drink.cost());
        System.out.println(" 加入一份巧克力 描述= "+ drink.getDes());

        // 4. order 加入一份巧克力
        drink = new Chocolate(drink);
        System.out.println("order 加入一份牛奶 加入 2 份巧克力 費用 =" + drink.cost());
        System.out.println("order 加入一份牛奶 加入 2 份巧克力 描述 = " + drink.getDes());

        System.out.println("===========================");
        Drink order2 = new DeCaf();
        System.out.println("order2 無因咖啡 費用 =" + order2.cost());
        System.out.println("order2 無因咖啡 描述 = " + order2.getDes());
        order2 = new Milk(order2);
        System.out.println("order2 無因咖啡 加入一份牛奶 費用 =" + order2.cost());
        System.out.println("order2 無因咖啡 加入一份牛奶 描述 = " + order2.getDes());


    }
}