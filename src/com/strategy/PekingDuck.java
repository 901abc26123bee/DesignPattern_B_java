package com.strategy;

public class PekingDuck extends Duck {
    public PekingDuck() {
        super.flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("~~北京鴨~~~");
    }
}
