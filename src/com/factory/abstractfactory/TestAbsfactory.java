package com.factory.abstractfactory;

public class TestAbsfactory {
    public static void main(String[] args){
        LD_AbsFabtory ldFactory = new LD_AbsFabtory();
        TW_AbsFactory taFactory = new TW_AbsFactory();
        new OrderPizza_Abs(taFactory);

    }
}
