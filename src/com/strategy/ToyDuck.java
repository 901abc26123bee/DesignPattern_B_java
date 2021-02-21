package com.strategy;

public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鴨");
    }

    @Override
    public void quack() {
        System.out.println("玩具鴨不能叫~~");
    }

    @Override
    public void swim() {
        System.out.println("玩具鴨不會游泳~~");
    }
}
