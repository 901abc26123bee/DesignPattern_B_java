package com.state;

public class ClientTest {

    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(1);
        for (int i = 0; i < 20; i++) {
            System.out.println("--------第 " + (i + 1) + " 次抽獎----------");
            raffleActivity.debuctMoney();
            raffleActivity.raffle();
        }
    }

}