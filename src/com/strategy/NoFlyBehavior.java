package com.strategy;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 不會飛翔 ");
    }
}