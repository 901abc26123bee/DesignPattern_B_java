package com.state;

import java.util.Random;
// 可以抽獎狀態
public class CanRaffleState extends State {
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已經扣取過了積分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽獎，請稍等！");
        int nextInt = new Random().nextInt(10); // 10% 中獎機率
        if(nextInt>0 && nextInt<=5){
            // 改變活動狀態為發放獎品 context
            activity.setState(activity.getDispenseState());
            return true;
        }else {
            System.out.println("很遺憾沒有抽中獎品！");
            // 改變活動狀態為不能抽獎
            activity.setState(activity.getNoRafflleState());
            return false;
        }

    }

    @Override
    public void dispensePrize() {
        System.out.println("沒中獎，不能發放獎品");
    }
}