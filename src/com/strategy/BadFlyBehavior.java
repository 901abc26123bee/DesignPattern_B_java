package com.strategy;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 飛翔技術一般 ");
    }
}
