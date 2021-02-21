package com.bridge;

public class Xiaomi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手機開機");
    }

    @Override
    public void close() {
        System.out.println("小米手機關機");
    }

    @Override
    public void call() {
        System.out.println("小米手機打電話");
    }
}