package com.state;

public class DispenseOutState extends State{
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("獎品發送完了，請下次再參加");
    }

    @Override
    public boolean raffle() {
        System.out.println("獎品發送完了，請下次再參加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("獎品發送完了，請下次再參加");
    }
}