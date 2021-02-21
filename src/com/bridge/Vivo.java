package com.bridge;

public class Vivo implements Brand {

    @Override
    public void open() {
       System.out.println("Vivo手機開機");
    }

    @Override
    public void close() {
        System.out.println("Vivo手機關機");
    }

    @Override
    public void call() {
        System.out.println("Vivo手機打電話");
    }
}
